package uappbo;

import com.mysql.cj.conf.IntegerProperty;
import com.mysql.cj.conf.StringProperty;
import java.io.IOException;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ProdukMakananController {

    @FXML
    private TextField DayaMkn;

    @FXML
    private TextField DiskonMkn;

    @FXML
    private TextField HargaMkn;

    @FXML
    private TextField ID;

    @FXML
    private TextField JumlahMkn;

    @FXML
    private TextField NamaMkn;

    @FXML
    private Button btnBarang;

    @FXML
    private Button btnBeli;

    @FXML
    private Button btnCekMkn;

    @FXML
    private Button btnHapusMkn;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnKategori;

    @FXML
    private Button btnPenjualan;

    @FXML
    private Button btnTambahMkn;

    @FXML
    private TableColumn<Makanan, IntegerProperty> colDayaMkn;

    @FXML
    private TableColumn<Makanan, DoubleProperty> colDiskonMkn;

    @FXML
    private TableColumn<Makanan, DoubleProperty> colHargaMkn;

    @FXML
    private TableColumn<Makanan, IntegerProperty> colID;

    @FXML
    private TableColumn<Makanan, IntegerProperty> colJmlhMkn;

    @FXML
    private TableColumn<Makanan, StringProperty> colNamaMkn;

    @FXML
    void cekMkn(ActionEvent event) throws IOException{

    }

    @FXML
    void hapusMkn(ActionEvent event) throws IOException{

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
    void openBarang(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Produk.fxml"));
        
        Stage stage = (Stage) btnBarang.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }

    @FXML
    void tambahMkn(ActionEvent event) throws IOException{

    }

}
