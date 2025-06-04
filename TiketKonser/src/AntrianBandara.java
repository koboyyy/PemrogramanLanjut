import java.util.PriorityQueue;

public class AntrianBandara {
    public static void main(String[] args) {
        PriorityQueue<Integer> antrian = new PriorityQueue<>();

        // MASUKKAN PRIORITY PENUMPANG
        antrian.add(3); // economy class
        antrian.add(1); // first class
        antrian.add(2); // bussines class
        antrian.add(1); // first class
        antrian.add(3); // economy class

        // proses antrian berdasarkan prioritas
        System.out.println("memperoses penumpang berdasarkan prioritas");
        while (!antrian.isEmpty()) {
            int prioritas = antrian.poll(); // ambil prioritas terkecil
            System.out.println("Penumpang prioritas: " + prioritas);
        }

    }
}