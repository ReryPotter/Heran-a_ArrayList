public abstract class Jogador extends Pessoa {
    
    private String esporte;
    private int idade;

    // Setters and Getters
    public void setEsporte ( String esporte ) {
        this.esporte = esporte;
    }
    public String getEsporte () {
        return esporte;
    }
    public void setIdade ( int idade ) {
        this.idade = idade;
    }
    public int getIdade () {
        return idade;
    }

    // Construtores
    public Jogador () {
        super();
        esporte = new String();
        idade = 0;
    }
    public Jogador ( int id, String nome, String email, String esporte, int idade ) {
        super ( id, nome, email );
        this.esporte = esporte;
        this.idade = idade;
    }

}
