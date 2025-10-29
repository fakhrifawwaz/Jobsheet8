import java.util.Scanner;

public class KopiSenja15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        int totalSemuaPelanggan = 0;
        int totalSemuaItem = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            totalSemuaPelanggan += jumlahPelanggan;
            totalSemuaItem += totalItemCabang;
        }

        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("- Pelanggan: " + totalSemuaPelanggan + " orang");
        System.out.println("- Item terjual: " + totalSemuaItem);

        sc.close();
    }
}
