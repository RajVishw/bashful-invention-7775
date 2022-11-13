package Main;

import java.sql.SQLException;
import java.util.Scanner;

import com.masai.Usecases.DeleteSeller;
import com.masai.Usecases.InsertProduct;
import com.masai.Usecases.Nregister;
import com.masai.Usecases.UpdateQuantity;
import com.masai.Usecases.UpdatedTable;
import com.masai.Usecases.connectCheck;
import com.masai.Usecases.sellerData;
import com.masai.Usecases.updateByName;
import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;

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
		System.out.println("ENTER 5: View All the Seller Products");
		int scon=s.nextInt();
		
		return scon;
	}
	
	public static void updateBy() {
		Scanner s=new Scanner(System.in);
		System.out.println("===== Welcome to Sale =====");
		System.out.println("ENTER 1: Update Name Using ID");
		System.out.println("ENTER 2: Update Quantity Using ID");
		System.out.println("ENTER 3: Update Price Using ID ");
		System.out.println("ENTER 4: Home Screen");
		int scon=s.nextInt();
		
		Updateby(scon);
	}
	public static void Updateby( int con) {
		//int num=updateBy();
		
		switch(con) {
		case 1:
			updateByName up=new updateByName();
			up.main(null);
			break;
		case 2:
			UpdateQuantity q=new UpdateQuantity();
			q.main(null);
			break;
			
		case 3:
			UpdatedTable price=new UpdatedTable();
			price.main(null);
			break;
			
		case 4:
			homeScreen();
			break;
			
			default:
				System.out.println("Invalid Number");
				break;
		}
		
	
	
		
		
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
				updateBy();
				break;
			case 4:
				DeleteSeller d=new DeleteSeller();
				d.main(args);
				
				
				break;
			
			case 5:
				try {
					sellerData dt=new sellerData();
					dt.main(null);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
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
