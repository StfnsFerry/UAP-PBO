/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uappbo;

/**
 *
 * @author J I H A N
 */
public class Barang extends Produk {
    private String barcode;
    private String expired;
    private String kategori;
    
    public Barang(String barcode, int jumlah, String kategori){
        super(jumlah);
        this.barcode = barcode;
        this.kategori = kategori;
    }
    
    public Barang(String barcode,String namaProduk,double harga, int jumlah,double diskon,String expired, String kategori){
        super(namaProduk,harga,jumlah,diskon);
        this.barcode = barcode;
        this.expired = expired;
        this.kategori = kategori;        
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }   
    
    public boolean isExpired(){
        return true;
    }
    
    public Kategori addKategori(){
       return null;
    }
}
