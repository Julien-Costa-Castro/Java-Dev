public class MatriceEnSerpentin {
    public static void remplirCetteMatriceEnSerpentin(int[][] M) {
        int count = 1;
        for (int i = 0; i < M.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < M[0].length; j++) {
                    M[i][j] = count;
                    count++;
                }
            }
            else {
                for (int j = M[0].length - 1; j >= 0; j--) {
                    M[i][j] = count;
                    count++;
                }
            }
        }
    }

    public static int[][] nouvelleMatriceEnSerpentin(int n) {
        int[][] M = new int[n][n];
        remplirCetteMatriceEnSerpentin(M);
        return M;
    }

    public static void afficherMatrice(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] Q = MatriceEnSerpentin.nouvelleMatriceEnSerpentin(4);
        afficherMatrice(Q);
    }
}

