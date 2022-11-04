public class LigneAvecUnMaxDeZeros {
    /**
     * Donnée : une matrice M de taille n x n
     * Résultat : affiche la ligne de M qui contient le plus de 0
     */
    public static int ligneAvecUnMaxDeZeros(int[][] M) {
        int max = 0;
        int ligne = 0;
        for (int i = 0; i < M.length; i++) {
            int count = 0;
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 0) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                ligne = i;
            }
        }
        return ligne;
    }
    public static void main(String[] args){
        int[][] P={{1,2,5,0},{0,3,6,7},{0,0,0,8},{0,0,4,9},{1,2,3,4}};
        int imax=LigneAvecUnMaxDeZeros.ligneAvecUnMaxDeZeros(P);
        if (imax==3){
            System.exit(0);
            System.out.println("OK");
        }
        else System.exit(1);// ÉCHEC
        System.out.println("ECHEC");
    }
}
