import org.junit.jupiter.api.Test;


class UsuariTest {

    @Test
    void getNickname() {

        Usuari testUser = new Usuari("Pere");
        assert(testUser.getNickname() == "Pere");

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

        Usuari testUser = new Usuari("Pere");
        assert(testUser.getNickname() == "Pere");

    }
}