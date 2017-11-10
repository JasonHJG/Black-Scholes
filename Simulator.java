package MonteCarloSimulation;

public class Simulator {
	
	public static double Simulate(PayOut pay1, StockPath pat1,PayOut pay2, StockPath pat2, Option opt, StatsCollector stats) 
	{
		
		for(int i=0;i!=30000000;i++) {
		stats.add(pay1.getPayOut(pat1));
		stats.add(pay2.getPayOut(pat2));
		double indicator=2.05*stats.getStd()/Math.sqrt(i);
		//System.out.println(indicator);
		if(i>100 && indicator<0.1) {
			
			System.out.println("Solution Converges");
			break;
		}
		
		
	}
		return stats.getMean();
	
	}
	 
	    
	    
}
