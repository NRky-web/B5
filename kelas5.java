package tesarkademy;

import java.util.Arrays;

public class kelas1 {

    public static void main(String[] args) {
        char m[][] = {
            {'g', 'h', 'i', 'j'},
            {'a', 'c', 'b', 'e', 'd'},
            {'g', 'e', 'f'}};
        sort_array(m);
    }

    private static int sort_array(char m[][]) {
        int i, j, k;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                for (k = 0; k < m[i].length - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {
                        char t = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = t;
                    }
                }
            }
        }
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        return 0;
    }
}
