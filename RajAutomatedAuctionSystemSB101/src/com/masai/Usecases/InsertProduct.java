package com.masai.Usecases;

import java.util.Scanner;

import masai.com.dao.Rimplement;

public class InsertProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your ProductId");
		int pid=s.nextInt();
		
		System.out.println("Enter your Product Name");
		String nm=s.next();
		
		System.out.println("Enter your Product Category");
		String cat=s.next();
		
		System.out.println("Enter your Product Quantity");
		int q=s.nextInt();
		
		System.out.println("Enter your Price");
		int price=s.nextInt();
		
		System.out.println("Enter your RegistrationID");
		int Rid=s.nextInt();
		
		Rimplement msg =new Rimplement();
		String val=msg.SellItems(pid,nm,cat,q,price,Rid);
		System.out.println(val);
	
		
		
		
		

	}

}
