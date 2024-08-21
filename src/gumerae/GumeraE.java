
package gumerae;

import java.util.Scanner;  

public class GumeraE {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        String name_customer,product_name;
    float qty,price,cash;
        
        System.out.print("Enter Customer Name: ");
        String customer = input.nextLine();
        System.out.println("Enter Product Name: ");
        String product = input.nextLine();
        System.out.println("Quantity: ");
        qty = input.nextFloat();
        System.out.println("Price: ");
        price = input.nextFloat();
        System.out.println("Cash: ");
        cash = input.nextFloat();
        
     System.out.println("------------------------------");
     System.out.println("RECEIPT");
     System.out.println("------------------------------");
     
        System.out.println("Name:"+customer);
        System.out.println("Item:"+product);
        System.out.println("Quantity:"+qty);
        System.out.println("----------------------------");
        System.out.println("Total Due: "+(qty*price));
        System.out.println("Cash: "+(cash));
        System.out.println("-----------------------------");
        System.out.println("Change; "+(cash-(qty*price)));
        
    }
    
}
