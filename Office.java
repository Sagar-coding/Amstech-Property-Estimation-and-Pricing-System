
package com.mycompany.amstrechprivatelimited;


public class Office {
    
    private double length;
    private double breadth;
    private double officeId;

    public Office(double length, double breadth, double officeId) {
        this.length = length;
        this.breadth = breadth;
        this.officeId = officeId;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getOfficeId() {
        return officeId;
    }

   
    public double getOfficeArea()
    {
        return length*breadth;
    }
    
    
    
}
