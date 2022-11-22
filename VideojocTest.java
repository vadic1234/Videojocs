import org.junit.jupiter.api.Test;

class VideojocTest {

    public static final String NOM_VIDEOJOC = "Minecraft";
    public static final String EDAT_RECOMANADA_PEGI = "PEGI 12";
<<<<<<< HEAD
    public static final String GENERE_JOC = "Acció";
    public static final int NUM_JUGADOR = 12;
    public static final int PREU = 20;

=======
    public static final String CONJUNT_ESPECIFIC_PEGI = "DRUGS, SEX ASSAULTMENT, VIOLENCE, SUICIDE THOUGHTS";
    public static final String REQUISITS = "TENIR LA ESO";
    public static final String GENERE = "FEMENI";

    public static final String AMBIENTACIO = "GUERRA";
    public static final int NUM_JUGADORS = 456;
    public static final float PREU = 30;
    public static final String PLATAFORMES = "PC XBOX PS4-5";
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45

    @Test
    void getUsuarisQueHanConsultat() {
    }

    @Test
    void getNom() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        String nomDelVideojoc = videojocTest.getNom();
        assert(nomDelVideojoc == NOM_VIDEOJOC);
<<<<<<< HEAD
=======

>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void setNom() {
        Videojoc videojocTest = new Videojoc("Fortnite");
        videojocTest.setNom(NOM_VIDEOJOC);
        assert(videojocTest.getNom() == NOM_VIDEOJOC);
<<<<<<< HEAD
=======


>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void getGenere() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
<<<<<<< HEAD
        String genereVideojoc = videojocTest.getGenere();
        assert(genereVideojoc == GENERE_JOC);
=======
        videojocTest.setGenere(GENERE);
        String GenereDelVideojoc = videojocTest.getGenere();
        assert(GenereDelVideojoc == GENERE);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void setGenere() {
<<<<<<< HEAD

=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setGenere(GENERE);
        assert(videojocTest.getGenere() == GENERE);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void getNumeroJugadors() {
<<<<<<< HEAD

=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setNumeroJugadors(NUM_JUGADORS);
        int NumDelVideojoc = videojocTest.getNumeroJugadors();
        assert(NumDelVideojoc == NUM_JUGADORS);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void setNumeroJugadors() {
<<<<<<< HEAD

=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setNumeroJugadors(NUM_JUGADORS);
        assert(videojocTest.getNumeroJugadors() == NUM_JUGADORS);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void getPreu() {
<<<<<<< HEAD

=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setPreu(PREU);
        float PreuDelVideojoc = videojocTest.getPreu();
        assert(PreuDelVideojoc == PREU);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void setPreu() {
<<<<<<< HEAD

=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setPreu(PREU);
        assert(videojocTest.getPreu() == PREU);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void getPlataformes() {
<<<<<<< HEAD
=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setPlataformes(PLATAFORMES);
        String PreuDelVideojoc = videojocTest.getPlataformes();
        assert(PreuDelVideojoc == PLATAFORMES);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void setPlataformes() {
<<<<<<< HEAD
=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setPlataformes(PLATAFORMES);
        assert(videojocTest.getPlataformes() == PLATAFORMES);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void getAmbientacio() {
<<<<<<< HEAD
=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC );
        videojocTest.setAmbientacio(AMBIENTACIO);
        String AmbientacioDelVideojoc = videojocTest.getAmbientacio();
        assert(AmbientacioDelVideojoc == AMBIENTACIO);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void setAmbientacio() {
<<<<<<< HEAD
=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setAmbientacio(AMBIENTACIO);
        assert(videojocTest.getAmbientacio() == AMBIENTACIO);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void getEdatRecomanadaPEGI() {
<<<<<<< HEAD
=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC );
        videojocTest.setEdatRecomanadaPEGI(EDAT_RECOMANADA_PEGI);
        String CEDelVideojoc = videojocTest.getEdatRecomanadaPEGI();
        assert(CEDelVideojoc == EDAT_RECOMANADA_PEGI);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void setEdatRecomanadaPEGI() {
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setEdatRecomanadaPEGI(EDAT_RECOMANADA_PEGI);
        assert(videojocTest.getEdatRecomanadaPEGI() == EDAT_RECOMANADA_PEGI);
    }

    @Test
    void getContingutEspecificPEGI() {
<<<<<<< HEAD
=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC );
        videojocTest.setContingutEspecificPEGI(CONJUNT_ESPECIFIC_PEGI);
        String CEDelVideojoc = videojocTest.getContingutEspecificPEGI();
        assert(CEDelVideojoc == CONJUNT_ESPECIFIC_PEGI);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void setContingutEspecificPEGI() {
<<<<<<< HEAD
=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setContingutEspecificPEGI(CONJUNT_ESPECIFIC_PEGI);
        assert(videojocTest.getContingutEspecificPEGI() == CONJUNT_ESPECIFIC_PEGI);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void getRequisits() {
<<<<<<< HEAD
=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC );
        videojocTest.setRequisits(REQUISITS);
        String RequisitsDelVideojoc = videojocTest.getRequisits();
        assert(RequisitsDelVideojoc == REQUISITS);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void setRequisits() {
<<<<<<< HEAD
=======
        Videojoc videojocTest = new Videojoc(NOM_VIDEOJOC);
        videojocTest.setRequisits(REQUISITS);
        assert(videojocTest.getRequisits() == REQUISITS);
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }

    @Test
    void getComentaris() {
<<<<<<< HEAD
=======

>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
    }
}