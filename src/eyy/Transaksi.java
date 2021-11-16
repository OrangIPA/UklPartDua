package eyy;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList<Integer> idClient = new ArrayList<>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<>();
    private ArrayList<Integer> banyak = new ArrayList<>();

    public void proses(Client client, Transaksi transaksi, JenisLaundry jenisLaundry){
        Scanner input = new Scanner(System.in);
        int id, idJenisLaundry;

        System.out.println("Welcome To Da Best Laundry e4");

        System.out.print("Masukkan Id Anda : ");
        id = input.nextInt();

        while (true){
            System.out.print("Masukkan Kode Jenis Laundry : (0 jika sudah)");
            idJenisLaundry = input.nextInt();
            if(idJenisLaundry == 0){
                break;
            }
            if(idJenisLaundry > jenisLaundry.getJumlahJenis()){
                System.out.println("input salah!");
                continue;
            }

            this.idClient.add(id);
            this.idJenisLaundry.add(idJenisLaundry);
            System.out.print("Laundry " + jenisLaundry.getJenis(idJenisLaundry) + " sebanyak (kg): ");
            this.banyak.add(input.nextInt());

        }
        System.out.println("\ntransaksi belanja " + client.getNama(id) + " sebagai berikut:");
        System.out.println("Nama Barang \tbanyak(kg)\tharga\tjumlah \t");

        int total = 0, jumlah;
        int x = this.idJenisLaundry.size();
        for (int i = 1; i < x-1; i++){
            jumlah = banyak.get(i) * jenisLaundry.getHarga(this.idJenisLaundry.get(i));
            total += jumlah;
            System.out.println(jenisLaundry.getJenis(this.idJenisLaundry.get(i)) + "\t\t\t" + this.banyak.get(i) + "\t\t\t" + jenisLaundry.getHarga(i) + "/kg\t" + jumlah);
            transaksi.setTransaksi(jenisLaundry, id, this.idJenisLaundry.get(i), banyak.get(i));
        }

        System.out.println("Total Laundry : " + total);
        if(total > client.getSaldo(id)){
            System.out.println("Maaf, saldo anda kurang");
            System.exit(0);
        }
        client.editSaldo(id, client.getSaldo(id) - total);
        System.out.println("Sisa Saldo " + client.getNama(id) + " = " + client.getSaldo(id));
    }

    public void setTransaksi(JenisLaundry jenisLaundry, int idClient, int idJenis, int banyak){
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenis);
        this.banyak.add(banyak);
        jenisLaundry.editDurasi(idJenis, jenisLaundry.getDurasi(idJenis));
    }

    public int getIdjenisLaundry(int id){
        return this.idJenisLaundry.get(id);
    }

    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }

    public int getJmlTransaksi(){
        return this.idJenisLaundry.size();
    }
}
