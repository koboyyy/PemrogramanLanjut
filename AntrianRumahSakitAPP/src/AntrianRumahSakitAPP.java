import java.util.PriorityQueue;

class AntrianRumahSakitAPP{
    public static void main() {
        PriorityQueue<Pasien> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new Pasien("Dono", "Sakit Gigi", "18.00", "HIJAU"));
        priorityQueue.add(new Pasien("Joko", "Flu", "19.00", "HIJAU"));
        priorityQueue.add(new Pasien("Indro", "Serangan Jantung", "19.20", "MERAH"));

        while (!priorityQueue.isEmpty()) {
            System.out.println("Menangangi " + priorityQueue.poll());
        }
    }
}


