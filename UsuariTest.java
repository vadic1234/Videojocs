import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuariTest {

    @Test
    void getNickname() {
        Usuari usuariTest = new Usuari("PEPE");
        String NickUsu = usuariTest.getNickname();
        assert(NickUsu == "PEPE");
    }

    @Test
    void getIdentificador() {
        Usuari IdeTest = new Usuari("#41D2");
        String IdeUsu = IdeTest.getNickname();
        assert(IdeUsu == "#41D2");
    }

    @Test
    void afegirComentari() {

    }
}