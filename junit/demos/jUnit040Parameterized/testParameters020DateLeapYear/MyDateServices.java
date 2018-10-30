package com.jUnit040Parameterized.testParameters020DateLeapYear;

public class MyDateServices {
	static int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final static int baseYear = 2000; 
	
	public static boolean isLeapYear(int yy)	{
		if (yy%400 == 0)							// ########### yy%400 == 0
			return true;
		else if (yy%100 == 0)						// ####### yy%100 == 0
			return false;
		else if (yy%4 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isValid(MyDate dt)	{
		// Range validation for month
		if ((dt.getMm()<1)||(dt.getMm()>12))
			return false;
			
		// Range validation for a day including 29 days for February
		if ((dt.getDd()<1) || (dt.getDd()>monthDays[dt.getMm()-1]))
			return false;						// ##########
			
		// Leap year validation
		if ((dt.getMm() == 2) && (dt.getDd()>28) && !isLeapYear(dt.getYy()))
				return false;
		return true;
	}

	public int toDays(MyDate dt)
		{	if (!isValid(dt))
				return -1;
			int noDays=0;
			for(int i=baseYear; i<dt.getYy(); i++)
				if (isLeapYear(i))
					noDays+=366;
				else
					noDays+=365;								//##########
			boolean isThisLeapYear = isLeapYear(dt.getYy());
			for(int i = 1;i<dt.getMm(); i++)
				{	if (!isThisLeapYear && (i==2))
						noDays+= 28;
					else
						noDays+=monthDays[i-1];
				}
			noDays += dt.getDd();
			return noDays;
		}
	
	public int diffDate(MyDate d1, MyDate d2)	{
		int dur1 = toDays(d1);
		int dur2 = toDays(d2);
		int dur = dur2 - dur1;						// ########## dur2 - dur1
		//dur = (dur<0)?dur*(-1):dur;
		return dur;
	}
	

	/*
	
	public static void main(String[] args) {
		MyDate date = new MyDate();
		
		for(Object[] list : getTestParameters()){
			//System.out.println(list[1]+" "+list[2]+" "+list[3]+" "+list[4]);
			
			System.out.println(list[1]+"   "+date.toDays((Integer)list[2], (Integer)list[3], (Integer)list[4]));
		}
	}*/
}