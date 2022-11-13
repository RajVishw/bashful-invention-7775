package com.masai.Usecases;

import java.sql.Connection;

import com.masai.util.DBConnection;

public class connectCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnection d=new DBConnection();
		Connection chk=  d.db();
		if(chk !=null) {
			System.out.println("connected");
		}
	}

}
