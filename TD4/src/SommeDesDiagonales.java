public class SommeDesDiagonales {
    public static int sommeDesDiagonales(int[][] M) {
        int sum = 0;
        for (int i = 0; i < M.length; i++) {
            sum += M[i][i];
            sum += M[i][M.length - 1 - i];
        }
        if (M.length % 2 == 1) {
            sum -= M[M.length / 2][M.length / 2];
        }
        return sum;
    }

}

