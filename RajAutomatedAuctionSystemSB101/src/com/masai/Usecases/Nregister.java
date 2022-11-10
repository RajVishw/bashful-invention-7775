package com.masai.Usecases;

import java.util.Scanner;

import com.masai.Exception.Registration;
import com.masai.model.register;

import masai.com.dao.Rimplement;

public class Nregister {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		
		System.out.println("Generate your id");
		int id=s.nextInt();
		
		System.out.println("Enter your name");
		String name=s.next();
		
		System.out.println("Enter your Sname");
		String shopname=s.next();
		
		//register r=new register(id,name,shopname);
		
		Rimplement cll=new Rimplement();
		String msg;
		try {
			 msg=cll.newRegistration(id, name, shopname);
			System.out.println(msg);
		} catch (Registration e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			e.printStackTrace();
			
		}
		
		
		
		
		
		
	

	}

}
