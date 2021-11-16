package eyy;

public class Main {
    static JenisLaundry daftarJenisLaundry = new JenisLaundry();
    static Client daftarClient = new Client("OrangIPA", "Dekat Rumah Tetangga", "082223081940", 100000);
    static Petugas penjagaToko = new Petugas("Ginjal", "Dekat Rumah Tetangga", "987772619364", 0);
    static Transaksi transaksi = new Transaksi();

    public static void main(String[] args) {
        daftarClient.setNama("OrangIPS");
        daftarClient.setAlamat("Dekat Rumah Tetangga");
        daftarClient.setTelepon("293183749203");
        daftarClient.setSaldo(120000);
        Lapor.laporan(daftarClient);
        System.out.println();
        Lapor.laporan(daftarJenisLaundry);
        System.out.println();
        transaksi.proses(daftarClient, transaksi, daftarJenisLaundry);
        System.out.println();
        Lapor.laporan(penjagaToko, 0);
        Lapor.laporan(transaksi, daftarJenisLaundry);
    }
}
