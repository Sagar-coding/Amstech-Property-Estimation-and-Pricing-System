

package com.mycompany.amstrechprivatelimited;

import java.util.Scanner;

public class AmstechPrivateLimited {

static void Main_menu(){
    System.out.println("Enter your Choice For buy:");
    System.out.println("1.buy plot \t\t\t 2.but flat \t\t\t 3.buy office ");
}

    public static void main(String[] args) {
        
       
        Scanner obj = new Scanner(System.in);
        int input = 9;
        while(input != 0){
            Main_menu();
            input = obj.nextInt();  
        if(input == 1){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of plot");
            int length = sc.nextInt();
            System.out.println("Enter breadth of plot");
            int breadth = sc.nextInt();
            System.out.println("Enter id of plot");
            int id = sc.nextInt();
            Plot p=new Plot(length,breadth,id);
            Estimator.print(p);//

            System.out.println("Enter 9 Go Back For Menu");
            System.out.println("Enter 0 For Exit");
            input =sc.nextInt();

            if ( input == 0){
                System.out.println("Extiting the Program");
            }
            else { 
                System.out.println("Enter a valid choice");
            }
           
            
             
            
            
        }
        else if(input == 2){
            Scanner F = new Scanner(System.in);
            System.out.println("Enter Area of Flat");
            int length = F.nextInt();
            System.out.println("Enter Areaid of Flat");
            int breadth = F.nextInt();
            // System.out.println("Enter id of plot");
            // int id = F.nextInt();
            Flate f = new Flate(length,breadth);
            Estimator.print(f); 
            System.out.println("Enter 9 Go Back For Menu");
            System.out.println("Enter 0 For Exit");
            input =F.nextInt();
            if ( input == 0){
                System.out.println("Extiting the Program");
            }
            else {
                System.out.println("Enter a valid choice");
            }
           

        }
        else if(input == 3){
            Scanner O = new Scanner(System.in);
            System.out.println("Enter length of Office");
            int length = O.nextInt();
            System.out.println("Enter breadth of office");
            int breadth = O.nextInt();
            System.out.println("Enter id of office");
            int id = O.nextInt();
            Office Of = new Office(length,breadth,id);
            Estimator.print(Of);
            System.out.println("Enter 9 Go Back For Menu");
            System.out.println("Enter 0 For Exit");
            input =O.nextInt();
            if ( input == 0){
                System.out.println("Extiting the Program");
            }
           

        }
        else {
            System.out.println("enter a valid choice:");
        }
        






        
        
        // System.out.println("Enter length of plot");
        // int length = sc.nextInt();
        // System.out.println("Enter breadth of plot");
        // int breadth = sc.nextInt();
        // System.out.println("Enter id of plot");
        // int id = sc.nextInt();
        // Plot p=new Plot(length,breadth,id);
        // Estimator.print(p);// 
        // Office of =new Office(20,30,102);
        // Estimator.print(of);
        
        
        // Flate ft = new Flate(100,103);
        // Estimator.print(ft);

        

       
    }
}
}