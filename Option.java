package MonteCarloSimulation;

public class Option {
	private String name;
	private String type;
	private double initialPrice;
	private int initialTime;
	private int expirationTime;
	private double interestRate;
	private double volatility;
	private double strikePrice;
	
	
    public Option(String name,String type,double initialPrice,int initialTime,int expirationTime
    		,double interestRate,double volatility,double strikePrice) {
      
		this.name=name;
		this.type=type;
		this.initialPrice=initialPrice;
		this.initialTime=initialTime;
		this.expirationTime=expirationTime;
		this.interestRate=interestRate;
		this.volatility=volatility;
		this.strikePrice=strikePrice;
	}
    
    public String getType() {
		return this.type; 
}
    
    public String getName() {
    		return this.name; 
    }
    
    public double getInitialPrice() {
    	    return this.initialPrice;
    }
    
    public int getInitialTime() {
    		return this.initialTime;
    }
    
    public int getExpirationTime() {
    		return this.expirationTime;
    }
    
    public double getInterestRate() {
    		return this.interestRate;
    }
    
    public double getVolatility() {
    		return this.volatility;
    }
    
    public double getStrikePrice() {
    		return this.strikePrice;
    }
 
}
