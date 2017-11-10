package MonteCarloSimulation;

public class Antithetic extends Transform {

	public Antithetic(RandomVectorGenerator instance) {
		super(instance);
	}
	
	@Override
	public double[] getVector() {
        
		double []vec=instance.getVector();
		double []newVec= new double[this.length];
	    for(int i=0;i!=this.length;i++) {    
	    	    newVec[i]=-vec[i];
	    }
	    return newVec;
	}

}
