package com.mycompany.oopgroupassignment;



public class Customer {
    private String custName;
    private String custPass;
    
    public Customer(String custName, String custPass) {
        this.custName = custName;
        this.custPass = custPass;
    }
    
    public String getCustName() {
        return custName;
    }
    
    public String getCustPass() {
        return custPass;
    }
    
    public void setCustName(String custName) {
        this.custName = custName;
    }
    
    public void setCustPass(String custPass) {
        this.custPass = custPass;
    }
}
