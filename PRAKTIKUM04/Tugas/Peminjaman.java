package Tugas;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Peminjaman {
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private LocalDate tanggalPengembalianAktual;
    private Buku bukuPinjam;
    private Anggota anggota;
    private Pustakawan pustakawan;
    private double denda;

    public Peminjaman(LocalDate tanggalPinjam, LocalDate tanggalKembali, Buku bukuPinjam, Anggota anggota, Pustakawan pustakawan) {
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.bukuPinjam = bukuPinjam;
        this.anggota = anggota;
        this.pustakawan = pustakawan;
        this.denda = 0;
        displayTanggalPeminjaman(); // Memunculkan tanggal saat buku dipinjam
    }

    // Menampilkan tanggal pinjam dan tanggal kembali
    public void displayTanggalPeminjaman() {
        System.out.println("Informasi Buku yang Dipinjam:");
        System.out.println("Judul Buku    : " + bukuPinjam.getJudul());
        System.out.println("Penulis Buku  : " + bukuPinjam.getPenulis());
        System.out.println("ISBN          : " + bukuPinjam.getISBN());
        System.out.println("Tanggal Peminjaman: " + tanggalPinjam);
        System.out.println("Tanggal Harus Dikembalikan: " + tanggalKembali);
        System.out.println("----------------------------------------");
    }

    // Menampilkan tanggal pengembalian
    public void displayTanggalPengembalian() {
        System.out.println("Informasi Buku yang Dikembalikan:");
        System.out.println("Judul Buku    : " + bukuPinjam.getJudul());
        System.out.println("Penulis Buku  : " + bukuPinjam.getPenulis());
        System.out.println("ISBN          : " + bukuPinjam.getISBN());
    
        if (tanggalPengembalianAktual != null) {
            System.out.println("Tanggal Pengembalian: " + tanggalPengembalianAktual);
            
            if (isTerlambat()) {
                System.out.println("Terlambat: " + hitungHariTerlambat() + " hari.");
                System.out.println("Denda: Rp " + getDenda());
            }
        } else {
            System.out.println("Buku belum dikembalikan.");
        }
        System.out.println("----------------------------------------");
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    public LocalDate getTanggalPengembalianAktual() {
        return tanggalPengembalianAktual;
    }

    public void setTanggalPengembalianAktual(LocalDate tanggalPengembalianAktual) {
        this.tanggalPengembalianAktual = tanggalPengembalianAktual;
        hitungDenda();
        displayTanggalPengembalian();
    }

    public Buku getBukuPinjam() {
        return bukuPinjam;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public Pustakawan getPustakawan() {
        return pustakawan;
    }

    public double getDenda() {
        return denda;
    }

    public void hitungDenda() {
        if (isTerlambat()) {
            denda = 5000 * hitungHariTerlambat();
        } else {
            denda = 0;
        }
    }

    public boolean isTerlambat() {
        // Cek apakah tanggal pengembalian aktual melebihi tanggal kembali
        return tanggalPengembalianAktual.isAfter(tanggalKembali);
    }

    public int hitungHariTerlambat() {
        // Hitung hari keterlambatan berdasarkan selisih antara tanggal kembali dan tanggal pengembalian aktual
        return (int) DAYS.between(tanggalKembali, tanggalPengembalianAktual);
    }
}
