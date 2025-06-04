public static void main() {
    PriorityQueue<Pasien> priorityQueue = new PriorityQueue<>();

    Pasien pasien1 = new Pasien("Dika", "Laki-laki", "Flu", "Samsul", 19, 6000000);
    Pasien pasien2 = new Pasien("Rahma", "Perempuan", "Gagal Ginjal", "Tito", 15, 6000000);
    Pasien pasien3 = new Pasien("Marjono", "Laki-laki", "Demam Tinggi", "Ferdi", 25, 6000000);

    priorityQueue.add(pasien1);
    priorityQueue.add(pasien2);
    priorityQueue.add(pasien3);

    int index = 1;
    while (!priorityQueue.isEmpty()) {
        System.out.println(index + ". Menangani " + priorityQueue.poll());
        index++;
    }
}
