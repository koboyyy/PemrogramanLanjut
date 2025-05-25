public class Perulangan2 {
    public static void main(String[] args) {
        // Bagian a
        System.out.println("Bagian A");
        for (int i = 25 ; i >= 1 ; i -= 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        // Bagian b
        System.out.println("Bagian B");
        for (int j = 2 ; j <= 50 ; j += 2){
            System.out.print(j + " ");
        }
    }
}
