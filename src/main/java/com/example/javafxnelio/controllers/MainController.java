package com.example.javafxnelio.controllers;


import com.example.javafxnelio.Main;
import com.example.javafxnelio.utils.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {


    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;


    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("TESTEEEEEEE ME AJUDA");
    }


    @FXML
    public void onMenuItemDepartmentAction(){
        System.out.println("onMenuItemDepartmentAction");
    }

    @FXML
    public void onMenuItemAboutAction() {
        loadView("com/example/javafxnelio/About.fxml");

    }


    private void loadView(String absoluteName){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));

            VBox newVbox = loader.load();
            Scene scene = Main.getScene();

            VBox mainVbox = (VBox) ((ScrollPane) scene.getRoot()).getContent();
            Node mainMenu = mainVbox.getChildren().get(0);

            mainVbox.getChildren().clear();
            mainVbox.getChildren().add(mainMenu);
            mainVbox.getChildren().addAll(newVbox.getChildren());
        } catch (IOException e){
            Alerts.showAlert("IO Expection", "Error Loading View", e.getMessage(), Alert.AlertType.ERROR);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
