public final class Fisico extends Jogador {
    
    private String modalidade;
    private String categoria;

    // Setters and Getters
    public void setModalidade ( String modalidade ) {
        this.modalidade = modalidade;
    }
    public String getModalidade () {
        return modalidade;
    }
    public void setCategoria ( String categoria ) {
        this.categoria = categoria;
    }
    public String getCategoria () {
        return categoria;
    }

    // Construtores
    public Fisico () {
        super ();
        modalidade = new String ();
        categoria = new String ();
    }
    public Fisico ( int id, String nome, String email, String esporte, int idade, String modalidade, String categoria ) {
        super ( id, nome, email, esporte, idade );
        this.modalidade = modalidade;
        this.categoria = categoria;
    }

}