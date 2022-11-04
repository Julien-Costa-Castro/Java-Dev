public class Main {

    public static void main(String[] args) {
        int[][] M = new int[4][4];
        MatriceEnDiagonale.remplirCetteMatriceEnDiagonale(M);
        AfficherMatrice(M);
    }
    public static void AfficherMatrice(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }
}

