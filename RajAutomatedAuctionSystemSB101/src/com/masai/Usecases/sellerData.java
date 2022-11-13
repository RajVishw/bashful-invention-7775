package com.masai.Usecases;

import java.util.ArrayList;
import java.util.List;

import com.masai.Exception.SellException;
import com.masai.model.Seller;

import Main.Main;
import masai.com.dao.Rimplement;

public class sellerData {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Rimplement r=new Rimplement();
		List<Seller> s=new ArrayList<>();
		try {
			System.out.println("All Data Here");
			s = r.GetAllData();
		
		} catch (SellException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		s.forEach(e-> System.out.println(e)
		);
	}

}
