import java.util.Scanner;


public class MiniMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan No. Faktur: ");
        String noFaktur = scanner.nextLine();

        System.out.println("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.println("Masukkan Nama Barang: ");
        String namaBarang = scanner.nextLine();

        System.out.println("Masukkan Harga Barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.println("Masukkan Jumlah Barang: ");
        int jumlahBarang = scanner.nextInt();

        // Exception Handling: Menggunakan try-catch untuk memeriksa input jumlah barang
        try {
            if (jumlahBarang < 0) {
                throw new IllegalArgumentException("Jumlah barang tidak boleh negatif!");
            }

            BarangBayangan barang = new BarangBayangan(noFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBarang);
            System.out.println("\nData Barang:");
            barang.display();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); 
        }
    }
}
