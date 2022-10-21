public class CarréMagique {

        public static void remplirEnCarréMagique(int[][] M) {
            int n = M.length;
            int ligne = 0;
            int colonne = n/2;
            int k = 1;
            while (k <=n*n){
                M[ligne][colonne]=k++;
                int ligne2 = ligne;
                int colonne2 = colonne;
                ligne--;
                colonne++;
                if(ligne < 0){
                    ligne = n-1;
                }
                if(colonne >= n){
                    colonne = 0;
                }
                if(M[ligne][colonne] != 0){
                    ligne = ligne2 + 1;
                    colonne = colonne2;
                }
            }
        }

        public static int constanteMagiqueDe(int[][] CM) {
            int n = CM.length;
            int sum = 0;
            for (int i = 0; i < n ; i++) {
                sum = sum + CM[0][i];
            }
            return sum;
        }

        public static boolean cEstUnCarréMagique(int[][] T) {
            int n = T.length;
            int sum = constanteMagiqueDe(T);
            int sum2 = 0;
            int sum3 = 0;
            int sum4 = 0;
            int sum5 = 0;
            int sum6 = 0;
            int sum7 = 0;
            int sum8 = 0;
            for (int i = 0; i < T.length; i++) {
                for (int j = 0; j < T[0].length; j++) {
                    sum2 = sum2 + T[i][j];
                    sum3 = sum3 + T[j][i];
                    sum4 = sum4 + T[i][i];
                    sum5 = sum5 + T[i][n - i - 1];
                    sum6 = sum6 + T[j][n - j - 1];
                    sum7 = sum7 + T[n - i - 1][j];
                    sum8 = sum8 + T[n - j - 1][i];
                }
                if (sum2 != sum || sum3 != sum || sum4 != sum || sum5 != sum || sum6 != sum || sum7 != sum || sum8 != sum) {
                    return false;
                }
            }
            return true;
        }

        public static void afficherCarré(int[][] carré) {
            for (int i = 0; i <carré.length ; i++) {
                for (int j = 0; j <carré[0].length ; j++) {
                    System.out.print(carré[i][j]+" ");
                }
                System.out.println();
            }
        }

        public static void main(String argv[]) {
            int[][] m = new int[3][3];
            remplirEnCarréMagique(m);
            afficherCarré(m);
            System.out.println(constanteMagiqueDe(m));
            System.out.println(cEstUnCarréMagique(m));
        }
    }


