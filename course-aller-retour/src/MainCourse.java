public class MainCourse {
    public static void main(String[] args) {
        courseAllerRetour();
    }
    public static void courseAllerRetour(){
        Voiture v1 = new Voiture("Ferrari", 10);
        Voiture v2 = new Voiture("Renault", 10);
        Course c1 = new Course(v1, v2, 100);
        System.out.println(c1);
        Voiture gagnant = c1.déroulementAR();
        System.out.println(gagnant.leNom()+ " a gagné la course");

    }
}
