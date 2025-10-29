import java.util.Scanner;

public class NilaiKelompok15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai;
        float totalNilai, rataNilai;
        float rataTertinggi = 0;
        int kelompokTertinggi = 0;

        int i = 1;
        while (i <= 6) {
            System.out.println("\nKelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari penilai ke-" + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai kelompok " + i + " adalah: " + rataNilai);

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println("\nKelompok dengan rata-rata tertinggi adalah kelompok ke-" 
                           + kelompokTertinggi + " dengan nilai rata-rata " + rataTertinggi);
        sc.close();
    }
}
