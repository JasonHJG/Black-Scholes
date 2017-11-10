package MonteCarloSimulation;

import java.util.LinkedList;

public class AsianPayOut implements PayOut{
	private StockPath path;
	private Option opt;
	public AsianPayOut(StockPath path, Option opt) {
		this.path=path;
		this.opt=opt;
	}
	 
	@Override
	public double getPayOut(StockPath path) {
		LinkedList<PriceNode> temp=this.path.getPrices();
		int size=temp.size();
		
	
		double total=0;
		for(int i=0;i!=size;i++) {
			total+=temp.get(i).getPrice();
		}
		return Math.max(0, total/size-this.opt.getStrikePrice())*Math.exp(-size*opt.getInterestRate());
	}

}
