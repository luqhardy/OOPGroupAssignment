package com.mycompany.oopgroupassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.application.Application;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.util.Callback;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * MOHAMED LUQMAN HADI BIN MOHAMED SUHAIRI 2210855
 * Object-Oriented Programming Group Project
 */

//reminder: use array for new order and customer class objects
//use tableview pls

public class App extends Application {
    Double totalPrice = 0.00;
    String userNameCurrent="";
    public String userNameNow="";
    private boolean isLoggedIn = false;
    private String currentUser = "";
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    @Override
    public void start(Stage stage) throws FileNotFoundException {
        //load images into start
        Image food1 = new Image(new FileInputStream("food1.png"));
        Image food2 = new Image(new FileInputStream("food2.png"));
        
        
        stage.setResizable(false);
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
        TableColumn col1 = new TableColumn<>("Image");
        
        /* col1.setCellValueFactory(new PropertyValueFactory<>("Image")); */
        TableColumn<Food,String> col2 = new TableColumn<>("Name");
        col2.setCellValueFactory(new PropertyValueFactory<>("Name"));
        TableColumn<Food,Double> col3 = new TableColumn<>("Price");
        col3.setCellValueFactory(new PropertyValueFactory<>("Price"));
        TableColumn<Food,Integer> col4 = new TableColumn("Quantity");
        col4.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        TableColumn col5 = new TableColumn("Add/Remove");
        foodItems.getColumns().addAll(col1,col2,col3,col4,col5);
        //tableview for drinks
        
        TableView drinkItems = new TableView<>();
        TableColumn col1_1 = new TableColumn<>("Image");
        //col1_1.setCellValueFactory(new PropertyValueFactory<>("Image"));
        TableColumn<Drink,String> col2_1 = new TableColumn<>("Name");
        col2_1.setCellValueFactory(new PropertyValueFactory<>("Name"));
        TableColumn<Drink,Double> col3_1 = new TableColumn<>("Price");
        col3_1.setCellValueFactory(new PropertyValueFactory<>("Price"));
        TableColumn<Drink,Integer> col4_1 = new TableColumn("Quantity");
        col4_1.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        TableColumn col5_1 = new TableColumn("Add/Remove");
        
        drinkItems.getColumns().addAll(col1_1,col2_1,col3_1,col4_1,col5_1);
        
    col1.setCellValueFactory(new PropertyValueFactory<>("Image"));
    

        col1.setResizable(false);
        col2.setResizable(false);
        col3.setResizable(false);
        col4.setResizable(false);
        col5.setResizable(false);
        col1_1.setResizable(false);
        col2_1.setResizable(false);
        col3_1.setResizable(false);
        col4_1.setResizable(false);
        col5_1.setResizable(false);
        
        col1.setReorderable(false);
        col2.setReorderable(false);
        col3.setReorderable(false);
        col4.setReorderable(false);
        col5.setReorderable(false);
        col1_1.setReorderable(false);
        col2_1.setReorderable(false);
        col3_1.setReorderable(false);
        col4_1.setReorderable(false);
        col5_1.setReorderable(false);
        
        
        col5.setCellFactory(new Callback<TableColumn, TableCell>() {
    @Override
    public TableCell call(TableColumn param) {
        return new TableCell<Food, Void>() {
            private final Button addButton = new Button("+");
            private final Button removeButton = new Button("-");

            {
                addButton.setOnMouseClicked(event -> {
                   getTableRow().getItem().setQuantity(getTableRow().getItem().getQuantity()+1);
                });

                removeButton.setOnMouseClicked(event -> {
                    getTableRow().getItem().setQuantity(getTableRow().getItem().getQuantity()-1);
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(new HBox(addButton, removeButton));
                }
            }
        };
    }
});
        
        Object v = "C:\\Users\\luqma\\Documents\\NetBeansProjects\\OOPGroupAssignment\\food1.png";
        StringProperty var = new SimpleStringProperty((String) v);
        //array for 10 food items demo
        Food PremiumBurger = new Food("food1.png","Premium Burger","Finger Lickin' Good",9.99);
        Food FrenchFries = new Food("food1.png","French Fries","Finger Lickin' Good",5.99);
        Food CheeseBurger = new Food("food1.png","Cheese Burger","Finger Lickin' Good",5.99);
        Food FriedRice = new Food("food1.png","Shrimp Fried Rice","Finger Lickin' Good",5.99);
        Food FriedRice2 = new Food("food1.png","Kampung Fried Rice","Finger Lickin' Good",5.99);
        //use class drink which inherits food
        Drink Coke = new Drink("food1.png","Coke","Finger Lickin' Good",4.99);
        Drink Pepsi = new Drink("food1.png","Pepsi","Finger Lickin' Good",4.99);
        Drink AliCafe = new Drink("food1.png","Ali Cafe","Finger Lickin' Good",6.99);
        Drink AbuCafe = new Drink("food1.png","Abu Cafe","Finger Lickin' Good",6.99);
        Drink OreoIce = new Drink("food1.png","Oreo Ice-cream","Finger Lickin' Good",6.99);
        
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
        Label totalLabel = new Label("Total Price:");
        TextField total = new TextField();
        total.setPromptText("Total Price");
        total.setEditable(false);
        Button checkout = new Button("Checkout Now!");
        
        HBox checkoutBox = new HBox(totalLabel,total,checkout);
        checkoutBox.setAlignment(Pos.CENTER);
        checkoutBox.setPadding(new Insets(20,20,20,20));
            col5_1.setCellFactory(new Callback<TableColumn, TableCell>() {
    @Override
    public TableCell call(TableColumn param) {
        return new TableCell<Food, Void>() {
            private final Button addButton = new Button("+");
            private final Button removeButton = new Button("-");

            {
                addButton.setOnMouseClicked(event -> {
                   getTableRow().getItem().setQuantity(getTableRow().getItem().getQuantity()+1);
                   totalPrice = totalPrice+getTableRow().getItem().getPrice();
                   
                   total.setText(df.format(totalPrice));
                });

        removeButton.setOnMouseClicked(event -> {
        if(getTableRow().getItem().getQuantity()>0){
                getTableRow().getItem().setQuantity(getTableRow().getItem().getQuantity()-1);
                    
        totalPrice = totalPrice-getTableRow().getItem().getPrice();
        }
        total.setText(df.format(totalPrice));
   
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(new HBox(addButton, removeButton));
                }
            }
        };
    }
});
    col5.setCellFactory(new Callback<TableColumn, TableCell>() {
    @Override
    public TableCell call(TableColumn param) {
        return new TableCell<Food, Void>() {
            private final Button addButton = new Button("+");
            private final Button removeButton = new Button("-");

            {
                addButton.setOnMouseClicked(event -> {
                   getTableRow().getItem().setQuantity(getTableRow().getItem().getQuantity()+1);
                   totalPrice = totalPrice+getTableRow().getItem().getPrice();
                   
                   total.setText(df.format(totalPrice));
                });
                
        removeButton.setOnMouseClicked(event -> {
        if(getTableRow().getItem().getQuantity()>0){
                getTableRow().getItem().setQuantity(getTableRow().getItem().getQuantity()-1);
                    
        totalPrice = totalPrice-getTableRow().getItem().getPrice();
        }
        total.setText(df.format(totalPrice));
   
                });
            }

            @Override
            protected void updateItem(Void item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                    setGraphic(null);
                } else {
                    setGraphic(new HBox(addButton, removeButton));
                }
            }
        };
    }
    });
    col1.setCellFactory(column -> new TableCell<Food, String>() {
    private final ImageView imageView = new ImageView();
    
    @Override
    protected void updateItem(String imagePath, boolean empty) {
        super.updateItem(imagePath, empty);
        
        if (imagePath == null || empty) {
            setGraphic(null);
        } else {
            try {
                Image image = new Image(new FileInputStream(imagePath));
                imageView.setImage(image);
                imageView.setFitWidth(50);
                imageView.setFitHeight(50);
                setGraphic(imageView);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
});
    ObservableList<Food> data = FXCollections.observableArrayList();
 
    /*
    col1.setCellValueFactory(cellData -> {
            ImageView imageView = new ImageView();
            imageView.setFitHeight(50);
            imageView.setFitWidth(50);
            imageView.setPreserveRatio(true);

            String imagePath = getTableRow().getItem().getImagePath();
            Image image = new Image(imagePath);
            imageView.setImage(image);

            return new SimpleObjectProperty<>(imageView);
        });
/*
        col1.setCellValueFactory(cellData -> {
        ImageView imageView = new ImageView();
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        imageView.setPreserveRatio(true);

        Food food = cellData.getValue();
        String imagePath = food.getImagePath();
        Image image = new Image(imagePath);
        imageView.setImage(image);

        return new SimpleObjectProperty<>(imageView);
    }); */
        /*
        col1.setCellFactory(column -> new TableCell<Food, ImageView>() {
    private final ImageView imageView = new ImageView();
    
    @Override
    protected void updateItem(ImageView item, boolean empty) {
        super.updateItem(item, empty);
        
        if (item == null || empty) {
            setGraphic(null);
        } else {
            imageView.setImage(food1);
            setGraphic(imageView);
            }
        }
    });*/
        
      
       // HBox for signin details
        HBox user = new HBox();
        Label userNameLabel = new Label("Username:            ");
        TextField userName = new TextField("User Not Signed In");
        if (signInFlag != 0) {
            userName.setText(userNameCurrent);
        }
        Button login = new Button("Click Here to Signup Or Login");
        login.setAlignment(Pos.CENTER);
        userName.setEditable(false);
        user.setPadding(new Insets(10, 10, 10, 10));
        user.setAlignment(Pos.CENTER);
        user.getChildren().addAll(userNameLabel, userName);
        
   
         
            
        //HBox for Total Price and checkout button
        //total price textfield
        
        
        
        
        //ok dah
        
        var scene = new Scene(new VBox(orderScrnView,user,login, foodImage,foodItems,drinkImage,drinkItems, checkoutBox), 400, 600);
        stage.setScene(scene);
        stage.show();
        
        
        Scene orderScene = new Scene(new VBox(orderScrnView, user, login, foodImage, foodItems, drinkImage, drinkItems,
                checkoutBox), 400, 700);
        stage.setScene(orderScene);
        stage.show();
        
        
        //sign in window
        //signin build ui
        Image orderScrn2 = new Image(new FileInputStream("main2.png"));
        Button backBtn = new Button("Back to Order Window");
        backBtn.setOnAction(e -> {
            stage.setScene(orderScene);
        });
        
        ImageView orderScrnView2 = new ImageView(orderScrn2);

         VBox loginBox = new VBox();
        loginBox.setSpacing(10);
        loginBox.setPadding(new Insets(20));
        loginBox.getChildren().add(orderScrnView2);

        Label loginLabel = new Label("Login / Signup");
        loginLabel.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Label usernameLabel = new Label("Username:");
        TextField usernameField = new TextField();

        Label passwordLabel = new Label("Password:");
        PasswordField passwordField = new PasswordField();

        
        
        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
     // Perform login logic here
     
            boolean loginSuccessful = performLogin(username, password);
            if (loginSuccessful) {
                isLoggedIn = true;
                currentUser = username;
                userName.setText(username);
                userNameNow = username;
                stage.setScene(orderScene);
            } else {
                // Show error message or handle invalid login
                // ...
            }
        });
        
        Button signupButton = new Button("Signup");
        signupButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            // Perform signup logic here
            boolean signupSuccessful = performSignup(username, password);
            if (signupSuccessful) {
                isLoggedIn = true;
                currentUser = username;
                userName.setText(username);
                userNameNow = username;
                stage.setScene(orderScene);
            } else {
                // Show error message or handle invalid signup
                // ...
            }
            
        });
        
        //muazzam buat checkout now = save txt
        
    
    loginBox.getChildren().addAll(loginLabel, usernameLabel, usernameField, passwordLabel, passwordField,
                loginButton, signupButton, backBtn);
        
    
    
    
    
    
        Scene signin = new Scene(loginBox, 400, 500);

        login.setOnAction(e -> {
            stage.setScene(signin);
        });
        checkout.setOnAction(event -> {
            if(isLoggedIn == true){
            saveOrderToFile(userNameNow,df.format(totalPrice));}
            else{
                stage.setScene(signin);
            }
        });
    }
    
    
     private boolean performLogin(String username, String password) {
        // Implement login logic here
        // Check if the username and password match the stored credentials
        // Return true if login is successful, false otherwise
        return true; // Placeholder
    }

    private boolean performSignup(String username, String password) {
        // Implement signup logic here
        // Create a new Customer object and store the credentials
        // Return true if signup is successful, false otherwise
        return true; // Placeholder
    }
    
    //save txt wen click checkout
    private void saveOrderToFile(String userNameCurrent,String totalPrice) {
    // Get the order details and format them as a string
    StringBuilder orderDetails = new StringBuilder();
    orderDetails.append("Order Details:\n");
    orderDetails.append("Username: "+userNameCurrent+"\n");
    orderDetails.append("Total Price: "+totalPrice+"\n");
    // Append the order details to the StringBuilder, e.g., food items, quantities, total price, etc.

    // Define the file name and path where the .txt file will be saved
    String fileName = "order.txt";
    String filePath = "";

    try (PrintWriter writer = new PrintWriter("order.txt")) {
        // Write the order details to the file
        writer.write(orderDetails.toString());
        writer.flush();
        System.out.println("Order saved to Project Path");
    } catch (FileNotFoundException ex) {
        System.out.println("Error saving the order: " + ex.getMessage());
    }
}

        
    public static void main(String[] args) {
        int totalPrice;
        
        launch();
    }
    public void makeFile(){
            
    }

}