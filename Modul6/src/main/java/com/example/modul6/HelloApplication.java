package com.example.modul6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private TableView tabel = new TableView();
    public String nama, email, fakultas, jurusan, alamat, kota;
    public long nim;
    @Override
    public void start(Stage primaryStage) throws IOException {
        //Text
        Text judul1 = new Text("Tabel Biodata Mahasiswa");
        judul1.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
        Text judul2 = new Text("Form Biodata Mahasiswa");
        judul2.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
        final Text actiontarget = new Text();
        //Text Field and Text Area
        TextField text2_1 = new TextField();
        TextField text2_2 = new TextField();
        TextField text2_3 = new TextField();
        TextField text2_4 = new TextField();
        TextField text2_5 = new TextField();
        TextArea text2_6 = new TextArea();
        TextField text2_7 = new TextField();
        //Alert
        Alert alert1 = new Alert(Alert.AlertType.WARNING,"Input NIM harus berupa angka !!!", ButtonType.OK);
        Alert alert2 = new Alert(Alert.AlertType.WARNING,"Inputan tidak boleh ada yang kosong !!!", ButtonType.OK);
        Alert alert3 = new Alert(Alert.AlertType.WARNING,"Inputan email harus diakhiri dengan @webmail.umm.ac.id !!!", ButtonType.OK);
        //Button
        Button button1 = new Button("Back");
        Button button2 = new Button("Show Data");
        Button button3 = new Button("Create");
        //Label
        Label label2_1 = new Label("Nama");
        Label label2_2 = new Label("NIM");
        Label label2_3 = new Label("Email");
        Label label2_4 = new Label("Fakultas");
        Label label2_5 = new Label("Jurusan");
        Label label2_6 = new Label("Alamat");
        Label label2_7 = new Label("Kota");
        //Tabel
        tabel.setEditable(true);
        TableColumn k1 = new TableColumn("Nama");
        TableColumn k2 = new TableColumn("NIM");
        TableColumn k3 = new TableColumn("Email");
        TableColumn k4 = new TableColumn("Fakultas");
        TableColumn k5 = new TableColumn("Jurusan");
        TableColumn k6 = new TableColumn("Alamat");
        TableColumn k7 = new TableColumn("Kota");
        tabel.getColumns().addAll(k1,k2,k3,k4,k5,k6,k7);
        final ObservableList<Mahasiswa> data = FXCollections.observableArrayList();
        k1.setCellValueFactory(new PropertyValueFactory<Mahasiswa,String>("nama"));
        k2.setCellValueFactory(new PropertyValueFactory<Mahasiswa,String>("nim"));
        k3.setCellValueFactory(new PropertyValueFactory<Mahasiswa,String>("email"));
        k4.setCellValueFactory(new PropertyValueFactory<Mahasiswa,String>("fakultas"));
        k5.setCellValueFactory(new PropertyValueFactory<Mahasiswa,String>("jurusan"));
        k6.setCellValueFactory(new PropertyValueFactory<Mahasiswa,String>("alamat"));
        k7.setCellValueFactory(new PropertyValueFactory<Mahasiswa,String>("kota"));
        tabel.setItems(data);
        //Layout
        final VBox layout1 = new VBox();
        GridPane layout2 = new GridPane();

        layout1.setPadding(new Insets(20, 10, 10, 10));
        layout1.setSpacing(8);
        layout2.setPadding(new Insets(10, 10, 10, 10));
        layout2.setVgap(5);
        layout2.setHgap(5);

        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    nama=text2_1.getText();
                    nim= Long.parseLong(text2_2.getText());
                    email=text2_3.getText();
                    fakultas=text2_4.getText();
                    jurusan=text2_5.getText();
                    alamat=text2_6.getText();
                    kota=text2_7.getText();
                    if(nama.length()==0||nim==0||email.length()==0||fakultas.length()==0||jurusan.length()==0||alamat.length()==0||kota.length()==0){
                        alert2.setAlertType(Alert.AlertType.WARNING);
                        alert2.show();
                    }else {
                        if (email.contains("@webmail.umm.ac.id")){
                            actiontarget.setFill(Color.GREEN);
                            String updatenim = String.valueOf(nim);
                            data.add(new Mahasiswa(nama,updatenim,email,fakultas,jurusan,alamat,kota));
                            actiontarget.setText("Succes : input sudah direkam");
                            text2_1.clear();text2_2.clear();text2_3.clear();text2_4.clear();text2_5.clear();text2_6.clear();text2_7.clear();
                        }else {
                            alert3.setAlertType(Alert.AlertType.WARNING);
                            alert3.show();
                        }
                    }
                }catch (Exception ex){
                    alert1.setAlertType(Alert.AlertType.WARNING);
                    alert1.show();
                }
            }
        });

        //Scene1
        layout1.getChildren().addAll(judul1,tabel,button1);
        //Scene2
        layout2.add(judul2,0,0,2,1);
        layout2.add(actiontarget,1,9);
        layout2.add(text2_1, 1,1);
        layout2.add(text2_2, 1,2);
        layout2.add(text2_3, 1,3);
        layout2.add(text2_4, 1,4);
        layout2.add(text2_5, 1,5);
        layout2.add(text2_6, 1,6);
        layout2.add(text2_7, 1,7);
        layout2.add(button2, 0,8);
        layout2.add(button3, 1,8);
        layout2.add(label2_1, 0,1);
        layout2.add(label2_2, 0,2);
        layout2.add(label2_3, 0,3);
        layout2.add(label2_4, 0,4);
        layout2.add(label2_5, 0,5);
        layout2.add(label2_6, 0,6);
        layout2.add(label2_7, 0,7);

        Scene scene1 = new Scene(new Group());
        Scene scene2 = new Scene(layout2,400,400);
        ((Group)scene1.getRoot()).getChildren().addAll(layout1);
        button2.setOnAction(e->primaryStage.setScene(scene1));
        button1.setOnAction(e->primaryStage.setScene(scene2));

        primaryStage.setTitle("Form Biodata Mahasiswa");
        primaryStage.setScene(scene1);
        primaryStage.setScene(scene2);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
    public static class Mahasiswa{
        private String nama, email, fakultas, jurusan, alamat, kota;
        private long nim;
        private Mahasiswa(String nama, String nim, String email, String fakultas, String jurusan, String alamat, String kota){
            this.nama=nama;
            this.nim= Long.parseLong(nim);
            this.email=email;
            this.fakultas=fakultas;
            this.jurusan=jurusan;
            this.alamat=alamat;
            this.kota=kota;
        }
        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setNim(long nim) {
            this.nim = nim;
        }

        public long getNim() {
            return nim;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }

        public void setFakultas(String fakultas) {
            this.fakultas = fakultas;
        }

        public String getFakultas() {
            return fakultas;
        }

        public void setJurusan(String jurusan) {
            this.jurusan = jurusan;
        }

        public String getJurusan() {
            return jurusan;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setKota(String kota) {
            this.kota = kota;
        }

        public String getKota() {
            return kota;
        }
    }
}