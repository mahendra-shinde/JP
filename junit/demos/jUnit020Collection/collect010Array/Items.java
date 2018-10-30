package com.jUnit020Collection.collect010Array;

import java.util.ArrayList;

public class Items {
	private Integer[] items = {100, 109, 107, 111, 102, 108, 103, 101};
	
	public void setItemList(Integer[] items){
		this.items = items;
	}
	
	public Integer[] getItemList(){
		return items;
	}
	
	public Integer[] getItemsInRange(Integer fromValue, Integer toValue){
		ArrayList<Integer> filterCollection = new ArrayList<>();
		
		for(Integer val : items){
			if (val>=fromValue && val<= toValue){
				filterCollection.add(val);
			}
		}
		Integer[] filterArray = new Integer[filterCollection.size()];
		return filterCollection.toArray(filterArray);
	}
}
