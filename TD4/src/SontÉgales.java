public class SontÉgales {
    public static boolean sontÉgales (int[][] P, int[][] Q){
        boolean x = false;
        for (int i = 0; i < P.length ; i++) {
            for (int j = 0; j < P[0].length ; j++) {
                if (P[i][j] == Q[i][j]){
                    x = true;
                }
                else x = false;
                if (!x) return false;
            }

        }
        return x;
    }
}
