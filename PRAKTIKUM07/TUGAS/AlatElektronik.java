package TUGAS;

public class AlatElektronik {
    // Atribut
    String merk;
    int dayaListrik;
    double harga;

    // Constructor tanpa parameter
    public AlatElektronik() {
        this.merk = "Default Merk";
        this.dayaListrik = 0;
        this.harga = 0.0;
    }

    // Constructor dengan parameter
    public AlatElektronik(String merk, int dayaListrik, double harga) {
        this.merk = merk;
        this.dayaListrik = dayaListrik;
        this.harga = harga;
    }

    // Method infoAlatElektronik
    public void infoAlatElektronik() {
        System.out.println("Merk: " + merk);
        System.out.println("Daya Listrik: " + dayaListrik + " Watt");
        System.out.println("Harga: Rp " + harga);
    }
}

