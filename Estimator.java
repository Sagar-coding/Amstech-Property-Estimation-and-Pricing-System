
package com.mycompany.amstrechprivatelimited;


public class Estimator {

    static void print(Plot p) {
        double totalPrice=Operation.getTotalPrice(p.getPlotArea(), 1);
        double registryCharge=Operation.getRegistryCharge(totalPrice);
        double greenTax=Operation.getGreenTax(totalPrice);
        double grandTotal=totalPrice+registryCharge+greenTax+Rate.societyDevelopmentCharge;
          System.out.println("id = "+p.getPlotId());
        System.out.println("length = "+p.getLength());
        System.out.println("breadth = "+p.getBreadth());
        System.out.println("area = "+p.getPlotArea());
        System.out.println("totalprice without any tax = "+totalPrice);
        System.out.println("greenTax = "+greenTax);
        System.out.println("resisreyCharge = "+registryCharge);
        System.out.println("grandTotal = "+grandTotal);
         System.out.println("********************************************************");
        
        
        
        
       
    }

    static void print(Office of) {
        
      
        double totalPrice=Operation.getTotalPrice(of.getOfficeArea(),2);
        double registryCharge=Operation.getRegistryCharge(totalPrice);
        double greenTax=Operation.getGreenTax(totalPrice);
        double grandTotal=totalPrice+registryCharge+greenTax+Rate.societyDevelopmentCharge;
        System.out.println("id = "+of.getOfficeId());
        System.out.println("length = "+of.getLength());
        System.out.println("breadth = "+of.getBreadth());
        System.out.println("area = "+of.getOfficeArea());
         System.out.println("totalprice without any tax =  "+totalPrice);
        System.out.println("greenTax = "+greenTax);
        System.out.println("resisreyCharge =  "+registryCharge);
        System.out.println("grandTotal = "+grandTotal);
         System.out.println("********************************************************");
        
    }

    static void print(Flate ft) {
        
        System.out.println("area = "+ft.getArea());
        System.out.println("flateid = "+ft.getAreaId());
        double totalprice=Operation.getTotalPrice(ft.getArea(), 03);
        double greentax=Operation.getRegistryCharge(totalprice);
        double registrycharges=Operation.getRegistryCharge(totalprice);
        double grandtotal=totalprice+greentax+registrycharges+Rate.societyDevelopmentCharge;
        System.out.println("id = "+ft.getAreaId());
        System.out.println("area = "+ft.getArea());
        System.out.println("total price without any tax = "+totalprice);
        System.out.println("greenTax = "+greentax);
        System.out.println("resisreyCharge = "+registrycharges);
        System.out.println("grandTotal = "+grandtotal);
         System.out.println("********************************************************");
        
       
    }
    
    
    
    
    
    
    
}
