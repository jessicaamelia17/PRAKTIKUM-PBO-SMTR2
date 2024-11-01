package Tugas;

// Kelas Becak, turunan dari Kendaraan
public class Becak extends Kendaraan {
    int jumlahPenumpang;

    // Konstruktor untuk kelas Becak
    public Becak(String merek, int kecepatan, int jumlahPenumpang) {
        super(merek, kecepatan); // Memanggil konstruktor dari kelas induk Kendaraan
        this.jumlahPenumpang = jumlahPenumpang;
    }

    // Implementasi abstract method bergerak
    @Override
    public void bergerak() {
        System.out.println("Becak bergerak melalui langkah-langkah berikut:");
        System.out.println("- Pengemudi duduk di kursi dan menempatkan kaki pada pedal.");
        System.out.println("- Pengemudi mengayuh pedal yang terhubung ke rantai.");
        System.out.println("- Rantai memutar roda belakang, menggerakkan becak ke depan.");
        System.out.println("- Pengemudi dapat mengatur kecepatan dengan kekuatan kayuhan.");
        System.out.println("- Pengemudi mengarahkan becak menggunakan setang.");
    }

    // Method untuk menampilkan informasi Becak
    @Override
    public void tampilkanInfo() {
        System.out.println("\nInformasi Becak:");
        super.tampilkanInfo();
        System.out.println("Jumlah Penumpang: " + jumlahPenumpang);
    }
}


