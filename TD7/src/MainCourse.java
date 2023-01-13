public class MainCourse {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Ferrari", 10);
        Voiture v2 = new Voiture("Renault", 10);
        Course c1 = new Course(v1, v2, 1000);
        System.out.println(c1);
        System.out.println(c1.deroulement());
    }
}
