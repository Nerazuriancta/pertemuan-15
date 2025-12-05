import java.util.Scanner;

public class Tugas {
    static int fungsiRekursif (int N, int[] angka) {
        if (N == 0) {
            return (0);
        } else if (N == 1) {
            return (angka[0]);
        } else {
            return (angka[N-1] + fungsiRekursif(N-1, angka));   
        }
    }

    static int fungsiIteratif (int N, int [] angka) {
        int total = 0;

        for (int i = 0; i<angka.length; i++) {
            total += angka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angka;

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();
        angka = new int[N];

        for(int i = N; i > 0; i--) {
            System.out.print("Masukkan angka ke-"+i+": ");
            angka [i-1] = sc.nextInt();
        }

        int hasilRekursif = fungsiRekursif(N, angka);
        int hasilIteratif = fungsiIteratif(N, angka);

        System.out.println("Total dari "+N+" angka yang dimasukkan adalah: ");
        System.out.println("Hasil dengan rekursif: "+hasilRekursif);
        System.out.println("Hasil dengan iteratif: "+hasilIteratif);

        sc.close();
    }
}
