package Tugas;

// Kelas Motor, turunan dari Kendaraan
public class Motor extends Kendaraan {
    String jenisMotor;

    // Konstruktor untuk kelas Motor
    public Motor(String merek, int kecepatan, String jenisMotor) {
        super(merek, kecepatan); // Memanggil konstruktor dari kelas induk Kendaraan
        this.jenisMotor = jenisMotor;
    }

    // Implementasi abstract method bergerak
    @Override
    public void bergerak() {
        System.out.println("Motor bergerak melalui langkah-langkah berikut:");
        System.out.println("- Hidupkan mesin dengan tombol starter atau kick starter.");
        System.out.println("- Mesin menghasilkan tenaga melalui pembakaran bahan bakar.");
        System.out.println("- Tenaga diteruskan ke roda melalui transmisi.");
        System.out.println("- Pengendara menekan gas untuk mengatur kecepatan.");
        System.out.println("- Roda depan dan belakang berputar, menggerakkan motor maju.");
    }

    // Method untuk menampilkan informasi Motor
    @Override
    public void tampilkanInfo() {
        System.out.println("Informasi Motor:");
        super.tampilkanInfo();
        System.out.println("Jenis Motor: " + jenisMotor);
    }
}


