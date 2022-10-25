import java.util.Scanner;
public class MatriceEnSerpentin {
    public static int[][] remplirCetteMatriceEnSerpentin(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] M = new int [n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n ; j++) {
                if (i % 2 == 0){
                    M[i][j] = i * n + j + 1;
                }
                else M[i][j] = n * (i + 1) - j;
            }
        return M;
        }
}
