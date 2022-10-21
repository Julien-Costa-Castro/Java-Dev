public class Main {
    public static void main(String[] args){
        int[][] M = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] N = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        afficherMatrice(Additionner.additionner(M, N));
    }

    public static void afficherMatrice(int[][] matrice){
            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[0].length; j++) {
                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println();
            }
        }
}