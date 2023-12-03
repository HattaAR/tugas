import java.text.SimpleDateFormat;
import java.util.Date;

class BarangBayangan extends Barang implements Payment {
    private String noFaktur;
    private String namaPelanggan;
    private String currentDate;11

    public BarangBayangan(String noFaktur, String namaPelanggan, String namaBarang, double hargaBarang, int jumlahBarang) {
        super(namaBarang, hargaBarang, jumlahBarang);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, dd/MM/yyyy");
        Date date = new Date();
        this.currentDate = dateFormat.format(date);
    }

public double calculateTotal() {
        return hargaBarang * jumlahBarang;
    }

    public void display() {
        System.out.println("No. Faktur: " + noFaktur);
        System.out.println("Tanggal: " + currentDate);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        super.display();
        System.out.println("Total Bayar: " + calculateTotal());
    }
}


