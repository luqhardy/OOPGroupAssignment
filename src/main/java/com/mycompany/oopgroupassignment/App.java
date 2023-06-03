package com.mycompany.oopgroupassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * MOHAMED LUQMAN HADI BIN MOHAMED SUHAIRI 2210855
 * Object-Oriented Programming Group Project
 */

//reminder: use array for new order and customer class objects
public class App extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        //Image import and ImageView for main program logo
        Image orderScrn = new Image(new FileInputStream("main.png"));
        ImageView orderScrnView = new ImageView(orderScrn); 
        //hbox for displaying food item from food class
        
        
        
        
        
        //vbox for all food-related hboxes
        
        
        var scene = new Scene(new StackPane(orderScrnView), 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    
    
    
    
    public static void main(String[] args) {
        launch();
    }
    public void makeFile(){
        
    }

}