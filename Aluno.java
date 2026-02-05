class Aluno extends Pessoa { // relação simples com turma
    private Turma turma;
    private double[][][] notas;

    private static final int MAX_BIMESTRES = 4;
    private static final int MAX_DISCIPLINAS = 8;
    private static final int MAX_NOTAS = 5;

    public Aluno(String nome, String cpf, String dataDeNascimento, int idade) {
        super(cpf, idade, dataDeNascimento, nome);
        notas = new double[MAX_BIMESTRES][MAX_DISCIPLINAS][MAX_NOTAS];

        for (int i = 0; i < MAX_BIMESTRES; i++) {
            for (int j = 0; j < MAX_DISCIPLINAS; j++) {
                for (int k = 0; k < MAX_NOTAS; k++) {
                    notas[i][j][k] = -1.0;
                }
            }
        }

    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String getIdentificacao() {
        return "Aluno: " + getNome() + " - " + "CPF: " + getCpf() + " - " + "Idade: " + getIdade() + " - "
                + "Data de nascimento: " + getDataDeNascimento() + " - ";
    }

    public void adicionarNota(int bimestre, int disciplinaIndex, double nota) {
        for (int i = 0; i < MAX_NOTAS; i++) {
            if (notas[bimestre][disciplinaIndex][i] == -1.0) {
                notas[bimestre][disciplinaIndex][i] = nota;
                System.out.println(
                        "Nota adicionada em: Bimestre" + bimestre + ", Disciplina" + disciplinaIndex + ", Posição" + i);
                return;
            }
        }
        System.out.println("Limite de notas atingido para esse bimestre e disciplina.");
    }

    public double calcularMediaBimestral(int disciplinaIndex, int bimestreIndex) {
        double soma = 0, media;
        int i;

        for (i = 0; i < MAX_NOTAS && notas[bimestreIndex][disciplinaIndex][i] != -1; i++) {
            System.out.println("Nota " + i + ": " + notas[bimestreIndex][disciplinaIndex][i]);
            soma += notas[bimestreIndex][disciplinaIndex][i];
        }

        media = soma / i;
        if (i == 0)
            media = 0; // Evita divisão por zero (caso não haja notas)
        System.out.println("Média do bimestre: " + bimestreIndex + ": " + media);
        return media;
    }

    public double calcularMediaFinal(int disciplinaIndex) {
        double soma = 0, media;

        soma = calcularMediaBimestral(disciplinaIndex, 0) + calcularMediaBimestral(disciplinaIndex, 1)
                + calcularMediaBimestral(disciplinaIndex, 2) + calcularMediaBimestral(disciplinaIndex, 3);

        media = soma / 4;
        return media;
    }
}
