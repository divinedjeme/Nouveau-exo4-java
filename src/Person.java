import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class Person {
    private static int depart = 1;
    private String nom;
    private String prenom;
    private String matricule;
    private int age;
    private String dateNaissance;
    public Person(String nom, String prenom, int age, String dateNaissance){
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = genererMatricule();
        this.age = age;
        this.dateNaissance = dateNaissance;
        depart++;
    }
    public Person(){

    }
    public void setNom(String nom) {
    this.nom = nom;
}
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDateNaissance(String dateNaissnce) {
        this.dateNaissance= dateNaissance;
    }

    private String genererMatricule(){
        String matricule = (prenom.substring(0,1)) + nom.substring(0,1).toUpperCase();
        String numeroIdentification = String.format("%04d", depart) ;
        return matricule + numeroIdentification;
    }
    public int calculAge() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateNaiss = dateFormat.parse(this.dateNaissance);
            Date dateActuelle = new Date();
            long differenceEnMillis = dateActuelle.getTime() - dateNaiss.getTime();
            long differenceEnAnnees = TimeUnit.MILLISECONDS.toDays(differenceEnMillis) / 365;

            return (int) differenceEnAnnees;
        } catch (ParseException e) {
            e.printStackTrace();
            return -1;
        }
    }


    public String toString() {
        return "Person{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", dateNaissance='" + dateNaissance + '\'' +
                ", matricule='" + matricule + '\'' +
                '}';
    }

}

