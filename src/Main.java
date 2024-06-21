//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static class Personnage {

        private String nom;
        private String prenom;
        private int age;

        public Personnage(String nom, String prenom, int age) {
            this.nom = nom;
            this.prenom = prenom;
            this.age = age;
        }
        public void presenter() {
            System.out.println("Je suis " + prenom + " " + nom + ", j'ai " + age + " ans.");
        }

        public int calculerAgeEnAnnee() {
            return age;
        }
    }
    public static void main(String[] args) {
        Personnage personnage1 = new Personnage("Dupont", "Jean", 32);
        personnage1.presenter(); // Affiche "Je suis Jean Dupont, j'ai 32 ans."

        int ageEnAnnees = personnage1.calculerAgeEnAnnee();
        System.out.println("Âge en années : " + ageEnAnnees);  // Affiche "Âge en années : 32"

    }
}