import org.junit.jupiter.api.Test;

class UsuariTest {

    @Test
    void getNickname() {
        Usuari testUser = new Usuari("Pere");
        assert(testUser.getNickname() == "Pere");
    }
}