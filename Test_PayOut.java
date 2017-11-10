package MonteCarloSimulation;

import junit.framework.TestCase;

public class Test_PayOut extends TestCase {
	 public void test_PayOut() {
 	    int len=252;
 	    RandomVectorGenerator g1=new Gaussian(len);
 	    RandomVectorGenerator a1=new Antithetic(g1);
 	    Option IBM=new Option("IBM","European",152.35,0,252,0.0001,0.01,165);
 	    StockPath path1=new GBMStockPath(g1, IBM);
 	    PayOut pay=new EuropeanPayOut(path1,IBM);
 	    System.out.println("Payout");
 	    for(int i=0;i!=2;i++)
 	    {
 	    	double a=pay.getPayOut(path1);
 	   
 	    		System.out.println(a);
 	    	
 	    }
 	    
 	    Option IBM_2=new Option("IBM","Asian",152.35,0,252,0.0001,0.01,165);
	    StockPath path_2=new GBMStockPath(g1, IBM_2);
	    PayOut pay_2=new AsianPayOut(path1,IBM);
	    System.out.println("Payout");
	    for(int i=0;i!=10;i++)
	    {
	    	double a=pay_2.getPayOut(path_2);
	    
	    		System.out.println(a);
	    	
	    }
 	    
 	    
	    
 
 	    
 	 
   }
}
