import java.util.PriorityQueue;

// Contoh penggunaan dalam Main Class
public class PatientQueueSystem {
    public static void main(String[] args) {
        // Membuat PriorityQueue dengan custom comparator
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>(new PatientPriorityComparator());

        // Menambahkan pasien ke antrean
        patientQueue.add(new Patient("Zikri", "Sakit Gigi", Priority.LOW));
        patientQueue.add(new Patient("Dontol", "Gagal Ginjal", Priority.HIGH));
        patientQueue.add(new Patient("Adit", "Gerd", Priority.MEDIUM));

        // Mengambil pasien dari antrean (yang memiliki prioritas tertinggi akan keluar lebih dulu)
        int index = 1;
        while (!patientQueue.isEmpty()) {
            Patient nextPatient = patientQueue.poll(); // poll() mengambil dan menghapus elemen teratas
            System.out.println(index + " .Menangani: " + nextPatient);
            index += 1;
        }
    }
}
