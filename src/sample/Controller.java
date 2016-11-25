package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Pair;
import sun.rmi.runtime.Log;
import java.awt.*;
import java.awt.Button;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;

public class Controller {

    public ImageView imagenCarta;
    public TextField nombre;
    public TextField color;
    public TextField tipo;
    public TextField rareza;
    public TextArea texto;
    public TextField textcolor;
    private ArrayList<String> ejemplo = new ArrayList<>();
    public ListView<Tuple<String, String>> List;
    public AnchorPane apMainPane;
    public ArrayList<Card> result;

    private void Celdas() {
        List.setCellFactory(param -> new ListCell<Tuple<String, String>>() {
            private ImageView imageView = new ImageView();

            @Override
            public void updateItem(Tuple<String, String> item, boolean empty) {
                super.updateItem(item, empty);

                if (empty) {
                    setText(null);
                    setGraphic(null);
                } else{
                    Image IMAGE = new Image(item.getY(), 100, 100, true, true, true);
                    imageView.setImage(IMAGE);
                    imageView.setCache(true);
                    setText(item.getX());
                    setGraphic(imageView);
                }
            }

        });
    }

    public void acceder(MouseEvent mouseEvent) {
        System.out.println( List.getSelectionModel().getSelectedItems());
        Tuple<String, String> id =  List.getSelectionModel().getSelectedItem();


        nombre.setText(id.getX());
        Image img = new Image(id.getY());
        imagenCarta.setFitHeight(500);
        imagenCarta.setFitWidth(500);
        imagenCarta.setCache(true);
        imagenCarta.setImage(img);
        for (int i = 0; i < result.size(); i++) {
            if(id.x.equalsIgnoreCase(result.get(i).getName())){
               tipo.setText(result.get(i).getType());
               rareza.setText(result.get(i).getRarity());
               texto.setText(result.get(i).getText());
            }

        }
    }

    public void common(ActionEvent actionEvent) {
        String rar = "Common";
        API api = new API();
        result = api.getAllCards();

        ObservableList<Tuple<String, String>> items =FXCollections.observableArrayList();

        if (result!=null) {
            for (int i = 0; i < result.size(); i++) {
                {
                    if (result.get(i).getRarity().equalsIgnoreCase(rar)) {
                        items.add(new Tuple<>(result.get(i).getName(), result.get(i).getPosterUrl()));
                    }
                    else{

                    }
                }
            }
        }
        List.setItems(items);
        Celdas();
    }

    public void uncommon(ActionEvent actionEvent) {
        String rar = "Uncommon";
        API api = new API();
        result = api.getAllCards();

        ObservableList<Tuple<String, String>> items =FXCollections.observableArrayList();

        if (result!=null) {
            for (int i = 0; i < result.size(); i++) {
                {
                    if (result.get(i).getRarity().equalsIgnoreCase(rar)) {
                        items.add(new Tuple<>(result.get(i).getName(), result.get(i).getPosterUrl()));
                    }
                    else{

                    }
                }
            }
        }
        List.setItems(items);
        Celdas();
    }

    public void rare(ActionEvent actionEvent) {
        String rar = "Rare";
        API api = new API();
        result = api.getAllCards();

        ObservableList<Tuple<String, String>> items =FXCollections.observableArrayList();

        if (result!=null) {
            for (int i = 0; i < result.size(); i++) {
                {
                    if (result.get(i).getRarity().equalsIgnoreCase(rar)) {
                        items.add(new Tuple<>(result.get(i).getName(), result.get(i).getPosterUrl()));
                    }
                    else{

                    }
                }
            }
        }
        List.setItems(items);
        Celdas();
    }

    public void todas(ActionEvent actionEvent) {

        API api = new API();
        result = api.getAllCards();

        ObservableList<Tuple<String, String>> items =FXCollections.observableArrayList();



        if (result!=null) {
            for (int i = 0; i < result.size(); i++) {
                items.add(new Tuple<>(result.get(i).getName(), result.get(i).getPosterUrl()));
            }
        }
        List.setItems(items);

        Celdas();
    }

    public void mythic(ActionEvent actionEvent) {
        String rar = "Mythic Rare";
        API api = new API();
        result = api.getAllCards();

        ObservableList<Tuple<String, String>> items =FXCollections.observableArrayList();

        if (result!=null) {
            for (int i = 0; i < result.size(); i++) {
                {
                    if (result.get(i).getRarity().equalsIgnoreCase(rar)) {
                        items.add(new Tuple<>(result.get(i).getName(), result.get(i).getPosterUrl()));
                    }
                    else{

                    }
                }
            }
        }
        List.setItems(items);
        Celdas();
    }

    public void special(ActionEvent actionEvent) {
        String rar = "Special";
        API api = new API();
        result = api.getAllCards();

        ObservableList<Tuple<String, String>> items =FXCollections.observableArrayList();

        if (result!=null) {
            for (int i = 0; i < result.size(); i++) {
                {
                    if (result.get(i).getRarity().equalsIgnoreCase(rar)) {
                        items.add(new Tuple<>(result.get(i).getName(), result.get(i).getPosterUrl()));
                    }
                    else{

                    }
                }
            }
        }
        List.setItems(items);
        Celdas();
    }

    public void land(ActionEvent actionEvent) {
        String rar = "Basic Land";
        API api = new API();
        result = api.getAllCards();

        ObservableList<Tuple<String, String>> items =FXCollections.observableArrayList();

        if (result!=null) {
            for (int i = 0; i < result.size(); i++) {
                {
                    if (result.get(i).getRarity().equalsIgnoreCase(rar)) {
                        items.add(new Tuple<>(result.get(i).getName(), result.get(i).getPosterUrl()));
                    }
                    else{

                    }
                }
            }
        }
        List.setItems(items);
        Celdas();
    }
}

