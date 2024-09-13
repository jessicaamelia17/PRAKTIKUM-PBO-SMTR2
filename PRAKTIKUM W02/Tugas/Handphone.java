package Tugas;

public class Handphone {
    public String merk;
    public String model;
    public int kapasitasBaterai;
    public String sistemOperasi;
    public boolean isOn = false;

    //Method untuk menyalakan Handphone
    public void menyalakanHP(){
        if(!isOn && kapasitasBaterai >0){
            isOn = true;
            System.out.println("Handphone " + merk + " model " + model + "dinyalakan.");
        } else if(isOn){
            System.out.println("Handphone sudah dalam keadaan menyala.");
        } else {
            System.out.println("Baterai habis! Tidak bisa menyalakan Handphone.");
        }
    }
    
    //Method untuk mematikan handphone
    public void mematikanHP(){
        if(!isOn && kapasitasBaterai >0){
            isOn = false;
            System.out.println("Handphone " + merk + " model " + model + "dimatikan.");
        } else {
            System.out.println("Handphone sudah dalam keadaan mati.");
        }

    }

    //Method untuk mengambil foto
    public void mengambilFoto(){
        if(isOn){
            if(kapasitasBaterai > 5){ //Foto menghabiskan daya 5%
                kapasitasBaterai -=5;
                System.out.println("Foto berhasil diambil. Sisa baterai: " + kapasitasBaterai + "%");
            } else{
                System.out.println("Baterai tertlalu rendah untuk mengambil foto.");
            }
        } else{
            System.out.println("Tidak bosa mengambil foto, handphone dalam keadaan mati.");
        }
    }

    //Method untuk menampilkan informasi handphone
    public void displayInfo(){
        System.out.println("Merk            : " + merk);
        System.out.println("Model           : " + model);
        System.out.println("Sistem Operasi  : " + sistemOperasi);
        System.out.println("Kapasitas Baterai: " + kapasitasBaterai + "%");
        System.out.println("Status: " + (isOn? "Menyala" : "Mati") );
        System.out.println();
    }
}
