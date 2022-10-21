public class IlExisteUneLigneAvecPlusieursZeros {

    public static boolean ilExisteUneLigneAvecPlusieursZeros(int[][] M){
        int count = 0;
        boolean x = true;
        for (int i = 0; i < M.length ; i++) {
            for (int j = 0; j < M[0].length ; j++) {
                if (M[i][j] == 0){
                    count++;
                }
                if ( M[i][j] < count){
                    x = true;
                } else if (M[i][j] > count){
                    x = false;
                }
            }

        }
        return x;
    }
}
