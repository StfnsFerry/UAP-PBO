package uappbo;

import java.util.ArrayList;


public class Penjualan implements ProductCounter {
//    private ArrayList<Produk> listProduk = new ArrayList<Produk>();
    String listProduk;
    int id_penjualan;
    private int jumlahProduk;
    private int stok;
    
    public Penjualan(){}
    
//    public Penjualan(String namaProduk,int id_produk){
//        super(namaProduk,id_produk);
//    }

    public Penjualan(String listProduk, int id_penjualan, int jumlahProduk, int stok) {
        this.listProduk = listProduk;
        this.id_penjualan = id_penjualan;
        this.jumlahProduk = jumlahProduk;
        this.stok = stok;
    }
   
//    public Penjualan(String nama_produk,int jumlahProduk, int stok ,double harga) {
//        super(nama_produk, harga);
//        this.jumlahProduk = jumlahProduk;
//        this.stok = stok;
//    }
    
    public String getProduk(){
        return listProduk;
    }

    @Override
    public int hitungJumlahProduk(){
        return jumlahProduk;
    }
    
    @Override
    public int hitungHargaProduk(){
        return 0;
    }
    
    
//    public ArrayList<Produk> getListProduk() {
//        return listProduk;
//    }

//    public void setListProduk(ArrayList<Produk> listProduk) {
//        this.listProduk = listProduk;
//    }

    public int getJumlahProduk() {
        return jumlahProduk;
    }

    public void setJumlahProduk(int JumlahProduk) {
        this.jumlahProduk = JumlahProduk;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
