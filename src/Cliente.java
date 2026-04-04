public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    public static int totalClientes = 0;

    // Construtor 1: recebe nome, email e telefone
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        totalClientes++;
    }

    // Construtor 2: recebe só nome e email
    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = "Não informado";
        totalClientes++;
    }

    // Construtor 3: recebe só nome
    public Cliente(String nome) {
        this.nome = nome;
        this.email = "Não informado";
        this.telefone = "Não informado";
        totalClientes++;
    }

    public String getNome()     { return nome; }
    public String getEmail()    { return email; }
    public String getTelefone() { return telefone; }

    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
    }
}