package com.mycompany.oopgroupassignment;

/**
 * MOHAMED LUQMAN HADI BIN MOHAMED SUHAIRI 2210855
 * Object-Oriented Programming Group Project
 */
public class Food {
    private String foodImagePath;
    private String foodName;
    private Double foodPrice;
    private int foodQty; //use to count qty ordered
    private int foodCalories;
    private String foodDesc;
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
        //for image
        
    
}
