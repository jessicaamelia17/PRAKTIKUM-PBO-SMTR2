package TUGAS;

public class Demo {
    public static void main(String[] args) {
        // Membuat objek Laptop
        Laptop laptop1 = new Laptop("Asus", 65, 10000000, 15);
        System.out.println("Informasi Laptop:");
        laptop1.infoAlatElektronik();

        System.out.println("\n");

        // Membuat objek Kulkas
        Kulkas kulkas1 = new Kulkas("Samsung", 150, 3000000, "2 Pintu");
        System.out.println("Informasi Kulkas:");
        kulkas1.infoAlatElektronik();
        
    }
}

