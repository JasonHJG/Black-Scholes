package MonteCarloSimulation;

import junit.framework.TestCase;

public class Test_Simulator extends TestCase {
	public void test_Simulator() {
		int len=252;
		PayOut pay,pay2;
 	    RandomVectorGenerator g1=new Gaussian(len);
 	    RandomVectorGenerator a1=new Antithetic(g1);

 	    Option IBM=new Option("IBM","European",152.35,0,252,0.0001,0.01,165);
 	    String type=IBM.getType();
 	    StockPath path1=new GBMStockPath(g1, IBM);
 	    StockPath path2=new GBMStockPath(a1, IBM);
 	    if (type=="European") {
 	      	pay=new EuropeanPayOut(path1,IBM);
 	      	pay2=new EuropeanPayOut(path2,IBM);
 	    }
 	    else {
 	      	pay=new AsianPayOut(path1,IBM);
 	      	pay2=new AsianPayOut(path2,IBM);
 	    }
 	    
 	    
 	    
	   
	    StatsCollector stats=new StatsCollector();
	    double a=Simulator.Simulate(pay, path1, pay2, path2, IBM, stats);
	    //double out=(a-IBM.getStrikePrice())*Math.exp(-IBM)
	    System.out.println(a);
	    
	    
	    IBM=new Option("IBM","European",152.35,0,252,0.0001,0.01,164);
	    PayOut pay3=new AsianPayOut(path1,IBM);
	    PayOut pay4=new AsianPayOut(path2,IBM);
	    StatsCollector stats1=new StatsCollector();
	    double b=Simulator.Simulate(pay3, path1, pay4, path2, IBM, stats1);
	    System.out.println(b);
	    
	    
	}
	 
}
