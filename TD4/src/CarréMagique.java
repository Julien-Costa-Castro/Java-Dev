public class CarréMagique {

    public static void remplirEnCarréMagique(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                M[i][j] = 0;
            }
        }
        int n = M.length;
        int i = 0;
        int j = n / 2;
        int count = 1;
        while (count <= n * n) {
            M[i][j] = count;
            count++;
            int i1 = i;
            int j1 = j;
            i = (i - 1 + n) % n;
            j = (j + 1) % n;
            if (M[i][j] != 0) {
                i = (i1 + 1) % n;
                j = j1;
            }
        }
    }

    public static int constanteMagiqueDe(int[][] CM) {
        int n = CM.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + CM[0][i];
        }
        return sum;
    }

    public static boolean cEstUnCarréMagique(int[][] T) {
        boolean b = true;
        int n = T.length;
        int sum = constanteMagiqueDe(T);
        for (int i = 0; i < T.length; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < T[0].length; j++) {
                sum1 = sum1 + T[i][j];
                sum2 = sum2 + T[j][i];
            }
            if (sum1 != sum || sum2 != sum) {
                b = false;
            }
        }
        int sum3 = 0;
        int sum4 = 0;
        for (int k = 0; k < n; k++) {
            sum3 = sum3 + T[k][k];
            sum4 = sum4 + T[k][n - 1 - k];
        }
        if (sum3 != sum || sum4 != sum) {
            b = false;
        }
        return b;
    }

    /**
     * Donnée : un tableau d'entiers carré de n rangées et n colonnes
     * Résultat : affiche le tableau une rangée par ligne et en séparant les entiers sur chaque ligne par une tabulation
     */
    public static void afficherCarré(int[][] carré) {
        int n = carré.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(carré[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] M = {{8, 1, 6}, {3, 0, 7}, {4, 9, 2}};
        remplirEnCarréMagique(M);
        afficherCarré(M);
        System.out.println(cEstUnCarréMagique(M));
    }
}



