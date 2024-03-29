import java.util.Scanner;
import java.lang.*;

public class Fraction {

    private int numerateur;

    private int denominateur; // Invariant : different de 0

    public Fraction(int num, int denom) {
        /*  Action : constructeur a partir de deux entiers.
         *  Pre-requis : denom est different de 0 !
         */
        this.numerateur = num;
        this.denominateur = denom;
    }

    public Fraction(Fraction frac) { // constructeur par recopie frac --> this
        this.numerateur = frac.numerateur;
        this.denominateur = frac.denominateur;
        // Rmq : peut s'écrire en faisant appel au constructeur precedent : this(frac.numerateur, frac.denominateur);
    }

    public Fraction(String strFrac) {
	/* Action : constructeur a partir d'une chaine de caracteres.
	   Pre-requis : strFrac est une chaine de caracteres correspondant a une fraction, par exemple "13/26"

	   Remarque pedagogique : parseInt est une methode de classe (Integer) ;
	   split est une methode d'instance (strFrac)
	*/
        String str[];   // declaration d'un tableau de chaines de caracteres
        str = strFrac.split("/");  // Appel de la methode 'split' d'un objet de classe String : eclatement de strFrac en plusieurs sous-chaines separees par des '/' et rangees
        // dans str. Exemple : si strFrac=="13/26", alors str[0] vaut "13" et str[1] vaut "26".
        this.numerateur = Integer.parseInt(str[0]);    // La methode de la classe Integer permet de traduire la chaine en argument en Integer...
        // Java sait automatiquement transformer (on dit "caster" ou "faire un cast" - anglicisme) une valeur Integer vers int.
        this.denominateur = Integer.parseInt(str[1]);
    }


    // public void affiche() {
    // !! Mieux vaut utiliser toString() ci-apres !!
    //	System.out.println("Fraction = " + this.numerateur + " / " + this.denominateur);
    // }

    public String toString() {
        return this.numerateur + "/" + this.denominateur;
    }

    /* A COMPLETER A PARTIR D'ICI !! */

    // Dans terminal : [javac Fraction] ; javac MainFraction.java ;  java MainFraction

    public void reduire() {
        int a = Ut.pgcd(this.denominateur, this.numerateur);
        this.denominateur = this.denominateur / a;
        this.numerateur = this.numerateur / a;
    }

    public Fraction fractionReduite() {
        Fraction f = new Fraction(this);
        f.reduire();
        return f;
    }

    public Fraction fois(Fraction X) {
        Fraction f = new Fraction(this);
        f.denominateur = f.denominateur * X.denominateur;
        f.numerateur = f.numerateur * X.numerateur;
        f.reduire();
        return f;
    }

    public Fraction plus(Fraction X) {
        Fraction f = new Fraction(this);
        if (f.denominateur == X.denominateur) {
            f.numerateur = f.numerateur + X.numerateur;
        } else {
            f.numerateur = f.numerateur * X.denominateur + X.numerateur * f.denominateur;
            f.denominateur = f.denominateur * X.denominateur;
        }
        f.reduire();
        return f;
    }

    public Fraction puissance(int n) {
        Fraction f = new Fraction(this);
        if(n ==0){
            f.numerateur = 1;
            f.denominateur = 1;
        }
        else{
            for (int i = 1; i < n; i++) {
                f.numerateur = f.numerateur * f.numerateur;
                f.denominateur = f.denominateur * f.denominateur;
            }
        }
        f.reduire();
        return f;
    }

    public boolean égale(Fraction X){
        boolean bool = true;
        Fraction f = new Fraction(this);
        if(f.denominateur == X.denominateur && f.numerateur == X.numerateur){
            return true;
        }
        else if (f.denominateur == X.denominateur*2 && f.numerateur == X.numerateur*2){
            return true;
        }
        else return false;

    }

    public boolean estIrréductible(){
        boolean bool = true;
        if (Ut.pgcd(this.denominateur, this.numerateur) == 1){
            return true;
        }
        else return false;
    }
}


