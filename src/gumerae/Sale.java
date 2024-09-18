
package gumerae;

import java.util.Scanner;

public class Sale {
      public void getSales(){
        Scanner input = new Scanner(System.in);
        Sales sls = new Sales();
        
        System.out.print("Enter Customer Name: ");
        String name_customer = input.nextLine();
        System.out.print("Enter Product Name: ");
        String product_name = input.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = input.nextInt();
        System.out.print("Enter Price: ");
        double price = input.nextFloat();
        System.out.print("Enter Cash: ");
        double cash = input.nextFloat();
        
        sls.addSales(name_customer, product_name, qty, price, cash);
        sls.viewSales();
    }
}
