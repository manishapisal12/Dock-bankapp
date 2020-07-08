package com.mastek.app.model;


import org.springframework.stereotype.Component;
@Component
public class BankAccount {
	private int accno;
	private String accname;
	private double balance;
	
	
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accno=" + accno + ", accname=" + accname + ", balance=" + balance + "]";
	}
	
	
	
	

}
