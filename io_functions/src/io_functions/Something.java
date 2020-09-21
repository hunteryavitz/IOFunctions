package io_functions;

import java.util.Date;

public class Something {

	private int i;
	private String str;
	private Date date;
	public Something(int i, String str, Date date) {
		setI(i);
		setStr(str);
		setDate(date);
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
