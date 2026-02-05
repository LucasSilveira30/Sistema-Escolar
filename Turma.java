import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma {// relação simples com Aluno
    private String nomeTurma;
    private List<Aluno> alunos = new ArrayList<Aluno>();
    Scanner scanner = new Scanner(System.in);
    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int quantidadeAlunos() {
        return alunos.size();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.setTurma(this);
    }

    public void apagarAluno(){
        System.out.println("---Apagar aluno---");
         System.out.println("\nEscolha o aluno:");
            for (int i = 0; i < alunos.size(); i++) {
                System.out.println(i + " - " + alunos.get(i).getNome());
            }
        System.out.println("Número do aluno: ");
        int opcao = scanner.nextInt();
        alunos.remove(alunos.get(opcao));
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public Aluno getAluno(){ //////////////////////////////////////////////Polimorfismo Estático
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(i + "- " + alunos.get(i).getNome());
        }
        System.out.println("Qual é o aluno a ser selecionado?");
        int resposta = scanner.nextInt();
        return alunos.get(resposta);
    }

    public Aluno getAluno(int index) {//////////////////////////////////////Polimorfismo Estático
        return alunos.get(index);
    }
}
