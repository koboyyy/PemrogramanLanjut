import java.util.Comparator;

// Comparator untuk PriorityQueue (mengurutkan dari prioritas tinggi ke rendah)
public class PatientPriorityComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient p1, Patient p2) {
        // Mengurutkan berdasarkan level prioritas (tinggi ke rendah)
        // Jika level sama, bisa ditambahkan kriteria lain (misalnya, waktu kedatangan)
        return Integer.compare(p2.getPriority().getLevel(), p1.getPriority().getLevel());
    }
}