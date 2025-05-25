import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 3 ; i++) {
            int golonganI = 1500;
            int golonganII = 2500;
            int golonganIII = 3500;
            int totalGaji = 0;
            int gajiPokok = 0;
            int bonus = 0;

            Scanner input = new Scanner(System.in);
            System.out.print("Golongan karyawan (1, 2, 3): ");
            int golongan = input.nextInt();
            System.out.print("Jam Kerja: ");
            int jamKerja = input.nextInt();

            if (jamKerja > 160) {
                bonus = 500000;
            }

            if (golongan == 1) {
                gajiPokok = jamKerja * golonganI;
                totalGaji = gajiPokok + bonus;
                System.out.println(totalGaji);
            }else if (golongan == 2) {
                gajiPokok = jamKerja * golonganII;
                totalGaji = gajiPokok + bonus;
                System.out.println(totalGaji);
            }else if(golongan == 3) {
                gajiPokok = jamKerja * golonganIII;
                totalGaji = gajiPokok + bonus;
                System.out.println(totalGaji);
            }

            System.out.println();
        }
    }
}
