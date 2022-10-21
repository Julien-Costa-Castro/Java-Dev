public class SommeDesDiagonales {

        public static int[][] sommeDesDiagonales(int[][] M){
            int sum = 0;
            int y = M.length;
            for (int i = 0; i < M.length; i++) {
                sum = sum + M[i][i];
                sum = sum + M.length-i;
            }
            System.out.print(sum);
        return M;
        }
}



