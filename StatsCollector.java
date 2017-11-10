package MonteCarloSimulation;

import java.util.ArrayList;

public class StatsCollector {
    private ArrayList<Double> data;
    private double mean;
    private double std;
    private double secondm;
    private int len;
    
    public StatsCollector() {
    	this.data=new ArrayList<Double>();
    	this.mean=0;
    	this.std=0;
    this.secondm=0;
    this.len=0;
    
    }
    
    public void add(double x) {
    	   
     	
     	this.mean=(this.mean*this.len+x)/(this.len+1);
     	this.secondm=this.secondm+x*x;
     	double temp=this.secondm-(this.mean)*(this.mean)*(this.len+1);
     	this.std=Math.sqrt(temp/(this.len+1));
     	this.len+=1;
     	this.data.add(x);
    	    
    }
    
    double getSec() {
    	return this.secondm;
    }
    double getMean() {
    	return this.mean;
    }
    
    double getStd() {
    	return this.std;
    }
}
