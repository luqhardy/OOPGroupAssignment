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
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


/**
 * MOHAMED LUQMAN HADI BIN MOHAMED SUHAIRI 2210855
 * Object-Oriented Programming Group Project
 */

//reminder: use array for new order and customer class objects
//use tableview pls
public class App extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {
        int signInFlag =0;
        String userNameCurrent ="";
        //Image import and ImageView for main program logo
        Image orderScrn = new Image(new FileInputStream("main.png"));
        ImageView orderScrnView = new ImageView(orderScrn); 
        Image foodImage2 = new Image(new FileInputStream("food.png"));
        ImageView foodImage = new ImageView(foodImage2); 
        Image drinkImage2 = new Image(new FileInputStream("drink.png"));
        ImageView drinkImage = new ImageView(drinkImage2); 
        //tableview for displaying food item from food class
        TableView foodItems = new TableView<>();
        TableColumn<Food,String> col1 = new TableColumn<>("Image");
        /* col1.setCellValueFactory(new PropertyValueFactory<>("Image")); */
        TableColumn<Food,String> col2 = new TableColumn<>("Name");
        col2.setCellValueFactory(new PropertyValueFactory<>("Name"));
        TableColumn<Food,Double> col3 = new TableColumn<>("Price");
        col3.setCellValueFactory(new PropertyValueFactory<>("Price"));
        TableColumn col4 = new TableColumn("Quantity");
        TableColumn col5 = new TableColumn("Add/Remove");
        foodItems.getColumns().addAll(col1,col2,col3,col4,col5);
        //tableview for drinks
        TableView drinkItems = new TableView<>();
        TableColumn<Drink,String> col1_1 = new TableColumn<>("Image");
        /* col1.setCellValueFactory(new PropertyValueFactory<>("Image")); */
        TableColumn<Drink,String> col2_1 = new TableColumn<>("Name");
        col2.setCellValueFactory(new PropertyValueFactory<>("Name"));
        TableColumn<Drink,Double> col3_1 = new TableColumn<>("Price");
        col3.setCellValueFactory(new PropertyValueFactory<>("Price"));
        TableColumn col4_1 = new TableColumn("Quantity");
        TableColumn col5_1 = new TableColumn("Add/Remove");
        
        drinkItems.getColumns().addAll(col1_1,col2_1,col3_1,col4_1,col5_1);
        //add/remove buttons
        
        
        
        //array for 10 food items demo
        Food PremiumBurger = new Food("Premium Burger","Finger Lickin' Good",9.99);
        Food FrenchFries = new Food("French Fries","Finger Lickin' Good",5.99);
        Food CheeseBurger = new Food("Cheese Burger","Finger Lickin' Good",5.99);
        Food FriedRice = new Food("Shrimp Fried Rice","Finger Lickin' Good",5.99);
        Food FriedRice2 = new Food("Kampung Fried Rice","Finger Lickin' Good",5.99);
        //use class drink which inherits food
        Drink Coke = new Drink("Coke","Finger Lickin' Good",4.99);
        Drink Pepsi = new Drink("Pepsi","Finger Lickin' Good",4.99);
        Drink AliCafe = new Drink("Ali Cafe","Finger Lickin' Good",6.99);
        Drink AbuCafe = new Drink("Abu Cafe","Finger Lickin' Good",6.99);
        Drink OreoIce = new Drink("Oreo Ice-cream","Finger Lickin' Good",6.99);
        
        Food foodItemArray [] = new Food [5];
        foodItemArray[0] = PremiumBurger;
        foodItemArray[1] = FrenchFries; 
        foodItemArray[2] = CheeseBurger; 
        foodItemArray[3] = FriedRice; 
        foodItemArray[4] = FriedRice2; 
        foodItems.getItems().add(foodItemArray[0]);
        foodItems.getItems().add(foodItemArray[1]);
        foodItems.getItems().add(foodItemArray[2]);
        foodItems.getItems().add(foodItemArray[3]);
        foodItems.getItems().add(foodItemArray[4]);      
        Drink drinkItemArray [] = new Drink [5];
        drinkItemArray[0] = Coke;
        drinkItemArray[1] = Pepsi; 
        drinkItemArray[2] = AliCafe; 
        drinkItemArray[3] = AbuCafe; 
        drinkItemArray[4] = OreoIce; 
        drinkItems.getItems().add(drinkItemArray[0]);
        drinkItems.getItems().add(drinkItemArray[1]);
        drinkItems.getItems().add(drinkItemArray[2]);
        drinkItems.getItems().add(drinkItemArray[3]);
        drinkItems.getItems().add(drinkItemArray[4]); 
        //HBox for signin details
        HBox user = new HBox();
        Label userNameLabel = new Label("Username:            ");
        TextField userName = new TextField("User Not Signed In");
        if(signInFlag != 0){
            userName.setText(userNameCurrent);
        }
        Button login = new Button("Click Here to Signup Or Login");
        login.setAlignment(Pos.CENTER);
        userName.setEditable(false);
        user.setPadding(new Insets(10,10,10,10));
        user.setAlignment(Pos.CENTER);
        user.getChildren().addAll(userNameLabel,userName);
        
         
        
        //HBox for Total Price and checkout button
        //total price textfield
        Label totalLabel = new Label("Total Price:");
        TextField total = new TextField("Total Price");
        total.setEditable(false);
        Button checkout = new Button("Checkout Now!");
        
        HBox checkoutBox = new HBox(totalLabel,total,checkout);
        checkoutBox.setAlignment(Pos.CENTER);
        checkoutBox.setPadding(new Insets(20,20,20,20));
        
        
        var scene = new Scene(new VBox(orderScrnView,user,login, foodImage,foodItems,drinkImage,drinkItems, checkoutBox), 400, 600);
        stage.setScene(scene);
        stage.show();
        
        //sign in window
        //signin build ui
        Image orderScrn2 = new Image(new FileInputStream("main2.png"));
        Button backBtn = new Button("Back to Order Window");
        backBtn.setOnAction(e -> {stage.setScene(scene);});
        
        ImageView orderScrnView2 = new ImageView(orderScrn2);
        Scene signin = new Scene(new VBox(orderScrnView2,backBtn), 400, 500);
        
        
        login.setOnAction(e -> {stage.setScene(signin);});
    }

    
    
    
    
    public static void main(String[] args) {
        int totalPrice;
        
        launch();
    }
    public void makeFile(){
        
    }

}