public class SommeDesDiagonales {
    public static int sommeDesDiagonales(int[][] M) {
        int sum = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (i == j) {
                    sum += M[i][j];
                }
            }
        }
        if (M.length % 2 == 1) {
            sum -= M[M.length / 2][M.length / 2];
        }
        return sum;
    }
}



