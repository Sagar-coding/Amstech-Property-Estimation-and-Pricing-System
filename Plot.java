
package com.mycompany.amstrechprivatelimited;


public class Plot {
    
    private double length;
    private double breadth;
    private double plotId;
    

    Plot(double length,double breadth,double plotId)
    {
        this.length=length;
        this.breadth=breadth;
        this.plotId=plotId;
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

    public double getPlotId() {
        return plotId;
    }

  
    public double getPlotArea()
    {
        return length*breadth;
    }
    
}
