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
        for (int i = 0; i < P.length ; i++) {
            for (int j = 0; j < P[0].length; j++) {
                if (P[i][j] != Q[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
