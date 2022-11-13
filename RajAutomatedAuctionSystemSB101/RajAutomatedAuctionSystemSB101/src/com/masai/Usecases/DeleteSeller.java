package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Exception.SellException;

import masai.com.dao.Rimplement;

public class DeleteSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your productID Which you want to delete");
		int id=s.nextInt();
	
		Rimplement rm=new Rimplement();
		try {
			String msg= rm.Deletepro(id);
			System.out.println(msg);
		} catch (SellException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
