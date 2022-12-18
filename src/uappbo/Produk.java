/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap_pbo;

/**
 *
 * @author J I H A N
 */
public class Produk {
    private int id_produk;
    private String namaProduk;
    private double harga;
    private int jumlah;
    private double diskon;
    
    public Produk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public Produk(){}
    
    public Produk(String nama_produk,double harga){
        this.namaProduk = nama_produk;
        this.harga = harga;
    }
    
    public Produk(String nama_produk, double harga,int jumlah,double diskon,int id_produk){
        this.namaProduk = nama_produk;
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
        this.id_produk = id_produk;
    }
    
    public Produk(String nama_produk,double harga, int jumlah,double diskon){
        this.namaProduk = nama_produk;
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    public int getId_produk() {
        return id_produk;
    }

    public void setId_produk(int id_produk) {
        this.id_produk = id_produk;
    }
    
    private double hargaDiskon(){
        return harga - (harga*diskon);
    }

    public String getNama_produk() {
        return namaProduk;
    }

    public void setNama_produk(String nama_produk) {
        this.namaProduk = nama_produk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
}