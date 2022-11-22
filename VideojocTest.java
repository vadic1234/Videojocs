import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

class VideojocTest {

    static Videojoc test1;
    final static String NOM_VIDEOJOC = "FIFA23";

    @BeforeEach
    void initGame() {
        test1 = new Videojoc(NOM_VIDEOJOC);
    }



    @Test
    void getNom() {
        Videojoc test1 = new Videojoc(NOM_VIDEOJOC);
        assert(test1.getNom() == NOM_VIDEOJOC);
    }

    @Test
    void setNom() {
    }

    @Test
    void getGenere() {
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