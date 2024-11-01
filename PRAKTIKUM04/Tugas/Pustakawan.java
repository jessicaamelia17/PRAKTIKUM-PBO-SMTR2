package Tugas;

import java.util.ArrayList;

public class Pustakawan {
    private String nama;
    private int idPustakawan;
    private ArrayList<Peminjaman> daftarPinjamanDiproses;

    public Pustakawan(String nama, int idPustakawan) {
        this.nama = nama;
        this.idPustakawan = idPustakawan;
        this.daftarPinjamanDiproses = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIdPustakawan() {
        return idPustakawan;
    }

    public void setIdPustakawan(int idPustakawan) {
        this.idPustakawan = idPustakawan;
    }

    public ArrayList<Peminjaman> getDaftarPinjamanDiproses() {
        return daftarPinjamanDiproses;
    }

    public void kelolaPinjaman(Anggota anggota, Buku buku, boolean pinjam) {
        System.out.println("Pustakawan " + nama + " memproses pinjaman buku " + buku.getJudul() + " untuk anggota " + anggota.getNama());
    }

    public void lihatDataAnggota(Anggota anggota) {
        System.out.println("Data Anggota: " + anggota.getNama() + ", Alamat: " + anggota.getAlamat());
    }
}
