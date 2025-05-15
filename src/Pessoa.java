public abstract class Pessoa {

    private int id;
    private String nome;
    private String email;

    // Setters and Getters
    public void setId ( int id ) {
        this.id = id;
    }
    public int getId () {
        return id;
    }
    public void setNome ( String nome ) {
        this.nome = nome;
    }
    public String getNome () {
        return nome;
    }
    public void setEmail ( String email ) {
        this.email = email;
    }
    public String getEmail () {
        return email;
    }

    // Construtores
    public Pessoa () {
        id = 0;
        nome = new String();
        email = new String();
    }
    public Pessoa ( int id, String nome, String email ) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public void lista() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
}