import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {//relação direcionada com Disciplina
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    
    public Professor(String nome, String cpf, String dataDeNascimento, int idade) {
        super(cpf, idade, dataDeNascimento, nome);
    }
    
    public void addDisciplina(String descricao) {
        this.disciplinas.add(new Disciplina(descricao));
    }

    @Override
    public void listarDados() {/////////////////////////////////////////////Polimorfismo Dinâmico
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("Data de Nascimento: " + getDataDeNascimento());
        System.out.println("Disciplinas: ");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getDescricaoDisciplina());
        }
    }
    @Override
        public String getIdentificacao() {
            return "Professor: " + getNome() + " - " + "CPF: " + getCpf() + " - " + "Idade: " + getIdade() + " - "
                    + "Data de nascimento: " + getDataDeNascimento() + " - ";
        }
}
