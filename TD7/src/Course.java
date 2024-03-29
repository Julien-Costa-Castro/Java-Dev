public class Course {
    private Voiture voiture1;
    private Voiture voiture2;
    private int longueur;
    /* pré-requis : deux voitures et une longueur sont passées en paramètres
     * action : crée une course de longueur x et de deux voitures
     */
    public Course (Voiture uneVoit1, Voiture uneVoit2, int longueur){
        this.voiture1 = uneVoit1;
        this.voiture2 = uneVoit2;
        this.longueur = longueur;
    }

    /* résultat : retourne une chaîne de caractères contenant les caractéristiques
     * de this (sous la forme de votre choix)
     */
    public String toString(){
        return "Course de " + this.longueur + "entre " + this.voiture1.leNom() + " et " + this.voiture2.leNom();
    }

    /*
     * action : Simule le déroulement d’une course entre this.voit1 et this.voit2
     * sur une piste de longueur this.longueurPiste.
     * this.voit1 et this.voit2 sont d’abord placées sur la ligne de départ.
     * Ensuite, jusqu’à ce qu’une voiture franchisse la ligne d’arrivée, l’une
     * des deux voitures est itérativement sélectionnée aléatoirement et avance.
     * Un affichage des deux voitures (représentées par la première lettre de leur
     * nom) à leur position respective à chaque étape permet de suivre la course.
     * résultat : la voiture gagnante.
     */
    public Voiture deroulement(){
        this.voiture1.avance();
        this.voiture2.avance();
        return this.voiture1;
    }

}
