package masai.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.masai.Exception.Registration;
import com.masai.Usecases.Nregister;
import com.masai.util.DBConnection;

import Main.Main;

public class Rimplement implements Roperation {

	@Override
	public String newRegistration(int id, String name, String shopname) throws Registration {
		// TODO Auto-generated method stub
		String msg="Successful";
		DBConnection cn=new DBConnection();
		try(Connection cnn=cn.db()){
			PreparedStatement p=cnn.prepareStatement("insert into register values(?,?,?)");
			p.setInt(1, id);
			p.setString(2,name);
			p.setString(3, shopname);
			
			int chk=p.executeUpdate();
			if(chk>0) {
				System.out.println("==============================");
				System.out.println(" Registration successful");
				System.out.println("This is Your RegistrationID-"+id);
				System.out.println("==============================");
				Scanner s=new Scanner(System.in);
				
				System.out.println("Enter 1 :Add new Item in the list ");
				System.out.println("Enter 2 :Update Item price, quantity, etc.");
				System.out.println("Enter 3 :Remove items from the list");
				int num=s.nextInt();
				if(num==1) {
					
					try {
						//Add new Item in the list
						Nregister n=new Nregister();
						n.main(null);
					} catch (Exception e2) {
						// TODO: handle exception
						e2.getMessage();
					}
					
				}else if(num==2) {
					try {
						//Update Item price, quantity, etc
						Main m=new Main();
						m.saleScreen();
					} catch (Exception e2) {
						// TODO: handle exception
						e2.getMessage();
					}
					
				}
				else if(num==3) {
					try {
						//Enter 3 :Remove items from the list
						Main m=new Main();
						m.homeScreen();
					} catch (Exception e2) {
						// TODO: handle exception
						e2.getMessage();
					}
					
				}
				
				
				else {
					System.out.println("Invalid Number");
				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			msg=e.getMessage();
			
			System.out.println(msg);
			System.out.println("======================");
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter 1 :For Registration ");
			System.out.println("Enter 2 :For Sales Screen");
			System.out.println("Enter 3 :For Home Screen");
			int num=s.nextInt();
			if(num==1) {
				
				try {
					Nregister n=new Nregister();
					n.main(null);
				} catch (Exception e2) {
					// TODO: handle exception
					e2.getMessage();
				}
				
			}else if(num==2) {
				try {
					Main m=new Main();
					m.saleScreen();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.getMessage();
				}
				
			}
			else if(num==3) {
				try {
					Main m=new Main();
					m.homeScreen();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.getMessage();
				}
				
			}
			
			
			else {
				System.out.println("Invalid Number");
			}
			
		}
		
		
		
		return msg;
			}

}
