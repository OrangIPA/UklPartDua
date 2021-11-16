package eyy;

public class Lapor {
    public static void laporan(Petugas petugas, int index){
        System.out.println("\nNama Petugas: " + petugas.getNama(index));
        System.out.println("Telp : " + petugas.getTelepon(index));
        System.out.println("Status : " + ((petugas.getJabatan(index) == 0) ? "Owner" : "Pegawai\n"));

    }
    public static void laporan(JenisLaundry jenisLaundry){
        int x = jenisLaundry.getJumlahJenis();
        System.out.println("Tabel Jenis Laundry");
        System.out.println("ID \tNama Jenis Laundry \tDurasi(hr) \tHarga/kg");
        for(int i = 1; i < x-1; i++){
            System.out.println(i + "\t" + jenisLaundry.getJenis(i) +"\t\t\t\t" + jenisLaundry.getDurasi(i) + "hr" + "\t\t\t" + jenisLaundry.getHarga(i) + "/kg");
        }
        System.out.println();
    }
    public static void laporan(Client client){
        int x = client.getJmlClient();

        System.out.println("Daftar Client\nID \tNama \t\tAlamat \t\t\t\t\tTelepon \t\tSaldo");

        for (int i = 0;i < x; i++){
            System.out.println(i + "\t" + client.getNama(i) + "\t" + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t" + client.getSaldo(i) + "\t");
        }
    }
    public static void laporan(Transaksi transaksi, JenisLaundry jenisLaundry){
        int x = transaksi.getJmlTransaksi();

        System.out.println("\nLaporan Transaksi\t");
        System.out.println("ID \tNama Jenis Laundry \t\tJumlah(Kg) \tharga/kg \tJumlah");

        int total = 0, jumlah;
        for (int i = 0; i < x; i++){
            jumlah = transaksi.getBanyaknya(i) * jenisLaundry.getHarga(transaksi.getIdjenisLaundry(i));
            total += jumlah;

            System.out.println((i+1) + "\t" + jenisLaundry.getJenis(transaksi.getIdjenisLaundry(i)) + "\t\t\t\t\t" + transaksi.getBanyaknya(i) + "Kg" + "\t\t\t" + jenisLaundry.getHarga(transaksi.getIdjenisLaundry(i)) + "/Kg" + "\t\t" + jumlah);
        }
        System.out.println("Total Omset = " + total);
    }
}
