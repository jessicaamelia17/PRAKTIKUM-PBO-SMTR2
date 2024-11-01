public class AbstractClassDemo {
    public static void main(String[] args) {
        // Hewan hewan1 = new Hewan(10, "Rumput", "Savana");
        // hewan1.cetakInfo();
        // hewan1.bergerak();
        // hewan1.bernapas();

        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        lebah1.bernapas();

        Ular ular1 = new Ular(true, 2, "tikus", "hutan");
        ular1.cetakInfo();
        ular1.bergerak();
        ular1.bernapas();
    }
}
