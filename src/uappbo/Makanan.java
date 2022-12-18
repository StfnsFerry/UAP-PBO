/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap_pbo;

/**
 *
 * @author J I H A N
 */
public class Makanan extends Produk {
    private int id;
    private int daya_tahan;
    
   public Makanan(){}
    
   public Makanan(int id){
      this.id = id;
   }
    
   public Makanan(int id_produk, int id,String namaProduk,double harga, int jumlah,double diskon,int daya_tahan){
    super(namaProduk,harga,jumlah,diskon,id_produk);
    this.id = id;
    this.daya_tahan = daya_tahan;
   }
    
    public boolean isSpoiled(){
        return true;
    } 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaya_tahan() {
        return daya_tahan;
    }

    public void setDaya_tahan(int daya_tahan) {
        this.daya_tahan = daya_tahan;
    }
}

