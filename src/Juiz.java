public abstract class Juiz extends Pessoa {
    
    private int numeroRegistro;
    private int experiencia;

    // Setters and Getters
    public void setNumeroRegistro ( int numeroRegistro ) {
        this.numeroRegistro = numeroRegistro;
    }
    public int getNumeroRegistro () {
        return numeroRegistro;
    }
    public void setExperiencia ( int experiencia ) {
        this.experiencia = experiencia;
    }
    public int getExperiencia () {
        return experiencia;
    }

    // Construtores
    public Juiz () {
        super();
        numeroRegistro = 0;
        experiencia = 0;
    }
    public Juiz ( int id, String nome, String email, int numeroRegistro, int experiencia ) {
        super ( id, nome, email );
        this.numeroRegistro = numeroRegistro;
        this.experiencia = experiencia;
    }
}
