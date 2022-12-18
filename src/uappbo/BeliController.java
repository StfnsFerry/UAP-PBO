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

public class BeliController {

    @FXML
    private TextField Barcode;

    @FXML
    private TextField Jumlah;

    @FXML
    private ChoiceBox<?> boxKategori;

    @FXML
    private Button btnBeli;

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
    private TableColumn<?, ?> colBarcode;

    @FXML
    private TableColumn<?, ?> colDiskon;

    @FXML
    private TableColumn<?, ?> colExpired;

    @FXML
    private TableColumn<?, ?> colHarga;

    @FXML
    private TableColumn<?, ?> colJumlah;

    @FXML
    private TableColumn<?, ?> colKategori;

    @FXML
    private TableColumn<?, ?> colNama;

    @FXML
    void beliBarang(ActionEvent event) throws IOException{

    }

    @FXML
    void choiceKategori(MouseEvent event) throws IOException{

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
