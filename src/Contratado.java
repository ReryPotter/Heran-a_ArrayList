public final class Contratado extends Juiz {
    
    private int valorHora;

    // Setters and Getters
    public void setValorHora ( int valorHora ) {
        this.valorHora = valorHora;
    }
    public int getValorHora () {
        return valorHora;
    }

    // Construtores
    public Contratado () {
        super ();
        valorHora = 0;
    }
    public Contratado ( int id, String nome, String email, int numeroRegistro, int experiencia, int valorHora ) {
        super ( id, nome, email, numeroRegistro, experiencia );
        this.valorHora = valorHora;
    }

}