package Tugas;

// Kelas abstrak Kendaraan
public abstract class Kendaraan {
    String merek;
    int kecepatan;

    // Konstruktor untuk kelas Kendaraan
    public Kendaraan(String merek, int kecepatan) {
        this.merek = merek;
        this.kecepatan = kecepatan;
    }

    // Method untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }

    // Abstract method bergerak
    public abstract void bergerak();
}

