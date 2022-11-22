import org.junit.jupiter.api.Test;

class VideojocTest {

    public static final String NOM_VIDEOJOC = "Minecraft";
    public static final String EDAT_RECOMANADA_PEGI = "PEGI 12";
    public static final String GENERE_JOC = "Acció";
    public static final int NUM_JUGADOR = 12;
    public static final int PREU = 20;


    @Test
    void getUsuarisQueHanConsultat() {
    }

    @Test
    void getNom() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        String nomDelVideojoc = videojocTest.getNom();
        assert(nomDelVideojoc == NOM_VIDEOJOC);
    }

    @Test
    void setNom() {
        Videojoc videojocTest = new Videojoc("Fortnite");
        videojocTest.setNom(NOM_VIDEOJOC);
        assert(videojocTest.getNom() == NOM_VIDEOJOC);
    }

    @Test
    void getGenere() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        String genereVideojoc = videojocTest.getGenere();
        assert(genereVideojoc == GENERE_JOC);
    }

    @Test
    void setGenere() {

    }

    @Test
    void getNumeroJugadors() {

    }

    @Test
    void setNumeroJugadors() {

    }

    @Test
    void getPreu() {

    }

    @Test
    void setPreu() {

    }

    @Test
    void getPlataformes() {
    }

    @Test
    void setPlataformes() {
    }

    @Test
    void getAmbientacio() {
    }

    @Test
    void setAmbientacio() {
    }

    @Test
    void getEdatRecomanadaPEGI() {
    }

    @Test
    void setEdatRecomanadaPEGI() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setEdatRecomanadaPEGI(EDAT_RECOMANADA_PEGI);
        assert(videojocTest.getEdatRecomanadaPEGI() == EDAT_RECOMANADA_PEGI);
    }

    @Test
    void getContingutEspecificPEGI() {
    }

    @Test
    void setContingutEspecificPEGI() {
    }

    @Test
    void getRequisits() {
    }

    @Test
    void setRequisits() {
    }

    @Test
    void getComentaris() {
    }
}