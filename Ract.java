package com.Nishu;

public class Ract {
	
	public int len;
	public  int bredth;
	
	public int getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}

	public int getBredth() {
		return bredth;
	}

	public void setBredth(int bredth) {
		this.bredth = bredth;
	}

	public void perimeter(int l, int b) {
		this.len=l;
		this.bredth=b;
		int result=2*(len + bredth);
		System.out.println(result);
	}
}
