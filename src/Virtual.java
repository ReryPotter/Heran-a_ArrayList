public final class Virtual extends Jogador {
    
    private String  TipoJogo;
    private int posicaoRanking;

    // Setters and Getters
    public void setTipoJogo ( String TipoJogo ) {
        this.TipoJogo = TipoJogo;
    }
    public String getTipoJogo () {
        return TipoJogo;
    }
    public void setPosicaoRanking ( int posicaoRanking ) {
        this.posicaoRanking = posicaoRanking;
    }
    public int getPosicaoRanking () {
        return posicaoRanking;
    }

    // Construtores
    public Virtual () {
        super ();
        TipoJogo = new String ();
        posicaoRanking = 0;
    }
    public Virtual ( int id, String nome, String email, String esporte, int idade, String TipoJogo, int posicaoRanking ) {
        super ( id, nome, email, esporte, idade );
        this.TipoJogo = TipoJogo;
        this.posicaoRanking = posicaoRanking;
    }

    public void lista() {
        super.lista();
        System.out.println("Tipo de jogo: " + TipoJogo);
        System.out.println("Posição no ranking: " + posicaoRanking);
    }

}
