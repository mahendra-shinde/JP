package com.jUnit040Parameterized.testParameters030DataCSV;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestDateToDays {
	private MyDateServices dateService = new MyDateServices();
	private long expected;
	private int testId;
	private int testDay;
	private int testMonth;
	private int testYear;
	
	public TestDateToDays(long expected, int testId, int testDay, int testMonth, int testYear) {
		System.out.println("Object created: ParameterizedTest");
		this.expected = expected;
		this.testId = testId;
		this.testDay = testDay;
		this.testMonth = testMonth;
		this.testYear = testYear;
	}
	@Parameters
	public static Collection<Object[]> getTestParameters() {
		Collection<Object[]> dataList = new ArrayList<>();
		String filePath = "F:\\JUnit\\JUnitWS\\JUnit010TestBasics\\src\\com\\jUnit040Parameterized\\testParameters030DataCSV";
		String fileName = "TestDateToDays.data";
		
		InputStream fis = null;
		BufferedReader reader = null;
		
		try {
			fis = new FileInputStream(filePath+File.separator+fileName);
			reader = new BufferedReader(new InputStreamReader(fis));
			reader.readLine(); // Bypass head row
				
			String dataRow = reader.readLine();
				
			while(dataRow != null){
				dataList.add(tokenize(dataRow));
				dataRow = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null){
					reader.close();
				}
				if (fis != null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return dataList;
	}
	
	private static Object[] tokenize(String dataRow){
		String[] strArr = dataRow.split(",");
		long expected = Long.parseLong(strArr[0].trim());
		int testId       = Integer.parseInt(strArr[1].trim());
		int testDay     = Integer.parseInt(strArr[2].trim());
		int testMonth     = Integer.parseInt(strArr[3].trim());
		int testYear     = Integer.parseInt(strArr[4].trim());
		Object[] objArr = {expected, testId, testDay, testMonth, testYear};
		return objArr;
	}
	
	
	@Test
	public void dateToDays() {
		MyDate dt = new MyDate(testDay, testMonth, testYear);
		assertEquals("TestCase: "+testId, expected, dateService.toDays(dt));
	}
}
