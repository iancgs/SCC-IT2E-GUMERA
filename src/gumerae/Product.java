
package gumerae;

public class Product {
     int id;
    String name;
    double price;
    int stocks, sold;
    double profit;
    double tep;
            
    Product(int pid, String name, double price, int stock, int sold) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public void addProducts(int pid, String pname, double pprice, int pstocks, int psold){
       
        this.id = pid;
        this.name = pname;
        this.price = pprice;
        this.stocks = pstocks;
        this.sold =psold;
    }
   
    public void viewProducts(){
        
        profit = this.price * this.sold;
        this.tep = this.stocks * this.price;
        String status = (this.stocks > 0) ? "Available" : "Out-of-stock";
       
        System.out.printf("%-10d %-10s %-10.2f %-10d %-10d %-10.2f %-10.2f %-10s\n",
                this.id, this.name, this.price, this.stocks, this.sold, this.profit, this.tep, status);
    }

}
