public final class Convidado extends Juiz {
    
    private String indicadoPor;

    // Setters and Getters
    public void setIndicadoPor ( String indicadoPor ) {
        this.indicadoPor = indicadoPor;
    }
    public String getIndicadoPor () {
        return indicadoPor;
    }
    
    // Construtores
    public Convidado () {
        super ();
        indicadoPor = new String ();
    }
    public Convidado ( int id, String nome, String email, int numeroRegistro, int experiencia, String indicadoPor ) {
        super ( id, nome, email, numeroRegistro, experiencia );
        this.indicadoPor = indicadoPor;
    }

}