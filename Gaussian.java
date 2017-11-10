package MonteCarloSimulation;
import java.util.*;

public class Gaussian implements RandomVectorGenerator{

	
	private int length;
	private double[] vec;
	Random rand;
	public Gaussian(int length) {
		this.length=length;
		this.vec=new double[length];
		this.rand = new Random();
		rand.setSeed(123456);
	}
	
	public void printVector() {
		for (int i=0;i!=length;i++) {
			System.out.println(this.vec[i]);;
		}
	}
	public double[] getGaussVec() {
		return this.vec;
	}
	
	@Override
	public double[] getVector() {
		
		
		for (int i=0;i!=length;i++) {
			double a=this.rand.nextGaussian();
			this.vec[i]=a;	
		}
		return this.vec;

		
}
}
