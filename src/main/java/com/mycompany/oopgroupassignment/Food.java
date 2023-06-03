package com.mycompany.oopgroupassignment;

/**
 * MOHAMED LUQMAN HADI BIN MOHAMED SUHAIRI 2210855
 * Object-Oriented Programming Group Project
 */
public class Food {
    private String foodName;
    private Double foodPrice;
    private int foodCalories;
    private String foodDesc;
    private String foodImagePath;
    public Food(String name, String desc, double price) {
            this.foodName = name;
            this.foodDesc = desc;
            this.foodPrice = price;
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
            this.foodDesc = foodDesc;
        }

        public double getPrice() {
            return foodPrice;
        }

        public void setPrice(double price) {
            this.foodPrice = price;
        }
            
        
    
    
    //other methods
    
}
