import java.util.Scanner;

public class OperatorPenugasan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;

//        A. Operator pengisian nilai (=)
        System.out.println("A. Pengisian nilai (x)");
        System.out.print("Masukkan nilai x: ");
        x = input.nextInt();
        System.out.println("Nilai x saat ini: " + x);
        System.out.println();

//        B. Operator Pengisian dan penambahan
        System.out.println("B. Pengisian nilai (x) dan Penambahan (+)");
        System.out.print("Masukkan nilai x: ");
        x = input.nextInt();
        x += 20;
        System.out.println("Nilai x setelah di tambah 20 menjadi " + x);
        System.out.println();

//        C. Operator Pengisian dan pengurangan
        System.out.println("C. Pengisian nilai (x) dan Pengurangan (-)");
        System.out.print("Masukkan nilai x: ");
        x = input.nextInt();
        x -= 30;
        System.out.println("Nilai x setelah dikurang dengan 30 menjadi " + x);
        System.out.println();


//        D. Operator Pengisian dan Perkalian
        System.out.println("D. Pengisian nilai (x) dan Perkalian (*)");
        System.out.print("Masukkan nilai X: ");
        x = input.nextInt();
        x *= 7;
        System.out.println("Nilai x setelah di kali dengan 7 menjadi " + x);
        System.out.println();


//        C. Operator Pengisian dan Pembagian
        System.out.println("E. Pengisian nilai (x) dan Pembagain (/)");
        System.out.print("Masukkan nilai x: ");
        x = input.nextInt();
        x /= 15;
        System.out.println("Nilai x setelah dibagi dengan 15 menjadi " + x);
        System.out.println();


//        D. Operator Pengisian dan Sisa Bagi
        System.out.println("F. Pengisian nilai (x) dan Sisa Bagi (%)");
        System.out.print("Masukkan nilai X: ");
        x = input.nextInt();
        x %= 18;
        System.out.println("Hasil sisa bagi X dari 18 = " + x);
        System.out.println();


    }
}

