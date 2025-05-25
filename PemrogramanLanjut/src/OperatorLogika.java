import java.util.Scanner;

public class OperatorLogika {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean a;
        boolean b;
        boolean nilaiBoolean;

        System.out.print("Masukkan nilai a: ");
        a = input.nextBoolean();

        System.out.print("Masukkan nilai b: ");
        b = input.nextBoolean();

        nilaiBoolean = a && b;

        System.out.println("Hasil logika dari variable a dan variable b adalah: " + nilaiBoolean);

        nilaiBoolean = (45 <= 47) && (12 >= 9);

        System.out.println("Nilai boolean dari (45 <= 47) && (12 >= 9) adalah: " + nilaiBoolean);

        nilaiBoolean = ("Saya belajar pemrograman" == "Saya belajar pemrograman") || ('A' !=  'a');

        System.out.println("Nilai boolean dari operasi ketiga adalah: " + nilaiBoolean);

    }
}