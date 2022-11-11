package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Exception.SellException;

import masai.com.dao.Rimplement;

public class updateByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your new ProductName");
		String name=s.next();
		
		System.out.println("Enter your sellID");
		int sellID=s.nextInt();
		
		Rimplement rm=new Rimplement();
		try {
			String msg= rm.UpdateName(name, sellID);
			System.out.println(msg);
		} catch (SellException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
