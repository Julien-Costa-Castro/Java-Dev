public class LigneAvecUnMaxDeZeros {
    /**
     * Donnée : une matrice M de taille n x n
     * Résultat : le numéro de la ligne qui contient le plus de 0
     */
    public static int ligneAvecUnMaxDeZeros(int[][] M) {
        int max = 0;
        int ligne = 0;
        for (int i = 0; i < M.length; i++) {
            int nbzero = 0;
            for (int j = 0; j < M[i].length; j++) {
                if (M[i][j] == 0) {
                    nbzero++;
                }
            }
            if (nbzero > max) {
                max = nbzero;
                ligne = i;
            }
        }
        ligne++;
        return ligne;
    }
}

