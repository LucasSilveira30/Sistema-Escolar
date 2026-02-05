public abstract class Pessoa {
    private String cpf;
    private int idade;
    private String dataDeNascimento;
    private String nome;

    public Pessoa(String cpf, int idade, String dataDeNascimento, String nome) {
        this.cpf = cpf;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
        this.nome = nome;
    }

    public void listarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Data de Nascimento: " + dataDeNascimento);
    }

    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }
    
    public abstract String getIdentificacao();
}
