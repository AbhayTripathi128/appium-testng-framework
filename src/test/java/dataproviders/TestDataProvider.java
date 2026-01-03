package dataproviders;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider(name = "loginData")
	public Object[][] getLoginData(){
		return new Object[][] {
			{"Dominica", "Bryan", "Male", new String[] {"Air Jordan 1 Mid SE", "PG 3"}},
			{"Argentina", "Alex", "Male",   new String[]{"PG 3"}},
			{"China", "Domina", "Female",   new String[]{"Converse All Star"}}
		};
	}
	
}
