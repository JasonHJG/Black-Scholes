package MonteCarloSimulation;

import java.util.ArrayList;

import junit.framework.TestCase;

public class Test_Gaussian extends TestCase {
	
      public void test_printVector() {
    	     int len=100000;
    	     Gaussian sto= new Gaussian(len);
    	     double[] vec=sto.getVector();
    	     double sum=0;
    	     for(int i=0;i!=len;i++) {
    	    	    sum+=vec[i];
    	     }
    	     double mean=sum/len;
    	     
    	     double var=0;
    	     for(int i=0;i!=len;i++) {
 	    	    var+=(vec[i]-mean)*(vec[i]-mean);
 	     }
    	     var=var/len;
    	     
    	     assertTrue(Math.abs(mean)<0.01);
    	     assertTrue(Math.abs(var-1)<0.01);
      }
      
      public void test_Antithetic() {
    	     int len=5;
    	   
 	     Gaussian sto1= new Gaussian(len);
 	     double[] vec1=sto1.getVector();
 	     
 	     Antithetic sto2=new Antithetic(sto1);
 	     double[] vec2=sto2.getVector();
 	    
 	    for(int i=0;i!=len;i++) {
 	    	     assertEquals(vec1[i],-vec2[i]);
 	    }
      }
      
      public void test_RandomVectorGenerator() {
    	    int len=1000;
    	    RandomVectorGenerator g1=new Gaussian(len);
    	    RandomVectorGenerator a1=new Antithetic(g1);
    	    double[] vec1= g1.getVector();
    	    
    	    double[] vec3= a1.getVector();
    	    for(int i=0;i!=2;i++) {
  	    	  System.out.println(vec3[i]);
  	    }
    	    for(int i=0;i!=2;i++) {
  	    	  System.out.println(vec1[i]);
  	    }
    	    
    	    
      }
      
      
     
      
}
