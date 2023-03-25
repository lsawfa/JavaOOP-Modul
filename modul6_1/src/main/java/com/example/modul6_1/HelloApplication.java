package com.example.modul6_1;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

public class HelloApplication extends Application {
    private TableView tabel = new TableView();
    public String namadosen, matakuliah, waktu, ruangan;
    public int gkb;
    @Override
    public void start(Stage stage) throws Exception {
        //Text
        Text judul1 = new Text("Tabel Jadwal Kuliah");
        judul1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        Text text1_1 = new Text("Update Data : Ubah langsung pada tabel dan tekan enter jika selesai update");
        text1_1.setFill(Color.BROWN);
        Text text1_2 = new Text("Delete Data : Select Row Table yang ingin dihapus kemudian tekan button delete");
        text1_2.setFill(Color.BROWN);
        Text judul2 = new Text("Welcome To Jadwal Kuliah");
        judul2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        final Text actiontarget = new Text();
        //Text Field
        TextField text2_1 = new TextField();
        TextField text2_2 = new TextField();
        TextField text2_3 = new TextField();
        TextField text2_4 = new TextField();
        TextField text2_5 = new TextField();
        //Alert
        Alert alert1 = new Alert(Alert.AlertType.WARNING, "Input GKB harus berupa angka !!!", ButtonType.OK);
        Alert alert2 = new Alert(Alert.AlertType.WARNING, "Inputan tidak boleh ada yang kosong !!!", ButtonType.OK);
        //Button
        Button button1 = new Button("Back");
        Button button2 = new Button("Show Data");
        Button button3 = new Button("Create");
        Button button5 = new Button("Delete");z
        //Label
        Label label2_1 = new Label("Nama Dosen");
        Label label2_2 = new Label("Mata Kuliah");
        Label label2_3 = new Label("GKB");
        Label label2_4 = new Label("Waktu");
        Label label2_5 = new Label("Ruangan");
        //Tabel
        tabel.setEditable(true);
        TableColumn<Jadwal,String> k1 = new TableColumn<Jadwal,String>("Nama Dosen");
        TableColumn<Jadwal,String> k2 = new TableColumn<Jadwal,String>("Mata Kuliah");
        TableColumn<Jadwal,Integer> k3 = new TableColumn<Jadwal,Integer>("GKB");
        TableColumn<Jadwal,String> k4 = new TableColumn<Jadwal,String>("Waktu");
        TableColumn<Jadwal,String> k5 = new TableColumn<Jadwal,String>("Ruangan");
        tabel.getColumns().addAll(k1, k2, k3, k4, k5);
        final ObservableList<Jadwal> data = FXCollections.observableArrayList();
        k1.setCellValueFactory(new PropertyValueFactory<Jadwal, String>("namadosen"));
        k1.setCellFactory(TextFieldTableCell.forTableColumn());
        k1.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Jadwal,String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                Jadwal jadwal = (Jadwal) event.getRowValue();
                jadwal.setNamadosen((String) event.getNewValue());
            }
        });
        k2.setCellValueFactory(new PropertyValueFactory<Jadwal, String>("matakuliah"));
        k2.setCellFactory(TextFieldTableCell.forTableColumn());
        k2.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Jadwal,String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                Jadwal jadwal = (Jadwal) event.getRowValue();
                jadwal.setMatakuliah((String) event.getNewValue());
            }
        });
        k3.setCellValueFactory(new PropertyValueFactory<Jadwal, Integer>("gkb"));
        k3.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        k3.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Jadwal,Integer>>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                Jadwal jadwal = (Jadwal) event.getRowValue();
                try{
                    jadwal.setGkb((Integer) event.getNewValue());
                }catch (Exception ex){
                    alert1.setAlertType(Alert.AlertType.WARNING);
                    alert1.show();
                }
            }
        });
        k4.setCellValueFactory(new PropertyValueFactory<Jadwal, String>("waktu"));
        k4.setCellFactory(TextFieldTableCell.forTableColumn());
        k4.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Jadwal,String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                Jadwal jadwal = (Jadwal) event.getRowValue();
                jadwal.setWaktu((String) event.getNewValue());
            }
        });
        k5.setCellValueFactory(new PropertyValueFactory<Jadwal, String>("ruangan"));
        k5.setCellFactory(TextFieldTableCell.forTableColumn());
        k5.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Jadwal,String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent event) {
                Jadwal jadwal = (Jadwal) event.getRowValue();
                jadwal.setRuangan((String) event.getNewValue());
            }
        });
        tabel.setItems(data);
        //Layout
        final VBox layout1 = new VBox();
        final HBox btn = new HBox();
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
                    namadosen = text2_1.getText();
                    matakuliah = text2_2.getText();
                    gkb = Integer.parseInt(text2_3.getText());
                    waktu = text2_4.getText();
                    ruangan = text2_5.getText();
                    if (namadosen.length() == 0 || matakuliah.length() == 0 || gkb == 0 || waktu.length() == 0 || ruangan.length() == 0) {
                        alert2.setAlertType(Alert.AlertType.WARNING);
                        alert2.show();
                    } else {
                        actiontarget.setFill(Color.GREEN);
                        data.add(new Jadwal(namadosen, matakuliah, gkb, waktu, ruangan));
                        actiontarget.setText("Succes : input sudah direkam");
                        text2_1.clear();
                        text2_2.clear();
                        text2_3.clear();
                        text2_4.clear();
                        text2_5.clear();
                    }
                } catch (Exception ex) {
                    alert1.setAlertType(Alert.AlertType.WARNING);
                    alert1.show();
                }
            }
        });

        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int rowdelete = tabel.getSelectionModel().getSelectedIndex();
                if (rowdelete >= 0) {
                    tabel.getItems().remove(rowdelete);
                } else {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("No Selection");
                    alert.setHeaderText("No Row Selected");
                    alert.setContentText("Please select a row in the table.");
                    alert.showAndWait();
                }
            }
        });

        //Scene1
        btn.getChildren().addAll(button1, button5);
        btn.setSpacing(10);
        layout1.getChildren().addAll(judul1, tabel, text1_1, text1_2, btn);
        //Scene2
        layout2.add(judul2, 0, 0, 2, 1);
        layout2.add(actiontarget, 1, 9);
        layout2.add(text2_1, 1, 1);
        layout2.add(text2_2, 1, 2);
        layout2.add(text2_3, 1, 3);
        layout2.add(text2_4, 1, 4);
        layout2.add(text2_5, 1, 5);
        layout2.add(button2, 0, 8);
        layout2.add(button3, 1, 8);
        layout2.add(label2_1, 0, 1);
        layout2.add(label2_2, 0, 2);
        layout2.add(label2_3, 0, 3);
        layout2.add(label2_4, 0, 4);
        layout2.add(label2_5, 0, 5);

        Scene scene1 = new Scene(new Group());
        Scene scene2 = new Scene(layout2, 400, 400);
        ((Group) scene1.getRoot()).getChildren().addAll(layout1);
        button2.setOnAction(e -> stage.setScene(scene1));
        button1.setOnAction(e -> stage.setScene(scene2));

        stage.setTitle("Jadwal Kuliah");
        stage.setScene(scene1);
        stage.setScene(scene2);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static class Jadwal {
        private SimpleStringProperty namadosen, matakuliah, waktu, ruangan;
        private SimpleIntegerProperty gkb;

        private Jadwal(String namadosen, String matakuliah, int gkb, String waktu, String ruangan) {
            this.namadosen = new SimpleStringProperty(namadosen);
            this.matakuliah = new SimpleStringProperty(matakuliah);
            this.gkb = new SimpleIntegerProperty(gkb);
            this.waktu = new SimpleStringProperty(waktu);
            this.ruangan = new SimpleStringProperty(ruangan);
        }

        public String getNamadosen() {
            return namadosen.get();
        }

        public SimpleStringProperty namadosenProperty() {
            return namadosen;
        }

        public void setNamadosen(String namadosen) {
            this.namadosen.set(namadosen);
        }

        public String getMatakuliah() {
            return matakuliah.get();
        }

        public SimpleStringProperty matakuliahProperty() {
            return matakuliah;
        }

        public void setMatakuliah(String matakuliah) {
            this.matakuliah.set(matakuliah);
        }

        public String getWaktu() {
            return waktu.get();
        }

        public SimpleStringProperty waktuProperty() {
            return waktu;
        }

        public void setWaktu(String waktu) {
            this.waktu.set(waktu);
        }

        public String getRuangan() {
            return ruangan.get();
        }

        public SimpleStringProperty ruanganProperty() {
            return ruangan;
        }

        public void setRuangan(String ruangan) {
            this.ruangan.set(ruangan);
        }

        public int getGkb() {
            return gkb.get();
        }

        public SimpleIntegerProperty gkbProperty() {
            return gkb;
        }

        public void setGkb(int gkb) {
            this.gkb.set(gkb);
        }
    }
}