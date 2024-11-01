package Tugas;

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Motor dengan konstruktor
        Motor motor = new Motor("Honda", 60, "Sport");
        
        // Menampilkan informasi Motor
        motor.tampilkanInfo();
        motor.bergerak();

        // Membuat objek Becak dengan konstruktor
        Becak becak = new Becak("Becak Kota", 10, 2);

        // Menampilkan informasi Becak
        becak.tampilkanInfo();
        becak.bergerak();
    }
}
