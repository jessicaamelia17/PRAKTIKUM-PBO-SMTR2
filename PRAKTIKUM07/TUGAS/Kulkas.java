package TUGAS;

public class Kulkas extends AlatElektronik {
    // Atribut tambahan
    String jumlahPintu;

    // Constructor tanpa parameter
    public Kulkas() {
        super(); // Memanggil constructor parent class tanpa parameter
        this.jumlahPintu = "Tidak diketahui";
    }

    // Constructor dengan parameter
    public Kulkas(String merk, int dayaListrik, double harga, String jumlahPintu) {
        super(merk, dayaListrik, harga); // Memanggil constructor parent class berparameter
        this.jumlahPintu = jumlahPintu;
    }

    // Overriding method infoAlatElektronik
    @Override
    public void infoAlatElektronik() {
        super.infoAlatElektronik(); // Memanggil method dari parent class
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("hi");
    }
}

