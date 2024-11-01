package TUGAS;

public class Laptop extends AlatElektronik {
    // Atribut tambahan
    int ukuranLayar;

    // Constructor tanpa parameter
    public Laptop() {
        super(); // Memanggil constructor parent class tanpa parameter
        this.ukuranLayar = 0;
    }

    // Constructor dengan parameter
    public Laptop(String merk, int dayaListrik, double harga, int ukuranLayar) {
        super(merk, dayaListrik, harga); // Memanggil constructor parent class berparameter
        this.ukuranLayar = ukuranLayar;
    }

    // Overriding method infoAlatElektronik
    public void infoAlatElektronik() {
        super.infoAlatElektronik(); // Memanggil method dari parent class
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
    }

}

