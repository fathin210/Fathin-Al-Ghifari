package no4;
public class No4 {
    public void cekVocal(char[]a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 65 || a[i] == 97) {
                System.out.println("A");
                a[i] = ' ';
            }
            if (a[i] == 69 || a[i] == 101) {
                System.out.println("E");
                a[i] = ' ';
            }
            if (a[i] == 73 || a[i] == 105) {
                System.out.println("I");
                a[i] = ' ';
            }
            if (a[i] == 79 || a[i] == 111) {
                System.out.println("O");
                a[i] = ' ';
            }
            if (a[i] == 85 || a[i] == 117) {
                System.out.println("U");
                a[i] = ' ';
            }
        }
    }
        public void cekKonsonan(char[]a){
            for (int i = 0; i < a.length; i++) {
                if (a[i] == ' ') {
                    continue;
                }
                else{
                    System.out.println(a[i]);
                }
            }
        }
    public static void main(String[] args) {
        No4 coba = new No4();
        String a = "ARKADEMY";
        char [] arr = a.toCharArray();
        coba.cekVocal(arr);
        coba.cekKonsonan(arr);
    }
    
}