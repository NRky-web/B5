package tesarkademy;

public class kelas1 {

    public static void main(String[] args) {
        count_vowels("programmer");
    }
    private static void count_vowels(String kalimat){
        int[] jum = new int[256];
        for(int i=0; i<256; i++){
            jum[i] = 0;
        }
        int jumlahVokal = 0;
        for(int i=0; i<kalimat.length(); i++){
            jum[(int)kalimat.charAt(i)]++;
            if(kalimat.charAt(i)=='a'||kalimat.charAt(i)=='i'||kalimat.charAt(i)=='u'||
                    kalimat.charAt(i)=='e'||kalimat.charAt(i)=='o'){
                jumlahVokal++;
            }
        }
        System.out.println("jumlah huruf vokal dalam kalimat\n'" + kalimat + "'\nadalah : " + jumlahVokal);
    }
}
