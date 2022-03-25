package DataDrivenTesting;

import org.testng.annotations.DataProvider;

public class DataForTests {

	@DataProvider(name = "DataForPost")
	public Object[][] dataForPost() {
//		Object[][] data = new Object[2][3];
//		
//		data[0][0]= "Albert";
//		data[0][1]="Sharma";
//		data[0][2]= 2;
//		
//		data[1][0]= "Einstein";
//		data[1][1]="Verma";
//		data[1][2]= 1;

		return new Object[][] { { "Graham", "Bell", 1 }, { "Henry", "Ford", 2 } };

	}

	@DataProvider(name = "DataForDelete")
	public Object[] dataForDelete() {
		return new Object[] { 4, 5};

	}

}
