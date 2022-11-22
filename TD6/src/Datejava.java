public class Datejava {
    private int jour;
    private int mois;
    private int annee;

    public  void Date(int jour, int mois, int année){
        this.jour = jour;
        this.mois = mois;
        this.annee = année;
    }

    public void afficher(){
        System.out.println(jour + "/" + mois + "/" + annee);
    }


}
