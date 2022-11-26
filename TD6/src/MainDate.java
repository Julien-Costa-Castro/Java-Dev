public class MainDate {

    public static void main(String[] args) {
        Date f ;
        f = new Date(31, 12, 2001);
        System.out.println(f.nbJoursMois());
        f.incrémenter();
        f.afficher();
    }
}
