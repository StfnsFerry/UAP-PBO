package uappbo;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class KategoriController {

    @FXML
    private TextField NamaKategori;

    @FXML
    private Button btnBeli;

    @FXML
    private Button btnCek;

    @FXML
    private Button btnHapus;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnPenjualan;

    @FXML
    private Button btnProduk;

    @FXML
    private Button btnTambah;

    @FXML
    private TableColumn<?, ?> colHarga;

    @FXML
    private TableColumn<?, ?> colKategori;

    @FXML
    private TableColumn<?, ?> colNama;

    @FXML
    void cekKategori(ActionEvent event) throws IOException{
        
    }

    @FXML
    void hapusKategori(ActionEvent event) throws IOException{

    }

    @FXML
    void openBeli(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Beli.fxml"));
        
        Stage stage = (Stage) btnBeli.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void openHome(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("HomeScreen.fxml"));
        
        Stage stage = (Stage) btnHome.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void openPenjualan(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Penjualan.fxml"));
        
        Stage stage = (Stage) btnPenjualan.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void openProduk(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Produk.fxml"));
        
        Stage stage = (Stage) btnProduk.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void tambahKategori(ActionEvent event) throws IOException{

    }

}
