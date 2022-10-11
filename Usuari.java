import java.time.LocalDate;

<<<<<<< HEAD

public class Usuari {

=======
public class Usuari {
>>>>>>> 6aa9aea071616e693fe997ba69f59d79fb6ff1c6
    private final int id; //Comentari Fabri
    private static int ultimId = 0;

    private String nickname;
    private String nom;
    private String cognoms;
    private String correu;
    private LocalDate dataNaixement;
    public Usuari(String nickname) {
        this.nickname = nickname;
        ultimId++;
        this.id = ultimId;
    }

    public String getIdentificador() {
        return nickname+"#"+String.format("%04d", id);
    }
}

