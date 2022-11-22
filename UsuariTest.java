import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuariTest {

    @Test
    void getNickname() {
        Usuari testUser = new Usuari("Pere");
        assert(testUser.getNickname() == "Pere");

    }
}