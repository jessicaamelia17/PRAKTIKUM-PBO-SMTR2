package Tugas;

public class HandphoneDemo {
    public static void main(String[] args) {
        Handphone hp1 = new Handphone();
        hp1.merk = "Samsung";
        hp1.model = "Galaxy Z Flip6 ";
        hp1.sistemOperasi = "Android";
        hp1.kapasitasBaterai = 30;
        
        hp1.displayInfo();
        hp1.menyalakanHP();
        hp1.mematikanHP();
        hp1.mengambilFoto();
        System.out.println();
        
        Handphone hp2 = new Handphone();
        hp2.merk = "Apple";
        hp2.model = "iPhone 15 Pro Max ";
        hp2.sistemOperasi = "iOS";
        hp2.kapasitasBaterai = 80;
        hp2.displayInfo();
        hp2.menyalakanHP();
        hp2.mematikanHP();
        hp2.mengambilFoto();
        
        
    }
}
