package edu.umkc.lab6;


import org.junit.Test;

public class UnitTest {
	
		SuperMarketAPI superMarketService = new SuperMarketAPI();
		@Test
		public void test1() throws Exception{
		String jsonstr=superMarketService.getSuperMarketDetails();
		if(jsonstr!=null)
		{
			System.out.println("JSON data is retrieved!");
		}
	}
}
