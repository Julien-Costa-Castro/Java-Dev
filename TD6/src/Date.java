public class Date {
    private int jour;
    private int mois;
    private int année;
    private static String[] moisLettres = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "août", "septembre", "octobre", "novembre", "décembre"};

    public Date(int jour, int mois, int année) {
        this.jour = jour;
        this.mois = mois;
        this.année = année;
    }

    public void afficher() {
        System.out.println(this.jour + "/" + this.mois + "/" + this.année);
    }

    public int nbJoursMois() {
        int jours = 0;
        int[] nbJours = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (this.mois != 2) {
            jours = nbJours[this.mois];
            return jours;
        } else if (Ut.estBissextile(this.année) == true) {
            return 29;
        } else return 28;
    }

    public void incrémenter() {
        this.jour = this.jour + 1;
        if (this.jour > this.nbJoursMois()) {
            this.jour = 1;
            this.mois = this.mois + 1;
            if (this.mois > 12) {
                this.mois = 1;
                this.année = this.année + 1;
            }
        }

    }
    @Override
    public String toString() {
        return this.jour + " " + moisLettres[this.mois - 1] + " " + this.année;
    }

    public boolean estAprès(Date d){
        boolean bool= false;
        if(this.année > d.année){
            bool = true;
        } else if (this.année == d.année && this.mois > d.mois) {
            bool = true;
        } else if (this.année == d.année && this.mois == d.mois && this.jour > d.jour) {
            bool = true;
        }
        return bool;
    }

    public boolean égale(Date d){
        boolean bool= false;
        if(this.année == d.année && this.mois == d.mois && this.jour == d.jour){
            bool = true;
        }
        return bool;
    }

    public int jusquà(Date d) {
        if (this.estAprès(d)) {
            return -d.jusquà(this);
        }
        else {
            int nb = 0;
            Date copieThis = new Date(this.jour, this.mois, this.année);
            while (!copieThis.égale(d)){
                copieThis.incrémenter();
                nb ++;
            }
            return nb;
        }
    }

    public Date(Date d){
        this.jour = d.jour;
        this.mois = d.mois;
        this.année = d.année;
    }
}

