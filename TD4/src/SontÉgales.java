public class SontÉgales {
    public static boolean sontÉgales(int[][] P, int[][] Q) {
        while (P.length != Q.length) {
            if (P[0].length != Q[0].length) {
                return false;
            }
            else {
                return true;
            }
        }
        int i = 0;
        while (i < P.length) {
            int j = 0;
            while (j < P[0].length) {
                if (P[i][j] != Q[i][j]) {
                    return false;
                }
                j++;
            }
            i++;
        }
        return true;
    }
}
