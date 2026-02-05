import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecione a opção desejada: ");
        List<Turma> turmas = new ArrayList<Turma>();
        List<Professor> professores = new ArrayList<Professor>();

        // Criar turmas iniciais
        Turma novaTurma = new Turma("1A");
        turmas.add(novaTurma);
        novaTurma = new Turma("1B");
        turmas.add(novaTurma);
        novaTurma = new Turma("1C");
        turmas.add(novaTurma);

        // Criar alunos iniciais
        String nome = "João da Silva dos Santos";
        String cpf = "50135501350";
        String dataDeNascimento = "01/01/2000";
        int idade = 25;

        int opcao = 1;

        Aluno joao = new Aluno(nome, cpf, dataDeNascimento, idade);
        turmas.get(opcao).adicionarAluno(joao);
        joao.adicionarNota(1, 1, 3);
        joao.adicionarNota(1, 1, 2);
        joao.adicionarNota(1, 1, 3);
        joao.adicionarNota(1, 1, 7);

        nome = "Joana da Silva dos Santos";
        cpf = "10101010101";
        dataDeNascimento = "01/01/2000";
        idade = 28;
        ;
        opcao = 1;

        Aluno joana = new Aluno(nome, cpf, dataDeNascimento, idade);
        joana.adicionarNota(1, 1, 1);
        joana.adicionarNota(1, 1, 2);
        joana.adicionarNota(1, 1, 3);
        joana.adicionarNota(1, 1, 4);
        turmas.get(opcao).adicionarAluno(joana);

        nome = "Michael jackson";
        cpf = "hee hee";
        dataDeNascimento = "29 de agosto de 1958";
        idade = 50;

        opcao = 2;

        Aluno novoAluno = new Aluno(nome, cpf, dataDeNascimento, idade);
        turmas.get(opcao).adicionarAluno(novoAluno);

        nome = "Walter Hartwell White (aka Heisenberg)";
        cpf = "09909909911";
        dataDeNascimento = "7 de setembro de 1958";
        idade = 52;

        opcao = 2;

        novoAluno = new Aluno(nome, cpf, dataDeNascimento, idade);
        turmas.get(opcao).adicionarAluno(novoAluno);

        nome = "Werner Karl Heisenberg";
        cpf = "11111111111";
        dataDeNascimento = "5 de dezembro de 1901";
        idade = 74;

        opcao = 2;

        novoAluno = new Aluno(nome, cpf, dataDeNascimento, idade);
        turmas.get(opcao).adicionarAluno(novoAluno);

        nome = "Rick sanchez";
        cpf = "00000000000";
        dataDeNascimento = "01/01/2001";
        idade = 999;

        opcao = 2;

        novoAluno = new Aluno(nome, cpf, dataDeNascimento, idade);
        turmas.get(opcao).adicionarAluno(novoAluno);

        // Criar professores iniciais
        Professor novoProfessor = new Professor("Mark S", "8888888888", "12/02/2002", 35);
        novoProfessor.addDisciplina("História");
        professores.add(novoProfessor);
        System.out.println("Professor adicionado com sucesso!\n");

        novoProfessor = new Professor("Gemma", "8888888881", "12/02/2002", 36);
        novoProfessor.addDisciplina("matemática");
        novoProfessor.addDisciplina("Geometria");
        professores.add(novoProfessor);
        System.out.println("Professor adicionado com sucesso!\n");

        novoProfessor = new Professor("Girafales", "99887766101", "13/02/2002", 35);
        novoProfessor.addDisciplina("Portugês");
        novoProfessor.addDisciplina("Química");
        novoProfessor.addDisciplina("Biologia");
        novoProfessor.addDisciplina("Ingles");
        novoProfessor.addDisciplina("Geografia");
        novoProfessor.addDisciplina("Filosofia");
        professores.add(novoProfessor);
        System.out.println("Professor adicionado com sucesso!\n");

        // Menu principal
        int opcaoMenu;
        boolean sair = false;

        while (!sair) {
            System.out.println("\nSelecione a opção desejada: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Cadastrar professor");
            System.out.println("3 - Cadastrar turma");
            System.out.println("4 - Apagar aluno");
            System.out.println("5 - Apagar turma");
            System.out.println("6 - Apagar professor");
            System.out.println("7 - Criar atividade para aluno");
            System.out.println("8 - Listar alunos");
            System.out.println("9 - Listar professores");
            System.out.println("10 - Listar turmas");
            System.out.println("11 - Listar todos");
            System.out.println("12 - Média bimestral");
            System.out.println("13 - Média final");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    adicionarAluno(turmas);
                    break;
                case 2:
                    adicionarProfessor(professores);
                    break;
                case 3:
                    adicionarTurma(turmas);
                    break;
                case 4:
                    apagarAluno(turmas);
                    break;
                case 5:
                    apagarTurma(turmas);
                    break;
                case 6:
                    apagarProfessor(professores);
                    break;
                case 7:
                    adicionarNota(turmas);
                    break;
                case 8:
                    listarAlunos(turmas);
                    break;
                case 9:
                    listarProfessores(professores);
                    break;
                case 10:
                    listarTurmas(turmas);
                    break;
                case 11:
                    System.out.println("Alunos:");
                    listarAlunos(turmas);
                    System.out.println("Professores:");
                    listarProfessores(professores);
                    break;
                case 12:
                    mediaBi(turmas);
                    break;
                case 13:
                    calcularMediaFinal(turmas);
                    break;
                default:
                    System.out.println("Isso não é uma opção válida");
                    break;
            }
        }
    }

    public static void adicionarAluno(List<Turma> turmas) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--Cadastro de aluno--");
        System.out.println("Nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.println("CPF do aluno: ");
        String cpf = scanner.nextLine();
        System.out.println("Data de nascimento: ");
        String dataDeNascimento = scanner.nextLine();
        System.out.println("idade: ");
        int idade = scanner.nextInt();

        System.out.println("\nEscolha a turma: ");
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println(i + " - " + turmas.get(i).getNomeTurma());
        }
        System.out.println("Número da turma: ");
        int opcao = scanner.nextInt();

        if (opcao < 0 || opcao >= turmas.size()) {
            System.out.println("Turma inválida.");
            return;
        }
        Aluno novoAluno = new Aluno(nome, cpf, dataDeNascimento, idade);
        turmas.get(opcao).adicionarAluno(novoAluno);
        System.out.println("Aluno adicionado com sucesso!\n");
    }

    public static void adicionarTurma(List<Turma> turmas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Cadastro de turma--");
        System.out.println("Nome da turma: (EX: 6b, 8a, 1c)");
        String nome = scanner.nextLine().toLowerCase();

        Turma novaTurma = new Turma(nome);
        turmas.add(novaTurma);
        System.out.println("Turma adicionado com sucesso!\n");
    }

    public static void adicionarProfessor(List<Professor> professores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--Cadastro de professor--");
        System.out.println("Nome do professor: ");
        String nome = scanner.nextLine();
        System.out.println("CPF do professor: ");
        String cpf = scanner.nextLine();
        System.out.println("Data de nascimento: ");
        String dataDeNascimento = scanner.nextLine();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        Professor novoProfessor = new Professor(nome, cpf, dataDeNascimento, idade);

        int op = 1;
        while (op != 0) {
            System.out.println("Disciplina: ");
            scanner.nextLine();
            String disciplina = scanner.nextLine();
            novoProfessor.addDisciplina(disciplina);
            System.out.println("Deseja atribuir outra disciplina ao professor? 0 - Não / Outro número - Sim");
            op = scanner.nextInt();
        }

        professores.add(novoProfessor);
        System.out.println("Professor adicionado com sucesso!\n");

    }

    public static void apagarAluno(List<Turma> turmas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEscolha a turma:");
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println(i + " - " + turmas.get(i).getNomeTurma());
        }
        System.out.println("Número da turma: ");
        int opcao = scanner.nextInt();

        if (opcao < 0 || opcao >= turmas.size()) {
            System.out.println("Turma inválida.");
            return;
        }

        turmas.get(opcao).apagarAluno();
    }

    public static void apagarTurma(List<Turma> turmas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEscolha a turma:");
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println(i + " - " + turmas.get(i).getNomeTurma());
        }
        System.out.println("Número da turma: ");
        int opcao = scanner.nextInt();

        if (opcao < 0 || opcao >= turmas.size()) {
            System.out.println("Turma inválida.");
            return;
        }

        turmas.remove(turmas.get(opcao));

    }

    public static void apagarProfessor(List<Professor> professores) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEscolha o professor:");
        for (int i = 0; i < professores.size(); i++) {
            System.out.println(i + " - " + professores.get(i).getNome());
        }
        System.out.println("Número do professor: ");
        int opcao = scanner.nextInt();

        if (opcao < 0 || opcao >= professores.size()) {
            System.out.println("Professor inválido.");
            return;
        }
        professores.remove(professores.get(opcao));

    }

    public static void listarProfessores(List<Professor> professores) {
        System.out.println("---Lista de professores---");
        for (Professor professor : professores) {
            professor.listarDados();
        }
    }

    public static void listarAlunos(List<Turma> turmas) {
        System.out.println("---Lista de alunos---");
        for (Turma turma : turmas) {
            System.out.println("Turma: " + turma.getNomeTurma());
            for (int j = 0; j < turma.quantidadeAlunos(); j++) {
                turma.getAluno(j).listarDados();
            }
        }
    }

    public static void listarTurmas(List<Turma> turmas) {
        System.out.println("---Lista de turmas---");
        for (Turma turma : turmas) {
            System.out.println(turma.getNomeTurma());
        }
    }

    public static void adicionarNota(List<Turma> turmas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Adicionar notas---");
        System.out.println("\nEscolha a turma do aluno que você deseja adicionar notas: ");
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println(i + " - " + turmas.get(i).getNomeTurma());
        }
        System.out.println("Número da turma: ");
        int opcao = scanner.nextInt();

        if (opcao < 0 || opcao >= turmas.size()) {
            System.out.println("Turma inválida.");
            return;
        }

        System.out.println("Para qual dos 4 bimestres será atribuída a nota? (0 a 3)");
        int bimestre = scanner.nextInt();
        System.out.println("Para qual disciplina será atribuída a nota?");
        System.out.println("0 - Matemática");
        System.out.println("1 - Português");
        System.out.println("2 - Inglês");
        System.out.println("3 - Química");
        System.out.println("4 - Biologia");
        System.out.println("5 - Geografia");
        System.out.println("6 - História");
        System.out.println("7 - Filosofia");
        int disciplina = scanner.nextInt();

        System.out.println("Qual nota será atribuída?");
        double nota = scanner.nextDouble();
        turmas.get(opcao).getAluno().adicionarNota(bimestre, disciplina, nota);

    }

    public static void mediaBi(List<Turma> turmas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Média Bimestral---");
        System.out.println("\nEscolha a turma do aluno que você deseja ver a média: ");
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println(i + " - " + turmas.get(i).getNomeTurma());
        }
        System.out.println("Número da turma: ");
        int opcao = scanner.nextInt();

        if (opcao < 0 || opcao >= turmas.size()) {
            System.out.println("Turma inválida.");
            return;
        }

        System.out.println("Para qual bimestre será visto a média? (0 a 3)");
        int bimestre = scanner.nextInt();
        System.out.println("Para qual disciplina será visto a média?");
        System.out.println("0 - Matemática");
        System.out.println("1 - Português");
        System.out.println("2 - Inglês");
        System.out.println("3 - Química");
        System.out.println("4 - Biologia");
        System.out.println("5 - Geografia");
        System.out.println("6 - História");
        System.out.println("7 - Filosofia");
        int disciplina = scanner.nextInt();

        turmas.get(opcao).getAluno().calcularMediaBimestral(disciplina, bimestre);
    }

    public static void calcularMediaFinal(List<Turma> turmas) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Calcular média final de um aluno---");
        System.out.println("\nEscolha a turma do aluno que você deseja visualizar a média final: ");
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println(i + " - " + turmas.get(i).getNomeTurma());
        }
        System.out.println("Número da turma: ");
        int opcao = scanner.nextInt();

        if (opcao < 0 || opcao >= turmas.size()) {
            System.out.println("Turma inválida.");
            return;
        }

        System.out.println("Para qual disciplina será atribuída a nota?");
        System.out.println("0 - Matemática");
        System.out.println("1 - Português");
        System.out.println("2 - Inglês");
        System.out.println("3 - Química");
        System.out.println("4 - Biologia");
        System.out.println("5 - Geografia");
        System.out.println("6 - História");
        System.out.println("7 - Filosofia");
        int disciplina = scanner.nextInt();

        System.out.println("Média final da disciplina " + disciplina + ": "
                + turmas.get(opcao).getAluno().calcularMediaFinal(disciplina));

    }
}
