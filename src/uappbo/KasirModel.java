/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap_pbo;

import database.DBHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author J I H A N
 */
public class KasirModel {
    private final Connection CONN;
    
    public KasirModel(){
        this.CONN = database.DBHelper.getConnection();
    }  
    
    //BARANG
    public void addProduk(Barang barang){
        String insertP = "INSERT INTO data_produk VALUES ('" + barang.getId_produk() + "', '"
                + barang.getNama_produk()+ "', '" + barang.getHarga()+ "', '" +barang.getJumlah() +"','"+barang.getDiskon() +"'"+ ");";
        
        String insertB = "INSERT INTO data_barang VALUES ('"+barang.getId_produk()+"','"+barang.getBarcode()+
                                                    "','"+barang.getExpired()+"','"+barang.getKategori()+"');";
        try {
           if(CONN.createStatement().executeUpdate(insertP)>0&&CONN.createStatement().executeUpdate(insertB)>0){
            System.out.println("Data Berhasil Dimasukkan");
//                  System.out.println(insert);
           }else{
               System.out.println("Data yang dimasukkan sudah ada");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal Dimasukkan");
        }
    }    
    
    public void updateProduk(Barang barang, Kategori kategori){//untuk memperbarui data pada query
        String updateP = "UPDATE data_produk SET nama_produk = '"+barang.getNama_produk()+"', harga = '"
                +barang.getHarga()+"', jumlah ="+barang.getJumlah()+"',diskon = "+barang.getDiskon()+"' WHERE id_produk = '"
                +barang.getId_produk()+"';";
        
        String updateB = "UPDATE data_barang SET barcode = '"+ barang.getBarcode() 
                + "', expired = '"+ barang.getExpired() +"', kategori = '"+kategori.getNama_kategori()                
                + "' WHERE barcode = '"+barang.getBarcode()+"' AND id_produk = '"+barang.getId_produk()
                + "' AND id_kategori = '"+kategori.getId_kategori()+ "';";

        try {
           if(CONN.createStatement().executeUpdate(updateP)>0&&CONN.createStatement().executeUpdate(updateB)>0){
            System.out.println("Data Berhasil Diperbarui");
//                  System.out.println(insert);
           }else{
               System.out.println("Data yang dimasukkan tidak berubah");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal Dimasukkan");
        }
    }
    
    public void deleteProduk(Barang barang){//menghapus data didalam query
        String deleteP = "DELETE FROM data_produk WHERE id_produk = '"+ barang.getId_produk()+"';";
        String deleteB = "DELETE FROM data_barang WHERE barcode = '"+ barang.getBarcode()+"';";

        
         try {
           if(CONN.createStatement().executeUpdate(deleteP)>0&&CONN.createStatement().executeUpdate(deleteB)>0){
            System.out.println("Data Berhasil Dihapus");
//                  System.out.println(insert);
           }else{
               System.out.println("Data Gagal dihapus");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal dihapus");
        }  
    }
    
    public ArrayList<Produk> getProdukB(){
        String query = "SELECT * FROM data_produk NATURAL JOIN data_barang;";
        ArrayList<Produk> produk = new ArrayList<Produk>();
        try {
            ResultSet result = CONN.createStatement().executeQuery(query);
            while(result.next()){
                Produk temp = new Produk(result.getString("nama_produk"), result.getDouble("harga"), result.getInt("jumlah"), result.getDouble("diskon"));
                produk.add(temp);
            }
            System.out.println("Berhasil mengambil data");
        } 
        catch (SQLException e) {
            System.out.println("Gagal mengambil data" + e.getMessage());
        }
        
        return produk;
    }
    
    //MAKANAN
//    public void addMakanan(Makanan mkn){
//        String insert = "INSERT INTO makanan VALUES ('"+mkn.getId()+"','"+
//                                                       mkn.getNama_produk()+"','"+
//                                                       mkn.getHarga()+"','"+
//                                                       mkn.getJumlah()+"','"+ 
//                                                       mkn.getDiskon() + "', '" + 
//                                                       mkn.getDaya_tahan()+ "');"; 
//        try {
//           if( CONN.createStatement().executeUpdate(insert)>0){
//            System.out.println("Data Berhasil Dimasukkan");
//           }else{
//               System.out.println("Data yang dimasukkan sudah ada");
//           }     
//        } catch (SQLException ex) {
//            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Data Gagal Dimasukkan");
//        }
//    }
//    
//     public void updateProduk(Makanan mkn,Produk prd){
//        String update = "UPDATE makanan SET id = '"+mkn.getId()+"', nama_produk = '"+prd.getNama_produk()+
//                                        "', harga = '"+prd.getHarga()+"', jumlah = '"+prd.getJumlah()+
//                                        "', diskon = '"+prd.getDiskon()+"', daya_tahan = '"+mkn.getDaya_tahan()+
//                                        "' WHERE id = '"+mkn.getId()+"';";
//
//        try {
//           if( CONN.createStatement().executeUpdate(update)>0){
//            System.out.println("Data Berhasil Diperbarui");
//           }else{
//               System.out.println("Data yang dimasukkan tidak berubah");
//           }     
//        } catch (SQLException ex) {
//            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Data Gagal Dimasukkan");
//        }
//     }
//     
//     public void deleteProduk(Makanan mkn){//menghapus data didalam query
//        String delete = "DELETE FROM makanan WHERE id = '"+ mkn.getId()+"';";
//        
//         try {
//           if( CONN.createStatement().executeUpdate(delete)>0){
//            System.out.println("Data Berhasil Dihapus");
////                  System.out.println(insert);
//           }else{
//               System.out.println("Data Gagal dihapus");
//           }     
//        } catch (SQLException ex) {
//            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Data Gagal dihapus");
//        }  
//    }
//
//    //PENJUALAN
//    public void addPenjualan(Penjualan peju){
//        String insert = "INSERT INTO penjualan VALUES ('"+peju.getNama_produk()+"','"
//                + peju.getJumlahProduk() + "', '" + peju.getStok()+"','"+peju.getHarga()+"');"; 
//        try {
//           if( CONN.createStatement().executeUpdate(insert)>0){
//            System.out.println("Data Berhasil Dimasukkan");
//           }else{
//               System.out.println("Data yang dimasukkan sudah ada");
//           }     
//        } catch (SQLException ex) {
//            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Data Gagal Dimasukkan");
//        }
//    }
//    
//     public void updateProduk(Penjualan peju){//untuk memperbarui data pada query
//        String update = "UPDATE penjualan SET jumlahProduk = '"+ peju.getJumlahProduk() +"', stok = '"+ peju.getStok()+"' WHERE stok = '"+peju.getStok()+"';";
//
//        try {
//           if( CONN.createStatement().executeUpdate(update)>0){
//            System.out.println("Data Berhasil Diperbarui");
//           }else{
//               System.out.println("Data yang dimasukkan tidak berubah");
//           }     
//        } catch (SQLException ex) {
//            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Data Gagal Dimasukkan");
//        }
//     }
//     
//     public void deleteProduk(Penjualan peju){//menghapus data didalam query
//        String delete = "DELETE FROM penjualan WHERE nama_produk = '"+ peju.getNama_produk()+"';";
//        
//         try {
//           if( CONN.createStatement().executeUpdate(delete)>0){
//            System.out.println("Data Berhasil Dihapus");
////                  System.out.println(insert);
//           }else{
//               System.out.println("Data Gagal dihapus");
//           }     
//        } catch (SQLException ex) {
//            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
//            System.out.println("Data Gagal dihapus");
//        }  
//    }
    
    //Kategori
    public void addKategori(Kategori kategori){
        String insertK = "INSERT INTO kategori (`kategori`) VALUES ('"+kategori.getNama_kategori()+"');";
       
        try {
           if(CONN.createStatement().executeUpdate(insertK)>0){
            System.out.println("Kategori Berhasil Dimasukkan");
           }else{
               System.out.println("Kategori yang dimasukkan sudah ada");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Kategori Gagal Dimasukkan");
        }
    }

    public void deleteKategori(Kategori kategori){
        String deleteK = "DELETE FROM kategori WHERE kategori = '"+kategori.getNama_kategori()+"';";
       
        try {
           if(CONN.createStatement().executeUpdate(deleteK)>0){
            System.out.println("Kategori Berhasil Dihapus");
           }else{
               System.out.println("Kategori gagal di hapus");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Kategori Gagal Dihapus");
        }
    }    

}


