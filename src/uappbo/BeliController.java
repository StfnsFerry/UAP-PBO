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

public class BeliController implements Initializable{

    KasirModel barang = new KasirModel();
    
    @FXML
    private TextField Barcode;

    @FXML
    private TextField Jumlah;

    @FXML
    private Button btnBeli;
    
    @FXML
    private Button btnBuy;

    @FXML
    private Button btnHome;
    
    @FXML
    private Button btnMakanan;

    @FXML
    private Button btnKategori;

    @FXML
    private Button btnPenjualan;

    @FXML
    private Button btnProduk;
    
    @FXML
    private TableView<Barang> tableItem;

    @FXML
    private TableColumn<Barang, StringProperty> colBarcode;

    @FXML
    private TableColumn<Barang, DoubleProperty> colDiskon;

    @FXML
    private TableColumn<Barang, StringProperty> colExpired;

    @FXML
    private TableColumn<Barang, DoubleProperty> colHarga;

    @FXML
    private TableColumn<Barang, IntegerProperty> colJumlah;

    @FXML
    private TableColumn<Barang, IntegerProperty> colKategori;

    @FXML
    private TableColumn<Barang, StringProperty> colNama;

    @FXML
    void beliBarang(ActionEvent event) throws IOException, SQLException{
        Barang b = new Barang(
                Barcode.getText(),Integer.parseInt(Jumlah.getText()));

        barang.buyProduk(b);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Beli.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage) btnBuy.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        barang = new KasirModel(); 
        try { 
            showData();
        } catch (SQLException ex) {
            Logger.getLogger(BeliController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showData() throws SQLException{
       ObservableList<Barang> brg = barang.getBarang(); 

       colBarcode.setCellValueFactory(new PropertyValueFactory<>("barcode"));
       colExpired.setCellValueFactory(new PropertyValueFactory<>("expired"));
       colKategori.setCellValueFactory(new PropertyValueFactory<>("kategori"));
       colNama.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
       colHarga.setCellValueFactory(new PropertyValueFactory<>("harga"));
       colJumlah.setCellValueFactory(new PropertyValueFactory<>("jumlah"));
       colDiskon.setCellValueFactory(new PropertyValueFactory<>("diskon"));

       tableItem.setItems(brg);
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
    void openProduk(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Produk.fxml"));
        
        Stage stage = (Stage) btnProduk.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }
    
    @FXML
    void openMakanan(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("BeliMakanan.fxml"));
        
        Stage stage = (Stage) btnMakanan.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }

}
