import java.util.Scanner;

public class CekBeratBadan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int bb;
        double tb;
        double tbkuadrat;
        double bmi;


        System.out.print("Berat badan: ");
        bb = input.nextInt();

        System.out.print("Tinggi badan: ");
        tb = input.nextInt();

        tbkuadrat = tb/100 * tb/100;

        bmi = bb / tbkuadrat;

        System.out.printf("Indeks Massa Tubuh = %.2f", bmi);
        System.out.println();

        if(bmi < 18.5){
            System.out.println("-- Anda bertubuh kurus --");
        }else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("-- berat badan anda normal --");
        }else if (bmi >= 25 && bmi <= 29.9){
            System.out.println("-- berat badan anda normal --");
        }else if (bmi > 30){
            System.out.println("-- Anda bertubuh sangat gemuk --");
        }
    }
}
