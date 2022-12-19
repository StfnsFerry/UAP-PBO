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
    public void addProduk(Barang barang) throws SQLException{
        String insertB = "INSERT INTO data_barang VALUES ('"
                + barang.getBarcode()+ "','"
                + barang.getExpired()+"','"
                + barang.getKategori()+"','"
                + barang.getNama_produk()+ "','" 
                + barang.getHarga()+ "','" 
                + barang.getJumlah() +"','"
                + barang.getDiskon() +"'"+ ");";
        try {
           if(CONN.createStatement().executeUpdate(insertB)>0){
            System.out.println("Data Berhasil Dimasukkan");
           }else{
               System.out.println("Data yang dimasukkan sudah ada");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal Dimasukkan");
        }
    }    
    
    public void deleteProduk(Barang barang) throws SQLException{
        String deleteB = "DELETE FROM data_barang WHERE barcode = '"+ barang.getBarcode()+"';";

        try {
           if(CONN.createStatement().executeUpdate(deleteB)>0){
            System.out.println("Data Berhasil Dihapus");
           }else{
               System.out.println("Data Gagal dihapus");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal dihapus");
        }  
    }
    
    public ObservableList<Barang> getBarang() throws SQLException{
        ObservableList<Barang> barang = FXCollections.observableArrayList();
        String select = "SELECT * FROM data_produk NATURAL JOIN data_barang;";
        try {
            ResultSet result = CONN.createStatement().executeQuery(select);
            while(result.next()){
                Barang brg = new Barang(result.getString(1), result.getString(2), result.getDouble(3), result.getInt(4), result.getDouble(5), result.getString(6), result.getString(7));
                barang.add(brg);
            }
            System.out.println("Berhasil mengambil data");
        } 
        catch (SQLException e) {
            System.out.println("Gagal mengambil data" + e.getMessage());
        }
        
        return barang;
    }
    
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


