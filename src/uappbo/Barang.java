package uappbo;

public class Barang extends Produk {
    private String barcode;
    private String expired;
    private int id_kategori;
    
    public Barang(){}
    
    public Barang(String barcode){
        this.barcode = barcode;
    }
    
    public Barang(String namaProduk,int kategori){
        super(namaProduk);
        this.id_kategori = id_kategori;
    }
    
    public Barang(String barcode,String namaProduk,double harga, int jumlah,double diskon,String expired, int id_kategori){
        super(namaProduk,harga,jumlah,diskon);
        this.barcode = barcode;
        this.expired = expired;
        this.id_kategori = id_kategori;
    }
    
    public boolean isExpired(){
        return true;
    }
    
    public Kategori addKategori(){
       return null;
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

    public int getKategori() {
        return id_kategori;
    }

    public void setKategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }
}
