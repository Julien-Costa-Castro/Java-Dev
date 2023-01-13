public class Voiture {
    public int vitesse;
    public String nom;
    public int position;

    /* pré-requis : un nom, une vitesse et la position à 0 sont passés en paramètres
     * action : crée une voiture de nom unNom et de vitesse uneVitesse
     * placée à l’origine
     */
    public Voiture(String unNom, int uneVitesse) {
        this.nom = unNom;
        this.vitesse = uneVitesse;
        this.position = 0;
    }

    /* résultat : retourne une chaîne de caractères contenant les caractéristiques
     * de this (sous la forme de votre choix)
     */
    public String toString() {
        return "Voiture " + this.nom + " de vitesse " + this.vitesse + " à la position " + this.position;
    }

    /* résultat : retourne une chaîne de caractères formée d’une suite d’espaces
     * suivie de la première lettre du nom de this, suivie d’un retour
     * à la ligne, le nombre d’espaces étant égal à la position de this.
     */
    public String toString2() {
        String res = "";
        for (int i = 0; i < this.position; i++) {
            res += " ";
        }
        res += this.nom.charAt(0) + "";
        return res;
    }

    /* résultat : retourne le nom de this
     */
    public String leNom() {
        return this.nom;
    }

    /* résultat : retourne vrai si et seulement si la position de this est
     * supérieure ou égale à limite
     */
    public boolean dépasse(int limite) {
        boolean bool = false;
        if (this.position >= limite) {
            bool = true;
        }
        return bool;
    }

    /* pré-requis : la position est passé en paramètre
     * action : fait avancer this d’une distance égale à sa vitesse */
    public void avance() {
        this.position = this.position + this.vitesse;
    }


    /* action : place this au départ de la course (à l’origine) */
    public void auDépart() {
        this.position = 0;
    }

    public String getNom() {
        return nom;
    }

    public void faitDemiTour() {
        this.vitesse = -this.vitesse;
    }

    public void avanceAR() {
        this.position = this.position + this.vitesse;
        if (this.position == 0) {
            this.vitesse = -this.vitesse;
        }
    }

    public boolean estArrivée() {
        boolean bool = false;
        if (this.position == 0 && this.vitesse < 0) {
            return true;
        }
        return bool;
    }

}



