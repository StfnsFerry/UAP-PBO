package uappbo;

public class Kategori {
    private Produk produk  = new Produk();
    int id_kategori;
    private String nama_kategori;

    public Kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
  
    
    public Kategori(int id_kategori,String nama_kategori) {
        this.nama_kategori = nama_kategori;
        this.id_kategori = id_kategori;
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
