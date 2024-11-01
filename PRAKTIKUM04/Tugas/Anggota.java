package Tugas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Anggota {
    private String nama;
    private String alamat;
    private int idAnggota;
    private ArrayList<Peminjaman> daftarPinjaman;

    public Anggota(String nama, String alamat, int idAnggota) {
        this.nama = nama;
        this.alamat = alamat;
        this.idAnggota = idAnggota;
        this.daftarPinjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public ArrayList<Peminjaman> getDaftarPinjam() {
        return daftarPinjaman;
    }

    public void pinjamBuku(Buku buku, Pustakawan pustakawan) {
        if (buku.isTersedia()) {
            Peminjaman pinjaman = new Peminjaman(LocalDate.now(), LocalDate.now().plusWeeks(2), buku, this, pustakawan);
            daftarPinjaman.add(pinjaman);
            buku.setTersedia(false);
            pustakawan.kelolaPinjaman(this, buku, true);
            System.out.println("Buku " + buku.getJudul() + " berhasil dipinjam.");
            System.out.println("----------------------------------------");
        } else {
            System.out.println("Buku " + buku.getJudul() + " tidak tersedia.");
            System.out.println("----------------------------------------");
        }
    }

}
