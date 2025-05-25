import java.util.Scanner;
public class OperatorBetwise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int hasil;

//        Operator Betwise (|)

        System.out.print("Masukkan nilai variabel a: ");
        x = input.nextInt();
        System.out.print("Masukkan nilai variabel b: ");
        y = input.nextInt();

        hasil = x | y;

        System.out.println("Hasil Operator Betwise (|) = " + hasil);

//        Operator Betwise (~)
        System.out.print("Masukkan nilai variabel b: ");
        y = input.nextInt();

        hasil = ~y;

        System.out.println("Hasil Operator Betwise (~) = " + hasil);

//        Operator Betwise (>>)
        System.out.print("Masukkan nilai variabel a: ");
        x = input.nextInt();

        hasil = x>>1;

        System.out.println("Hasil Operator betwise (>>) = " + hasil);

    }
}