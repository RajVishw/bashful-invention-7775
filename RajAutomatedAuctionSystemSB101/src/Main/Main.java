package Main;

import java.sql.SQLException;
import java.util.Scanner;

import com.masai.Usecases.InsertProduct;
import com.masai.Usecases.Nregister;
import com.masai.Usecases.connectCheck;

public class Main {
	public static int homeScreen() {
		Scanner s=new Scanner(System.in);
		System.out.println("===== Welcome to Automated Auction System =====");
		System.out.println("Who are you?");
		System.out.println("ENTER 1:SELLER");
		System.out.println("ENTER 2:BUYER");
		System.out.println("ENTER 3:ADMINISTRATOR");
		int condition=s.nextInt();
		
		return condition;
	}
	public static int saleScreen() {
		Scanner s=new Scanner(System.in);
		System.out.println("===== Welcome to Sale =====");
		System.out.println("ENTER 1: Register himself or herself as seller");
		System.out.println("ENTER 2: Add new Item in the list");
		System.out.println("ENTER 3: Update Item price, quantity, etc. ");
		System.out.println("ENTER 4: Remove items from the list");
		System.out.println("ENTER 5: View the sold Item history.");
		int scon=s.nextInt();
		
		return scon;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int condition=homeScreen();
		
		switch(condition) {
		case 1:{
			int scon=saleScreen();
			switch(scon){
			case 1:
				System.out.println("=====Welcome to Seller Registration Page=====");
				try {
					Nregister p=new Nregister();
					p.main(args);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				
				break;
			
			case 2:
				try {
					InsertProduct p=new InsertProduct();
					p.main(args);
					
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}
				break;
			
			case 3:
				
				break;
			
			
			case 4:
				
				break;
			
			case 5:
				
				break;
			
				
			default:
				System.out.println("Invalid Number");
				
			}
			break;
		}
		case 2:{
			
			break;
		}
		
		case 3:{
			
			break;
		}
		default:{
			 System.out.println("Invalid Data");
		}
		
		}
		
		
		
		
		
		

	}

}
