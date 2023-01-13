public class EE {
    private int cardinal;
    private int[] ensTab;
    private int max;

    public EE(int max) {
        this.ensTab = new int[max];
        this.cardinal = 0;
    }

    public EE(int max, int[] T) {
        this.ensTab = new int[max];
        this.cardinal = 0;
        for (int i = 0; i < T.length; i++) {
            this.ajouter(T[i]);
        }
    }

    public boolean contient(int i) {
        boolean bool = false;
        for (int j = 0; j < this.cardinal; j++) {
            if (this.ensTab[i] == i) {
                bool = true;
            }
        }
        return bool;
    }

        public boolean estPlein () {
            if (this.cardinal == this.max) return true;
            else return false;
        }

        public int ajouter ( int i){
            if (this.estPlein()) return 1;
            else {
                this.ensTab[this.cardinal] = i;
                this.cardinal++;
                return 0;
            }
        }

        public boolean estVide () {
            if (this.cardinal == 0) return true;
            else return false;
        }

    public int getCardinal() {
        return this.cardinal;
    }

    public boolean retirer(int i){
        if (this.estVide()) return false;
        else {
            for (int j = 0; j < this.cardinal; j++) {
                if (this.ensTab[j] == i) {
                    this.ensTab[j] = this.ensTab[this.cardinal - 1];
                    this.cardinal--;
                    return true;
                }
            }
            return false;
        }
    }

    public boolean estInclusDans(EE A){
        if (this.cardinal > A.cardinal) return false;
        else {
            for (int i = 0; i < this.cardinal; i++) {
                if (!A.contient(this.ensTab[i])) return false;
            }
            return true;
        }
    }
}

