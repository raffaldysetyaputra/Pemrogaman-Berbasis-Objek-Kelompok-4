package latihan.praktikum.inheritance;

public class Main {
    public static void main(String[] args) {
        Manajer mgr = new Manajer();

        mgr.IsiData("Sofwan Ali", "Teknologi Rekayasa Multimedia", 15000000);

        System.out.println("=== Data Manajer ===");
        mgr.tampilkanData();
    }
}