package Tugas;

public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public void displayInfo(){
        System.out.println("Panjang Persegi: " + panjang);
        System.out.println("Lebar Persegi  : " + lebar);
    }

    public int getLuas(){
        return panjang * lebar;
    }

    public int getKeliling(){
        return 2 * (panjang + lebar);
    }
}
