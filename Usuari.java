import java.time.LocalDate;

<<<<<<< HEAD
public class Usuari {git pull
=======
public class Usuari {
>>>>>>> c32fb41b3f5d802e9fb66bdd48c1e2c45902ba3e
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

