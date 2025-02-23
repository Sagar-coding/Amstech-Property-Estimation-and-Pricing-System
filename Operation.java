
package com.mycompany.amstrechprivatelimited;


public class Operation {
    
     public static double getTotalPrice(double area,double type){
   if(type==1)
     {
         return((area*Rate.plotRate));
     }
   else if(type==2)
   {
       return ((area*Rate.OfficeRate));
     }
   else if(type==3)
   {
       return((area*Rate.flateRate));
   }
   return 0;
     }
    public static double getRegistryCharge(double totalprice)
    {
        return((totalprice*Rate.registryCharge)/100);
    }
    public static double getGreenTax(double totalprice)
    {
        return ((totalprice*Rate.greenTax)/100);
                
                }
    
  
   
    
    

}
    
    
    
    
    
    
    
    
    
    
    
  