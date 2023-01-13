public class Course {
    public Voiture voiture1;
    public Voiture voiture2;
    public int longueur;

    public Course(Voiture uneVoit1, Voiture uneVoit2, int longueur) {
        this.voiture1 = uneVoit1;
        this.voiture2 = uneVoit2;
        this.longueur = longueur;
    }

    public int getLongeur() {
        return this.longueur;
    }

    public String toString() {
        return "Course de longueur " + this.longueur + " entre " + this.voiture1.leNom() + " et " + this.voiture2.leNom();
    }

    public Voiture déroulementAR() {
        this.voiture1.auDépart();
        this.voiture2.auDépart();
        while (voiture1.dépasse(longueur) || voiture2.dépasse(longueur)) {
            int nb = Ut.randomMinMax(0, 1);
            Ut.randomMinMax(0, 1);
            if (nb == 1) {
                this.voiture1.avanceAR();
            } else this.voiture2.avanceAR();
        }
        if (this.voiture1.dépasse(longueur)) {
            return voiture1;
        } else return voiture2;
    }
}

