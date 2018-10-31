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
public class TestDateDifference {
	private MyDateServices dateService = new MyDateServices();
	private long expected;
	private int testId;
	private int testDay1;
	private int testMonth1;
	private int testYear1;
	private int testDay2;
	private int testMonth2;
	private int testYear2;
	
	public TestDateDifference(int testId, long expected, int testDay1, int testMonth1, int testYear1, int testDay2, int testMonth2, int testYear2) {
		System.out.println("Object created: ParameterizedTest");
		this.expected = expected;
		this.testId = testId;
		this.testDay1 = testDay1;
		this.testMonth1 = testMonth1;
		this.testYear1 = testYear1;
		this.testDay2 = testDay2;
		this.testMonth2 = testMonth2;
		this.testYear2 = testYear2;
	}

	@Parameters
	public static Collection<Object[]> getTestParameters() {
		Collection<Object[]> dataList = new ArrayList<>();
		
		String fileName = "TestDateDifference.data";
		
		InputStream fis = null;
		BufferedReader reader = null;
		
		try {
<<<<<<< HEAD
			fis = new FileInputStream(TestDateDifference.class.getResourceAsStream("/"+fileName));
			reader = new BufferedReader(new InputStreamReader(fis));
=======
			reader = new BufferedReader(new InputStreamReader(TestDateDifference.class.getResourceAsStream("/"+fileName)));
>>>>>>> a5a8919aba419ac0bd927ad33354f55d9afe5b00
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
		int testId       = Integer.parseInt(strArr[0].trim());
		long expected = Long.parseLong(strArr[1].trim());
		int testDay1     = Integer.parseInt(strArr[2].trim());
		int testMonth1     = Integer.parseInt(strArr[3].trim());
		int testYear1     = Integer.parseInt(strArr[4].trim());
		int testDay2     = Integer.parseInt(strArr[5].trim());
		int testMonth2     = Integer.parseInt(strArr[6].trim());
		int testYear2     = Integer.parseInt(strArr[7].trim());
		Object[] objArr = {testId, expected, testDay1, testMonth1, testYear1, testDay2, testMonth2, testYear2};
		return objArr;
	}
	
	@Test
	public void dateDifference() {
		MyDate d1 = new MyDate(testDay1, testMonth1, testYear1);
		MyDate d2 = new MyDate(testDay2, testMonth2, testYear2);
		assertEquals("TestCase: "+testId, expected, dateService.diffDate(d1, d2));
	}
}

