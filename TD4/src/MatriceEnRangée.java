public class MatriceEnRangée {
    public static void remplirCetteMatriceEnRangée(int[][] M) {
        int count = 1;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                M[i][j] = count;
                count++;
            }
        }
    }
    public static int[][] nouvelleMatriceEnRangée(int n) {
        int[][] M = new int[n][n];
        remplirCetteMatriceEnRangée(M);
        return M;
    }
}
