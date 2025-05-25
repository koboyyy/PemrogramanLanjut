import java.util.Scanner;

public class OperatorPerbandingan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        boolean hasil;

//        a. Operator Perbandingan (!=)
        System.out.println("A. Operator Perbandingan (!=)");
        System.out.print("Masukkan nilai x: ");
        x = input.nextInt();

        System.out.print("Masukkan nilai y: ");
        y = input.nextInt();

        hasil = x != y;

        System.out.println("Hasil perbandingan (!=): " + hasil);

//        Operator Perbandingan (>=)
        System.out.println("B. Operator Perbandingan (>=)");
        System.out.print("Masukkan nilai x: ");
        x = input.nextInt();

        System.out.print("Masukkan nilai y: ");
        y = input.nextInt();

        hasil = x >= y;

        System.out.println("Hasil perbandingan (>=): " + hasil);

//        Operator Perbandingan (==)
        System.out.println("C. Operator Perbandingan (==)");
        System.out.println("Hasil Perbandingan Operator (==): " + ("salah satu tujuan hidup saya adalah membahagiakan orang tua" == "Salah satu tujuan hidup saya adalah membahagiakan orang tua"));

    }
}
