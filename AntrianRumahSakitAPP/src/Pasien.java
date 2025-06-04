public class Pasien implements Comparable<Pasien> {

    String nama;
    String kondisi;
    String waktuKedatangan;
    int prioritas;

    public Pasien (String nama, String kondisi, String waktuKedatangan, String prioritas) {
        this.nama = nama;
        this.kondisi = kondisi;
        this.waktuKedatangan = waktuKedatangan;

        switch (prioritas) {
            case "MERAH" -> this.prioritas = 1;
            case "KUNING" -> this.prioritas = 2;
            case "HIJAU" -> this.prioritas = 3;
            case "HITAM" -> this.prioritas = 4;
        }
    }

    @Override
    public int compareTo(Pasien lain) {
        return Integer.compare(this.prioritas, lain.prioritas);
    }

    @Override
    public String toString() {
        return "Pasien{" +
                "nama=' " + nama + '\'' +
                ", Kondisi Medis= " + kondisi +
                ", Waktu Kedatangan='" + waktuKedatangan + '\'' +
                ", Triage=" + prioritas +
                '}';
    }
}
