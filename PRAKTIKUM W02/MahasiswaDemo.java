public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "012345";
        m2.nama = "Jessica Amelia";
        m2.alamat = "Blitar, Jawa Timur";
        m2.kelas = "2A";
        
        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "045673";
        m3.nama = "Dhevina Agustina";
        m3.alamat = "Malang, Jawa Timur";
        m3.kelas = "2A";

        m1.displayBiodata();
        m2.displayBiodata();
        m3.displayBiodata();
    }

}
