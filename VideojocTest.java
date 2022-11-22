import org.junit.jupiter.api.Test;

class VideojocTest {

    public static final String NOM_VIDEOJOC = "Minecraft";
    public static final String EDAT_RECOMANADA_PEGI = "PEGI 12";
    public static final String CONJUNT_ESPECIFIC_PEGI = "DRUGS, SEX ASSAULTMENT, VIOLENCE, SUICIDE THOUGHTS";
    public static final String REQUISITS = "TENIR LA ESO";
    public static final String GENERE = "FEMENI";

    public static final String AMBIENTACIO = "GUERRA";
    public static final int NUM_JUGADORS = 456;
    public static final float PREU = 30;
    public static final String PLATAFORMES = "PC XBOX PS4-5";

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
        videojocTest.setGenere(GENERE);
        String GenereDelVideojoc = videojocTest.getGenere();
        assert(GenereDelVideojoc == GENERE);
    }

    @Test
    void setGenere() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setGenere(GENERE);
        assert(videojocTest.getGenere() == GENERE);
    }

    @Test
    void getNumeroJugadors() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setNumeroJugadors(NUM_JUGADORS);
        int NumDelVideojoc = videojocTest.getNumeroJugadors();
        assert(NumDelVideojoc == NUM_JUGADORS);
    }

    @Test
    void setNumeroJugadors() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setNumeroJugadors(NUM_JUGADORS);
        assert(videojocTest.getNumeroJugadors() == NUM_JUGADORS);
    }

    @Test
    void getPreu() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setPreu(PREU);
        float PreuDelVideojoc = videojocTest.getPreu();
        assert(PreuDelVideojoc == PREU);
    }

    @Test
    void setPreu() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setPreu(PREU);
        assert(videojocTest.getPreu() == PREU);
    }

    @Test
    void getPlataformes() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setPlataformes(PLATAFORMES);
        String PreuDelVideojoc = videojocTest.getPlataformes();
        assert(PreuDelVideojoc == PLATAFORMES);
    }

    @Test
    void setPlataformes() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setPlataformes(PLATAFORMES);
        assert(videojocTest.getPlataformes() == PLATAFORMES);
    }

    @Test
    void getAmbientacio() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC );
        videojocTest.setAmbientacio(AMBIENTACIO);
        String AmbientacioDelVideojoc = videojocTest.getAmbientacio();
        assert(AmbientacioDelVideojoc == AMBIENTACIO);
    }

    @Test
    void setAmbientacio() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setAmbientacio(AMBIENTACIO);
        assert(videojocTest.getAmbientacio() == AMBIENTACIO);
    }

    @Test
    void getEdatRecomanadaPEGI() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC );
        videojocTest.setEdatRecomanadaPEGI(EDAT_RECOMANADA_PEGI);
        String CEDelVideojoc = videojocTest.getEdatRecomanadaPEGI();
        assert(CEDelVideojoc == EDAT_RECOMANADA_PEGI);
    }

    @Test
    void setEdatRecomanadaPEGI() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setEdatRecomanadaPEGI(EDAT_RECOMANADA_PEGI);
        assert(videojocTest.getEdatRecomanadaPEGI() == EDAT_RECOMANADA_PEGI);
    }

    @Test
    void getContingutEspecificPEGI() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC );
        videojocTest.setContingutEspecificPEGI(CONJUNT_ESPECIFIC_PEGI);
        String CEDelVideojoc = videojocTest.getContingutEspecificPEGI();
        assert(CEDelVideojoc == CONJUNT_ESPECIFIC_PEGI);
    }

    @Test
    void setContingutEspecificPEGI() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setContingutEspecificPEGI(CONJUNT_ESPECIFIC_PEGI);
        assert(videojocTest.getContingutEspecificPEGI() == CONJUNT_ESPECIFIC_PEGI);
    }

    @Test
    void getRequisits() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC );
        videojocTest.setRequisits(REQUISITS);
        String RequisitsDelVideojoc = videojocTest.getRequisits();
        assert(RequisitsDelVideojoc == REQUISITS);
    }

    @Test
    void setRequisits() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setRequisits(REQUISITS);
        assert(videojocTest.getRequisits() == REQUISITS);
    }

    @Test
    void getComentaris() {

    }
}