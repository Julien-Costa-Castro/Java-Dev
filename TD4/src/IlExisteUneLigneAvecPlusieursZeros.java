public class IlExisteUneLigneAvecPlusieursZeros {

    public static boolean ilExisteUneLigneAvecPlusieursZeros(int[][] M){
        int count = 0;
        boolean x = true;
        int i = 0;
        while (i < M.length && x) {
            int j = 0;
            while (j < M[0].length && x) {
                if (M[i][j] == 0) {
                    count++;
                }
                j++;
            }
            if (count > 1) {
                x = false;
            }
            count = 0;
            i++;
        }
        return x;
    }
}

