package MonteCarloSimulation;

import junit.framework.TestCase;

public class Test_StatsCollector extends TestCase {
	public void test_Stats() {
		StatsCollector a=new StatsCollector();
		assertEquals(a.getMean(),0.0);
		assertEquals(a.getStd(),0.0);
		a.add(1.0);
		System.out.println(a.getMean());
		System.out.println(a.getSec());
		System.out.println(a.getStd());
		
		assertEquals(a.getMean(),1.0);
		assertEquals(a.getStd(),0.0);
		a.add(3.0);
		System.out.println(a.getMean());
		System.out.println(a.getSec());
		System.out.println(a.getStd());
		
		assertEquals(a.getMean(),2.0);
		assertEquals(a.getStd(),1.0);
		
		a.add(2.0);
		System.out.println(a.getMean());
		System.out.println(a.getSec());
		System.out.println(a.getStd());
		
		assertEquals(a.getMean(),2.0);
		assertEquals(a.getStd(),(Math.sqrt(2.0/3)));
	}
}
