package tesarkademy;

public class kelas3 {

    public static void main(String[] args) {
        cetak_gambar(5);
    }

    private static void cetak_gambar(int a) {
        int i, j;
        for (i = 0; i < a+(2*(a-4)); i++) {
            if (i == (a+(2*(a-4)))/2) {
                System.out.print("panjang");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                if (i == a / 2 || j == 0 || j == a - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("=  ");
                }
            }
            System.out.println();
        }
    }
}
