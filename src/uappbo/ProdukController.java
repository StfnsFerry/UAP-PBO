package uappbo;

import com.mysql.cj.conf.IntegerProperty;
import com.mysql.cj.conf.StringProperty;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.DoubleProperty;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ProdukController implements Initializable {
    
    KasirModel barang = new KasirModel();
    
    @FXML
    private TextField Barcode;

    @FXML
    private TextField DiskonBarang;

    @FXML
    private TextField ExpiredBarang;

    @FXML
    private TextField HargaBarang;

    @FXML
    private TextField JmlBarang;

    @FXML
    private TextField NamaBarang;
    
    @FXML
    private TextField Kategori;
    
    @FXML
    private Button btnBeli;

    @FXML
    private Button btnHapusBrng;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnKategori;

    @FXML
    private Button btnMakanan;

    @FXML
    private Button btnPenjualan;

    @FXML
    private Button btnTambahBrng;
    
    @FXML
    private TableView<Barang> tableItem;

    @FXML
    private TableColumn<Barang, StringProperty> colBarcode;

    @FXML
    private TableColumn<Barang, DoubleProperty> colDiskonBrng;

    @FXML
    private TableColumn<Barang, StringProperty> colExpiredBrng;

    @FXML
    private TableColumn<Barang, DoubleProperty> colHargaBrng;

    @FXML
    private TableColumn<Barang, IntegerProperty> colJmlhBrng;

    @FXML
    private TableColumn<Barang, IntegerProperty> colKategoriBrng;

    @FXML
    private TableColumn<Barang, StringProperty> colNamaBrng;

    @FXML
    void hapusBarang(ActionEvent event) throws IOException, SQLException{
        Barang b = new Barang(Barcode.getText());
        barang.deleteProduk(b);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Produk.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage) btnHapusBrng.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        barang = new KasirModel(); 
        try { 
            showData();
        } catch (SQLException ex) {
            Logger.getLogger(ProdukController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void showData() throws SQLException{
       ObservableList<Barang> brg = barang.getBarang(); 

       colBarcode.setCellValueFactory(new PropertyValueFactory<>("barcode"));
       colExpiredBrng.setCellValueFactory(new PropertyValueFactory<>("expired"));
       colKategoriBrng.setCellValueFactory(new PropertyValueFactory<>("kategori"));
       colNamaBrng.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
       colHargaBrng.setCellValueFactory(new PropertyValueFactory<>("harga"));
       colJmlhBrng.setCellValueFactory(new PropertyValueFactory<>("jumlah"));
       colDiskonBrng.setCellValueFactory(new PropertyValueFactory<>("diskon"));

       tableItem.setItems(brg);
   }
    
     @FXML
    void tambahBarang(ActionEvent event) throws IOException, SQLException{   
        Barang b = new Barang(
                Barcode.getText(),
                NamaBarang.getText(),
                Double.parseDouble(HargaBarang.getText()),
                Integer.parseInt(JmlBarang.getText()),
                Double.parseDouble(DiskonBarang.getText()),
                ExpiredBarang.getText(),
                Integer.parseInt(Kategori.getText())
        );
//        barang.cekKategori(b);
        barang.addProduk(b);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Produk.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage) btnTambahBrng.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void openBeli(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Beli.fxml"));
        
        Stage stage = (Stage) btnBeli.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }

    @FXML
    void openHome(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
        
        Stage stage = (Stage) btnHome.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }

    @FXML
    void openKategori(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Kategori.fxml"));
        
        Stage stage = (Stage) btnKategori.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }

    @FXML
    void openPenjualan(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Penjualan.fxml"));
        
        Stage stage = (Stage) btnPenjualan.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }
    
    @FXML
    void openMakanan(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ProdukMakanan.fxml"));
        
        Stage stage = (Stage) btnMakanan.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }


}
