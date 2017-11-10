package MonteCarloSimulation;
import java.util.LinkedList;
import java.util.List;

public interface StockPath {
	public LinkedList<PriceNode> getPrices();
}
