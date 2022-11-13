package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Exception.SellException;

import masai.com.dao.Rimplement;

public class UpdatedTable {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your new price");
	int price=s.nextInt();
	
	System.out.println("Enter your sellID");
	int sellID=s.nextInt();
	
	Rimplement rm=new Rimplement();
	try {
		String msg= rm.priceID(price, sellID);
		System.out.println(msg);
	} catch (SellException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
}
}
