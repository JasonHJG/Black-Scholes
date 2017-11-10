package MonteCarloSimulation;

public class PriceNode {
     private int date;
     private double price;
     public PriceNode(int date, double price){
    	  this.date=date;
    	  this.price=price;
     }
     
     public double getPrice() {
    	   return this.price;
     }
     
     public double getDate() {
  	   return this.date;
   }
}
