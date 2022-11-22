import org.junit.jupiter.api.Test;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;

=======
<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;

=======
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
>>>>>>> d888cddcc8a03afffd550a1f3d09e03e970ff5d9
class UsuariTest {

    @Test
    void getNickname() {
<<<<<<< HEAD
        Usuari testUser = new Usuari("Pere");
        assert(testUser.getNickname() == "Pere");

=======
<<<<<<< HEAD
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

=======
        Usuari testUser = new Usuari("Pere");
        assert(testUser.getNickname() == "Pere");
>>>>>>> 33f33bb88d45e9b33ce6bab2b68cd9f06c0a8b45
>>>>>>> d888cddcc8a03afffd550a1f3d09e03e970ff5d9
    }
}