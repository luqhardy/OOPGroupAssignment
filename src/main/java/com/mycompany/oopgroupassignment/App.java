package com.mycompany.oopgroupassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


/**
 * MOHAMED LUQMAN HADI BIN MOHAMED SUHAIRI 2210855
 * Object-Oriented Programming Group Project
 */

//reminder: use array for new order and customer class objects
//use tableview pls
public class App extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        //Image import and ImageView for main program logo
        Image orderScrn = new Image(new FileInputStream("main.png"));
        ImageView orderScrnView = new ImageView(orderScrn); 
        //tableview for displaying food item from food class
        TableView foodItems = new TableView<>();
        TableColumn<Food,String> col1 = new TableColumn<>("Image");
        col1.setCellValueFactory(new PropertyValueFactory<>("Image"));
        TableColumn<Food,String> col2 = new TableColumn<>("Name");
        col2.setCellValueFactory(new PropertyValueFactory<>("Name"));
        TableColumn<Food,Double> col3 = new TableColumn<>("Price");
        TableColumn col4 = new TableColumn("Quantity");
        TableColumn col5 = new TableColumn("Add/Remove");
        
        foodItems.getColumns().addAll(col1,col2,col3,col4,col5);
        
        //array for 10 food items demo
        foodItems.getItems().add(new Food("Burger","Burger",9.99));
        
        
        //HBox for Total Price and checkout button
        //total price textfield
        Label totalLabel = new Label("Total Price:");
        TextField total = new TextField("Total Price");
        total.setEditable(false);
        Button checkout = new Button("Checkout Now!");
        
        HBox checkoutBox = new HBox(totalLabel,total,checkout);
        checkoutBox.setAlignment(Pos.CENTER);
        checkoutBox.setPadding(new Insets(20,20,20,20));
        
        
        var scene = new Scene(new VBox(orderScrnView, foodItems,checkoutBox), 400, 500);
        stage.setScene(scene);
        stage.show();
    }

    
    
    
    
    public static void main(String[] args) {
        int totalPrice;
        launch();
    }
    public void makeFile(){
        
    }

}