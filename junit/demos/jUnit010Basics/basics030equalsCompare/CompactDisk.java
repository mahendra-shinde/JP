package com.jUnit010Basics.basics030equalsCompare;

public class CompactDisk {
	private int diskId;
	private String diskTitle;
	private float diskPrice;
	
	public CompactDisk(int diskId, String diskTitle, float diskPrice) {
		super();
		this.diskId = diskId;
		this.diskTitle = diskTitle;
		this.diskPrice = diskPrice;
	}
	
	@Override
	public boolean equals(Object obj){
		if (isRefSame(this, obj))
			return true;
		
		if (isRefNull(obj))
			return false;
		
		if (!isInstanceSameClass(this, obj))
			return false;
		
		if (!isObjectSame(this, obj)){
			return false;
		}
		
		return true;
	}
	
	private boolean isRefSame(Object obj1, Object obj2){
		return (obj1 == obj2);
	}
	
	private boolean isRefNull(Object obj){
		return (obj == null);
	}
	
	private boolean isInstanceSameClass(Object obj1, Object obj2){
		return obj1.getClass() == obj2.getClass();
	}
	
	private boolean isObjectSame(Object obj1, Object obj2){
		CompactDisk cd1 = (CompactDisk)obj1;
		CompactDisk cd2 = (CompactDisk)obj2;
		
		return cd1.diskId == cd2.diskId;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompactDisk other = (CompactDisk) obj;
		if (diskId != other.diskId)
			return false;
		return true;
	}
	*/
	
}
