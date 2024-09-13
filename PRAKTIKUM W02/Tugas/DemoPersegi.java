package Tugas;

public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang persegi1 = new PersegiPanjang();
        persegi1.panjang = 25;
        persegi1.lebar = 10;

        persegi1.displayInfo();
        System.out.println("Luas Persegi Panjang    : " + persegi1.getLuas());
        System.out.println("Keliling Persegi Panjang: " + persegi1.getKeliling());
    }
}
