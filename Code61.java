// Common elements in all row of a given matrix in Java

/**
 * Code61
 */
public class Code61 {
    public static void main(String args[]) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 30 },
                { 27, 30, 37, 48 },
                { 32, 33, 39, 30 } };

        int N = 4, M = 4;

        for (int j = 0; j < N; j++) {
            int x = mat[0][j], count = 0;

            for (int i = 1; i < M; i++) {
                int flag = 0;
                for (int k = 0; k < N; k++) {
                    if (x == mat[i][k]) {
                        flag = 1;
                        mat[i][k] = -1;
                        break;
                    }
                }
                if (flag == 1) {
                    count++;
                }
            }

            if (count == M - 1)
                System.out.print(x);

        }
    }
}
