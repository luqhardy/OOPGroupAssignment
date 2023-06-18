package com.mycompany.oopgroupassignment;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;
/**
 * MOHAMED LUQMAN HADI BIN MOHAMED SUHAIRI 2210855
 * Object-Oriented Programming Group Project
 */
public class Food {
    private String imagePath;
    private final IntegerProperty quantity;
    private Image foodImage;
    private String foodName;
    private Double foodPrice;
    private int foodQuantity;
    private int foodCalories;
    private String foodDesc;
    
    
    private ImageView foodImageView;
    public Food(String imagePath,String name, String desc, double price) {

            this.imagePath = imagePath;
            this.foodName = name;
            this.foodDesc = desc;
            this.foodPrice = price;
            this.quantity = new SimpleIntegerProperty(0);
            //foodImageView = imageview;
        }
    
           
    //getter and setter for food items
        public String getName() {
            return foodName;
        }

        public void setName(String name) {
            this.foodName = name;
        }

        public String getDesc() {
            return foodDesc;
        }

        public void setDescription(String desc) {
            this.foodDesc = desc;
        }

        public double getPrice() {
            return foodPrice;
        }

        public void setPrice(double price) {
            this.foodPrice = price;
        }

        public int getQuantity() {
        return quantity.get();
    }
     
    public String getImagePath() {
        return imagePath;
    }
    
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    public void setQuantity(int quantity) {
        this.quantity.set(quantity);
    }

    public IntegerProperty quantityProperty() {
        return quantity;
    }
    public Image getImage(){
        return foodImage;
    }
    
    
    //other methods
        //for image
        
    
}
