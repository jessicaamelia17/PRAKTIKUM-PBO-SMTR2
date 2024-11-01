package Tugas;

import java.time.LocalDate;

public class PerpustakaanDemo {

    public static void main(String[] args) {
        System.out.println("=====================");
        System.out.println("|Perpustakaan Jessys|");
        System.out.println("=====================");
        // Membuat objek Buku, Anggota, dan Pustakawan
        Buku buku1 = new Buku("Pemrograman Java", "John Doe", 2020, "123456789");
        Buku buku2 = new Buku("Algoritma dan Struktur Data", "Jane Smith", 2019, "987654321");
        Buku buku3 = new Buku("Basis Data", "Alex Johnson", 2021, "111222333");

        Anggota anggota1 = new Anggota("Alice", "Jl. Mawar", 1);
        Anggota anggota2 = new Anggota("Bob", "Jl. Melati", 2);
        Anggota anggota3 = new Anggota("Charlie", "Jl. Kamboja", 3);
        
        Pustakawan pustakawan1 = new Pustakawan("Jessie", 101);

        // Anggota meminjam buku
        System.out.println("--- Peminjaman Buku ---");
        anggota1.pinjamBuku(buku1, pustakawan1);
        anggota2.pinjamBuku(buku2, pustakawan1);
        anggota3.pinjamBuku(buku3, pustakawan1);

        // Simulasi pengembalian buku setelah beberapa hari
        System.out.println("\n--- Pengembalian Buku ---");
        
        // Alice terlambat mengembalikan buku (diatur telat 5 hari setelah tanggal kembali seharusnya)
        System.out.println("Alice terlambat mengembalikan buku:");
        LocalDate tanggalPengembalianAlice = anggota1.getDaftarPinjam().get(0).getTanggalKembali().plusDays(5);
        anggota1.getDaftarPinjam().get(0).setTanggalPengembalianAktual(tanggalPengembalianAlice);  // Telat 5 hari
        
        // Bob tepat waktu mengembalikan buku
        System.out.println("\nBob mengembalikan buku tepat waktu:");
        anggota2.getDaftarPinjam().get(0).setTanggalPengembalianAktual(LocalDate.now());  // Tepat waktu
        
        // Charlie tepat waktu mengembalikan buku
        System.out.println("\nCharlie mengembalikan buku tepat waktu:");
        anggota3.getDaftarPinjam().get(0).setTanggalPengembalianAktual(LocalDate.now());

        // Pustakawan melihat data anggota
        System.out.println("\n--- Data Anggota ---");
        pustakawan1.lihatDataAnggota(anggota1);
        pustakawan1.lihatDataAnggota(anggota2);
        pustakawan1.lihatDataAnggota(anggota3);
    }
}
