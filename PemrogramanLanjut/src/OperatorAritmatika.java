import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int hasil;

//        Operator Pertambahan (+)
        System.out.println("A. Pertambahan (+)");

        System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();

        hasil = a + b;

        System.out.println("Hasil dari " + a + " + " + b + " = " + hasil);

//        Operator Pengurangan (-)
        System.out.println("B. Pengurangan (-)");

        System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();

        hasil = a - b;

        System.out.println("Hasil dari" + a + " - " + b + " = " + hasil);

//        Operator Pembagian (/)
        System.out.println("D. Pembagian (/)");

        System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();

        hasil = a / b;

        System.out.println("Hasil dari " + a + " / " + b + " = " + hasil);
//        Operator Perkalian (*)
        System.out.println("C. Perkalian (*)");

        System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();

        hasil = a * b;

        System.out.println("Hasil dari " + a + " * " + b + " = " + hasil);
        


//        Operator Sisa Bagi (%)
        System.out.println("E. Sisa Bagi (%)");

        System.out.print("Masukkan angka pertama: ");
        a = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        b = input.nextInt();

        hasil = a % b;

        System.out.println("Hasil dari " + a + " % " + b + " = " + hasil);
    }
}
