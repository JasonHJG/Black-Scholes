package MonteCarloSimulation;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.LinkedList;
public class Test_Path extends TestCase {
	public void test_StockPath() {
	    int len=252;
	    RandomVectorGenerator g1=new Gaussian(len);
	    RandomVectorGenerator a1=new Antithetic(g1);
	    Option IBM=new Option("IBM","European",152.35,0,252,0.0001,0.01,165);
	    StockPath path1=new GBMStockPath(g1, IBM);
	    StockPath path2=new GBMStockPath(a1, IBM);
	
	    
	    
	    
	    
    LinkedList<PriceNode> n1=path1.getPrices();
    LinkedList<PriceNode> n2=path2.getPrices();
    
    for (int i=0;i!=50;i++) {
    	n2=path2.getPrices();
    	if(n2.get(251).getPrice()>0) {
    	System.out.println(n2.get(251).getPrice());
    }
    }
	    
	     
  }
  
}
