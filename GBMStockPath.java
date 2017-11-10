package MonteCarloSimulation;

import java.util.LinkedList;

public class GBMStockPath implements StockPath{
    private RandomVectorGenerator generator;
    private LinkedList<PriceNode> path;
    private Option opt;
	
    public GBMStockPath(RandomVectorGenerator generator, Option opt) {
    	   this.generator=generator;
    	   this.opt=opt;
    }
    
    public void makePath() {
    	    
    	    double price=this.opt.getInitialPrice();
    	    int start = this.opt.getInitialTime();
    	    //initiate first node
    	    PriceNode init=new PriceNode(start, price);
    	    path= new LinkedList<PriceNode>();
    	    path.add(init);
    	    //initiate parameters
    	    double[] kernel=generator.getVector();
    	    int length=kernel.length;
    	    double volatility=opt.getVolatility();
    	    double interestRate=opt.getInterestRate();
    	    
    	    for (int i=0;i!=length;i++) {
    	    	   int time=start+i;
    	    	   price=price*Math.exp((interestRate-volatility*volatility/2)+volatility*kernel[i]);
    	    	   path.add(new PriceNode(time, price));
    	    }
    	    
    	    
    }
	
	@Override
	public LinkedList<PriceNode> getPrices() {
		this.makePath();
		//System.out.println(this.path.get(10).getPrice());
		return this.path;
	}

}
