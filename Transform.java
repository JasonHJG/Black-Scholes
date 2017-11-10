package MonteCarloSimulation;

public abstract class Transform implements RandomVectorGenerator{
      protected RandomVectorGenerator instance;
      protected int length;
      public Transform(RandomVectorGenerator instance) {
    	    this.instance=instance;
    	    this.length=instance.getVector().length;
      }
      
      
      public double[] getVector() {
    	     return instance.getVector();
      }
}
