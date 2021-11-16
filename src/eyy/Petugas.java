package eyy;

import java.util.ArrayList;

public class Petugas implements User{

    public Petugas(String namaPetugas, String alamat, String telepon, Integer jabatan){
        setNama(namaPetugas);
        setAlamat(alamat);
        setTelepon(telepon);
        setJabatan(jabatan);
    }

    private ArrayList<String> namaPetugas = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    private ArrayList<Integer> jabatan = new ArrayList<>();

    public String getNama(int args){
        return namaPetugas.get(args);
    }

    public String getAlamat(int args) {
        return alamat.get(args);
    }

    public String getTelepon(int args) {
        return telepon.get(args);
    }

    public Integer getJabatan(int args){
        return jabatan.get(args);
    }

    public void setNama(String args){
        namaPetugas.add(args);
    }

    public void setAlamat(String args) {
        alamat.add(args);
    }

    public void setTelepon(String args) {
        telepon.add(args);
    }

    public void setJabatan(Integer args){
        jabatan.add(args);
    }

    public void editJabatan(int index, Integer args){
        jabatan.set(index, args);
    }
}
