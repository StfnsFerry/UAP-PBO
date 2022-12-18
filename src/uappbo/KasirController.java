/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package uap_pbo;

import java.io.IOException;
import uap_pbo.Barang;
import uap_pbo.Kategori;
import uap_pbo.Makanan;
import uap_pbo.Penjualan;
import uap_pbo.Produk;
import uap_pbo.KasirModel;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author J I H A N
 */
public class KasirController implements Initializable {
    KasirModel barang = new KasirModel();
    KasirModel makanan = new KasirModel();
    

    void OpenProduk(ActionEvent event) {

    }

    //BARANG
    @FXML
    private Button btnCek;

    @FXML
    private Button btnCekMkn;

    @FXML
    private Button btnHapus;

    @FXML
    private Button btnHapusMkn;

    @FXML
    private Button btnTambah;

    @FXML
    private Button btnTambahMkn;

    @FXML
    private TextField lblBarcode;

    @FXML
    private TextField lblDayaMkn;

    @FXML
    private TextField lblDiskon;

    @FXML
    private TextField lblDiskonMkn;

    @FXML
    private TextField lblExpired;

    @FXML
    private TextField lblHarga;

    @FXML
    private TextField lblHargaMkn;

    @FXML
    private TextField lblJumlah;

    @FXML
    private TextField lblKategori;

    @FXML
    private TextField lblNama;

    @FXML
    private TextField lblNamaMkn;

    @FXML
    private TextField lbldMkn;

    @FXML
    private TextField llJumlahMkn;
    
    @FXML
    private TextField lblProdukBrg;

    @FXML
    private TableColumn<Barang, String> tblBrcdBrg;

    @FXML
    private TableColumn<Makanan, Integer> tblDayaMkn;


    @FXML
    private TableColumn<Makanan, Double> tblDiskonMkn;


    @FXML
    private TableColumn<Barang, Double> tblHargaBrg;

    @FXML
    private TableColumn<Makanan, Double> tblHargaMkn;

    @FXML
    private TableColumn<Makanan, Integer> tblIdMkn;

    @FXML
    private TableColumn<Barang, Integer> tblJmlBrg;

    @FXML
    private TableColumn<Makanan, Integer> tblJmlMkn;

    @FXML
    private TableColumn<Barang, Integer> tblKtgrBrg;

    @FXML
    private TableColumn<Barang, String> tblNamaBrg;

    @FXML
    private TableColumn<Makanan, String> tblNamaMkn;

    @FXML
    void cekBarang(ActionEvent event) {

    }

    @FXML
    void cekMakanan(ActionEvent event) {

    }

    @FXML
    void hapusBarang(ActionEvent event) {

    }

    @FXML
    void hapusMakanan(ActionEvent event) {

    }

    @FXML
    void tambahBarang(ActionEvent event) throws IOException {
        Barang b = new Barang(Integer.parseInt(lblProdukBrg.getText()),lblBarcode.getText(),lblNama.getText(),Double.parseDouble(lblHarga.getText()),
                Integer.parseInt(lblJumlah.getText()),Double.parseDouble(lblJumlah.getText()),
                lblExpired.getText(),Integer.parseInt(lblKategori.getText()));
        barang.addProduk(b);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Produk.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = (Stage) btnTambah.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    void tambahMakanan(ActionEvent event) {

    }
    
//    private void showMakanan(){
//        ArrayList<Barang> brg = KasirModel.getProdukB();
//        
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    

    
}
