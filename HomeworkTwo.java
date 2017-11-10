package MonteCarloSimulation;

public class HomeworkTwo {
   public static void main(String []args) {
	    Option IBM=new Option("IBM","European",152.35,0,252,0.0001,0.01,165);
	    int len=IBM.getExpirationTime()-IBM.getInitialTime();
		PayOut pay,pay2;
	    RandomVectorGenerator g1=new Gaussian(len);
	    RandomVectorGenerator a1=new Antithetic(g1);

	    
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
	    System.out.println("The Price for European Option with:");
	    System.out.print("Initial stock price ");
	    System.out.print(IBM.getInitialPrice());
	    System.out.print('\n');
	    System.out.print("Strike price ");
	    System.out.print(IBM.getStrikePrice());
	    System.out.print('\n');
	    System.out.print("Expiration time ");
	    System.out.print(IBM.getExpirationTime());
	    System.out.print('\n');
	    System.out.print("Volatility ");
	    System.out.print(IBM.getVolatility());
	    System.out.print('\n');
	    System.out.print("Interest rate ");
	    System.out.print(IBM.getInterestRate());
	    System.out.print('\n');
	    System.out.print("is: ");
	    System.out.print(a);
	    System.out.print('\n');
	    System.out.println('\n');
	    
	    
	    IBM=new Option("IBM","Asian",152.35,0,252,0.0001,0.01,164);
	    type=IBM.getType();
	    if (type=="European") {
	      	pay=new EuropeanPayOut(path1,IBM);
	      	pay2=new EuropeanPayOut(path2,IBM);
	    }
	    else {
	      	pay=new AsianPayOut(path1,IBM);
	      	pay2=new AsianPayOut(path2,IBM);
	    }
	    
	    pay=new AsianPayOut(path1,IBM);
      	pay2=new AsianPayOut(path2,IBM);
	    //PayOut pay3=new AsianPayOut(path1,IBM);
	    //PayOut pay4=new AsianPayOut(path2,IBM);
	    StatsCollector stats1=new StatsCollector();
	    double b=Simulator.Simulate(pay, path1, pay2, path2, IBM, stats1);
	    System.out.println("The Price for Aasian Option with:");
	    System.out.print("Initial stock price ");
	    System.out.print(IBM.getInitialPrice());
	    System.out.print('\n');
	    System.out.print("Strike price ");
	    System.out.print(IBM.getStrikePrice());
	    System.out.print('\n');
	    System.out.print("Expiration time ");
	    System.out.print(IBM.getExpirationTime());
	    System.out.print('\n');
	    System.out.print("Volatility ");
	    System.out.print(IBM.getVolatility());
	    System.out.print('\n');
	    System.out.print("Interest rate ");
	    System.out.print(IBM.getInterestRate());
	    System.out.print('\n');
	    System.out.print("is: ");
	    System.out.print(b);
	    System.out.print('\n');
	    System.out.println('\n');
	  
	    
	   
   }
}
