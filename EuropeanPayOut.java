package MonteCarloSimulation;

import java.util.LinkedList;

public class EuropeanPayOut implements PayOut {

	private StockPath path;
	private Option opt;
	public EuropeanPayOut(StockPath path, Option opt) {
		this.path=path;
		this.opt=opt;
	}
	
	@Override
	public double getPayOut(StockPath path) {
		// TODO Auto-generated method stub
		LinkedList<PriceNode> temp=this.path.getPrices();
		int size=temp.size();
		double s=temp.get(size-1).getPrice();
		return Math.max(s-this.opt.getStrikePrice(), 0)*Math.exp(-size*opt.getInterestRate());
	}

}
