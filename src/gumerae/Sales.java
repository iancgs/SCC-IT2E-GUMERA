
package gumerae;

public class Sales {
     String name_customer, name_product;
    int quantity;
    double price, cash ;
    
    public void addSales(String ncustomer, String nproduct,int qty, double cprice, double ccash){
        this.name_customer = ncustomer;
        this.name_product = nproduct;
        this.quantity = qty;
        this.price = cprice;
        this.cash = ccash;    
    }
    
    public void viewSales(){
        System.out.println("----------------------");
        System.out.println("RECEIPT: ");
        System.out.println("----------------------");
        
        System.out.println("Name: "+name_customer);
        System.out.println("Item Name: "+name_product);
        System.out.println("Quantity: "+quantity);
        System.out.println("----------------------");
        System.out.printf("Total Due: %.2f\n", quantity * price);
        System.out.printf("Cash: %.2f\n", cash);
        System.out.println("----------------------");
        System.out.printf("Change: %.2f\n",cash-(quantity * price));
             }
}
