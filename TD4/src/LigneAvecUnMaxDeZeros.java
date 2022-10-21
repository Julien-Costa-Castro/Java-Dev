public class LigneAvecUnMaxDeZeros {

    public static int ligneAvecUnMaxDeZeros(int[][] M) {
        int max = 0;
        int count = 0;
        int x = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 0) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                x = i;
            }
            count = 0;
        }
        return x;
    }
}
