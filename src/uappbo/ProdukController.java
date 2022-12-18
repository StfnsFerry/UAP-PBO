package uappbo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ProdukController {

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
    private Button btnBeli;

    @FXML
    private Button btnCekBrng;

    @FXML
    private Button btnHapusBrng;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnKategori;

    @FXML
    private ChoiceBox<?> btnKategoriBarang;

    @FXML
    private Button btnMakanan;

    @FXML
    private Button btnPenjualan;

    @FXML
    private Button btnTambahBrng;

    @FXML
    private TableColumn<?, ?> colBarcode;

    @FXML
    private TableColumn<?, ?> colDiskonBrng;

    @FXML
    private TableColumn<?, ?> colExpiredBrng;

    @FXML
    private TableColumn<?, ?> colHargaBrng;

    @FXML
    private TableColumn<?, ?> colJmlhBrng;

    @FXML
    private TableColumn<?, ?> colKategoriBrng;

    @FXML
    private TableColumn<?, ?> colNamaBrng;

    @FXML
    void cekBarang(ActionEvent event) throws IOException{

    }

    @FXML
    void hapusBarang(ActionEvent event) throws IOException{

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
        
        Stage stage = (Stage) btnBeli.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }
    
    @FXML
    void openMakanan(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("ProdukMakanan.fxml"));
        
        Stage stage = (Stage) btnBeli.getScene().getWindow();
        stage.setScene(new Scene(root,960,540));
    }

    @FXML
    void pilihKategori(MouseEvent event) throws IOException{

    }

    @FXML
    void tambahBarang(ActionEvent event) throws IOException{

    }

}
