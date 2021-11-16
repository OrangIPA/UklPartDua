package eyy;

import java.util.ArrayList;

public class JenisLaundry {
    private ArrayList<String> jenisLndry = new ArrayList<>();
    private ArrayList<Integer> harga = new ArrayList<>();
    private ArrayList<Integer> durasi = new ArrayList<>();

    public JenisLaundry(){
        addJenis(null, 0, 0);
        addJenis("Normal", 3, 4000);
        addJenis("Faster", 2, 6000);
        addJenis("Fastest", 1, 8000);
    }

    public String getJenis(int args){
        return this.jenisLndry.get(args);
    }

    public int getJumlahJenis(){
        return jenisLndry.size();
    }

    public int getHarga(int args){
        return this.harga.get(args);
    }

    public int getDurasi(int args){
        return this.durasi.get(args);
    }

    public void addJenis(String jenis, int durasi, int harga){
        this.jenisLndry.add(jenis);
        this.durasi.add(durasi);
        this.harga.add(harga);
    }

    public void editDurasi(int id, int durasi){
        this.durasi.set(id, durasi);
    }

    public void editHarga(int id, int harga){
        this.harga.set(id, harga);
    }
}
