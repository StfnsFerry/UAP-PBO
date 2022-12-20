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

public class BeliMakananController implements Initializable{

    KasirModel makanan = new KasirModel();

    @FXML
    private TextField ID;

    @FXML
    private TextField Jumlah;

    @FXML
    private Button btnBarang;
    
    @FXML
    private Button btnBuy;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnKategori;

    @FXML
    private Button btnPenjualan;

    @FXML
    private Button btnProduk;
    
    @FXML
    private TableView<Makanan> tableItem;

    @FXML
    private TableColumn<Makanan, IntegerProperty> colDaya;

    @FXML
    private TableColumn<Makanan, DoubleProperty> colDiskon;

    @FXML
    private TableColumn<Makanan, DoubleProperty> colHarga;

    @FXML
    private TableColumn<Makanan, IntegerProperty> colID;

    @FXML
    private TableColumn<Makanan, IntegerProperty> colJumlah;

    @FXML
    private TableColumn<Makanan, StringProperty> colNama;

    @FXML
    void beliMakanan(ActionEvent event) throws IOException{

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        makanan = new KasirModel(); 
        try { 
            showData();
        } catch (SQLException ex) {
            Logger.getLogger(BeliMakananController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void showData() throws SQLException{
       ObservableList<Makanan> mkn = makanan.getMakanan(); 

       colID.setCellValueFactory(new PropertyValueFactory<>("id"));
       colNama.setCellValueFactory(new PropertyValueFactory<>("nama_produk"));
       colHarga.setCellValueFactory(new PropertyValueFactory<>("harga"));
       colJumlah.setCellValueFactory(new PropertyValueFactory<>("jumlah"));
       colDiskon.setCellValueFactory(new PropertyValueFactory<>("diskon"));
       colDaya.setCellValueFactory(new PropertyValueFactory<>("daya_tahan"));
       
       tableItem.setItems(mkn);
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
    void openBarang(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Beli.fxml"));
        
        Stage stage = (Stage) btnBarang.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }

}
