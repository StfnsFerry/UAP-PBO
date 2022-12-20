package uappbo;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KasirModel {
    private final Connection CONN;
    
    public KasirModel(){
        this.CONN = database.DBHelper.getConnection();
    }  
    
    //BARANG
//    public void cekKategori(Barang barang)throws SQLException{
//        String cekK = "SELECT * FROM kategori WHERE id_kategori = " + barang.getKategori() +";";
//        ResultSet rs = CONN.createStatement().executeQuery(cekK);
//        System.out.println(barang.getKategori());
//        System.out.println(rs.);
//    }
    
    public void addProduk(Barang barang) throws SQLException{       
        String insertB = "INSERT INTO data_barang VALUES ('"
                +barang.getBarcode()+ "','"
                +barang.getKategori()+"','"
                +barang.getNama_produk()+ "','"
                +barang.getHarga()+"','"   
                +barang.getJumlah()+"','"
                +barang.getDiskon()+ "','" 
                +barang.getExpired()+"');";
        
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
    
    public void buyProduk(Barang barang) throws SQLException{
        String buyB = "INSERT INTO data_penjualan (`barcode`,`jumlahProduk`) VALUES('"
                    +barang.getBarcode()+"','"
                    +barang.getJumlah()+"');";

        try {
           if(CONN.createStatement().executeUpdate(buyB)>0){
            System.out.println("Barang Berhasil Dibeli");
           }else{
               System.out.println("Gagal Beli");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal Beli");
        }  
    }
    
    public ObservableList<Barang> getBarang() throws SQLException{
        ObservableList<Barang> barang = FXCollections.observableArrayList();
        String select = "SELECT * FROM data_barang;";
        try {
            ResultSet result = CONN.createStatement().executeQuery(select);
            while(result.next()){
                Barang brg = new Barang(result.getString(1), result.getString(3), result.getDouble(4), result.getInt(5), result.getDouble(6), result.getString(7), result.getInt(2));
                barang.add(brg);
            }
            System.out.println("Berhasil mengambil data barang");
        } 
        catch (SQLException e) {
            System.out.println("Gagal mengambil data" + e.getMessage());
        }
        
        return barang;
    }
    
    //Makanan
    
    public void addMakanan(Makanan mkn) throws SQLException{       
        String insertM = "INSERT INTO data_makanan VALUES ('"
                +mkn.getId()+ "','"
                +mkn.getNama_produk()+"','"         
                +mkn.getHarga()+"','"   
                +mkn.getJumlah()+"','"
                +mkn.getDiskon()+ "','"
                +mkn.getDaya_tahan()+"');";
        
        try {
           if(CONN.createStatement().executeUpdate(insertM)>0){
            System.out.println("Data Berhasil Dimasukkan");
           }else{
               System.out.println("Data yang dimasukkan sudah ada");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal Dimasukkan");
        }
    }
    
    public void deleteMakanan(Makanan mkn) throws SQLException{
        String deleteM = "DELETE FROM data_makanan WHERE id_makanan = '"+ mkn.getId()+"';";

        try {
           if(CONN.createStatement().executeUpdate(deleteM)>0){
            System.out.println("Data Berhasil Dihapus");
           }else{
               System.out.println("Data Gagal dihapus");
           }     
        } catch (SQLException ex) {
            Logger.getLogger(KasirModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Data Gagal dihapus");
        }  
    }

    public ObservableList<Makanan> getMakanan() throws SQLException{
        ObservableList<Makanan> makanan = FXCollections.observableArrayList();
        String selectM = "SELECT * FROM data_makanan;";
        try {
            ResultSet result = CONN.createStatement().executeQuery(selectM);
            while(result.next()){
                Makanan mkn = new Makanan(result.getInt(1), result.getString(2), result.getDouble(3), result.getDouble(4), result.getInt(5), result.getInt(6));
                makanan.add(mkn);
            }
            System.out.println("Berhasil mengambil data makanan");
        } 
        catch (SQLException e) {
            System.out.println("Gagal mengambil data" + e.getMessage());
        }
        
        return makanan;
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
    
    public ObservableList<Kategori> getKategori() throws SQLException{
        ObservableList<Kategori> kategori = FXCollections.observableArrayList();
        String selectM = "SELECT * FROM kategori;";
        try {
            ResultSet result = CONN.createStatement().executeQuery(selectM);
            while(result.next()){
                Kategori k = new Kategori(result.getInt(1),result.getString(2));
                kategori.add(k);
            }
            System.out.println("Berhasil mengambil data kategori");
        } 
        catch (SQLException e) {
            System.out.println("Gagal mengambil data" + e.getMessage());
        }
        
        return kategori;
    }    

}

