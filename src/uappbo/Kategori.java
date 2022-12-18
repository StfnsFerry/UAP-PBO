/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap_pbo;

/**
 *
 * @author J I H A N
 */
public class Kategori {
    private Produk produk  = new Produk();
    int id_kategori;
    private String nama_kategori;

    public Kategori(int id_kategori, String nama_kategori) {
        this.id_kategori = id_kategori;
        this.nama_kategori = nama_kategori;
    }

    public Kategori() {
    }
    
    public Produk getProduk(){
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public int getId_kategori() {
        return id_kategori;
    }

    public void setId_kategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
}

