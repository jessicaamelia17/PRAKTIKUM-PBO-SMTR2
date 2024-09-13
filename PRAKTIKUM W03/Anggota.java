public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPinjaman){
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman =0;
    }
    public String getNama(){
        return nama;
    }

    public String noKtp(){
        return nomorKTP;
    }

    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public int getLimitPinjaman(){
        return limitPinjaman;
    }

    public void pinjam(int jumlah){
        if (jumlahPinjaman + jumlah > limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlah){
        if (jumlah < jumlahPinjaman * 0.1) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        } else {
            jumlahPinjaman -= jumlah;
            if (jumlahPinjaman < 0) {
                jumlahPinjaman = 0;
            }
        }
    }
}
