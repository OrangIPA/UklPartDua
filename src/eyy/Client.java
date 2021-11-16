package eyy;

import java.util.ArrayList;

public class Client implements User {

    public Client(String namaClient, String alamat, String telepon, Integer saldo){
        setNama(namaClient);
        setAlamat(alamat);
        setTelepon(telepon);
        setSaldo(saldo);
    }

    private ArrayList<String> namaClient = new ArrayList<>();
    private ArrayList<String> alamat = new ArrayList<>();
    private ArrayList<String> telepon = new ArrayList<>();
    private ArrayList<Integer> saldo = new ArrayList<>();

    public String getNama(int args){
        return namaClient.get(args);
    }

    public String getAlamat(int args) {
        return alamat.get(args);
    }

    public String getTelepon(int args) {
        return telepon.get(args);
    }

    public Integer getSaldo(int args){
        return saldo.get(args);
    }

    public int getJmlClient(){
        return this.namaClient.size();
    }

    public void setNama(String args){
        namaClient.add(args);
    }

    public void setAlamat(String args) {
        alamat.add(args);
    }

    public void setTelepon(String args) {
        telepon.add(args);
    }

    public void setSaldo(Integer args){
        saldo.add(args);
    }

    public void editSaldo(int index, Integer args){
        saldo.set(index, args);
    }
}
