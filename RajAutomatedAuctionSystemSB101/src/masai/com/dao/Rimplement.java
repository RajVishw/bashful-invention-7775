package masai.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.masai.Exception.Registration;
import com.masai.Exception.SellException;
import com.masai.Usecases.InsertProduct;
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
				System.out.println("Enter 2 :Go Back to Sales Screen");
				System.out.println("Enter 3 :Go Back for Home Screen");
				int num=s.nextInt();
				if(num==1) {
					
					try {
						
						InsertProduct n= new InsertProduct();
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

	@Override
	public String SellItems(int sellid, String productname, String productcat, int qn, int price, int rid)
	{
		String msg="Data not Inserted";
		DBConnection con=new DBConnection();
		try(Connection cnn=con.db()){
			PreparedStatement p=cnn.prepareStatement("insert into seller values(?,?,?,?,?,?)");
			p.setInt(1,sellid);
			p.setString(2, productname);
			p.setString(3, productcat);
			p.setInt(4,qn);
			p.setInt(5,price);
			p.setInt(6,rid);
			
			int chk=p.executeUpdate();
			if(chk>0) {
				msg="inserted";
				System.out.println("===========================");
				System.out.println("Inserted");
				System.out.println("===========================");
				System.out.println();
				
				Scanner ts=new Scanner(System.in);
				System.out.println("Enter 2 :For Sales Screen");
				System.out.println("Enter 3 :For Home Screen");
				int num=ts.nextInt();
				
			 if(num==2) {
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
					
				}else{
					System.out.println("Invalid Number");
				}
				
			}
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			msg=e.getMessage();
		}
		return msg;
	}

	@Override
	public String priceID(int price, int con) throws SellException {
		// TODO Auto-generated method stub
		String msg="Not Updated";
		DBConnection c =new DBConnection();
		try(Connection cn=c.db()){
			PreparedStatement p=cn.prepareStatement
					("update seller set price=? where sellid=?");
			p.setInt(1,price);
			p.setInt(2, con);
			
			int chk=p.executeUpdate();
			if(chk>0) {
				msg="Updated";
			}
		} catch (Exception e) {
			// TODO: handle exception
			msg=e.getMessage();
		}
		
		
		
		return msg;
	}

	@Override
	public String QuantityId(int price, int con) throws SellException {
		// TODO Auto-generated method stub
		String msg="Not update";
		DBConnection c =new DBConnection();
		try(Connection cn=c.db()){
			PreparedStatement p=cn.prepareStatement
					("update seller set qn=? where sellid=?");
			p.setInt(1,price);
			p.setInt(2, con);
			
			int chk=p.executeUpdate();
			if(chk>0) {
				msg="Updated";
			}
		} catch (Exception e) {
			// TODO: handle exception
			msg=e.getMessage();
		}
		
		
		
		return msg;
	}

	@Override
	public String UpdateName(String name, int con) throws SellException {
		// TODO Auto-generated method stub
		String msg="Not update";
		DBConnection c =new DBConnection();
		try(Connection cn=c.db()){
			PreparedStatement p=cn.prepareStatement
					("update seller set productname=? where sellid=?");
			p.setString(1,name);
			p.setInt(2, con);
			
			int chk=p.executeUpdate();
			if(chk>0) {
				msg="Updated";
			}
		} catch (Exception e) {
			// TODO: handle exception
			msg=e.getMessage();
		}
		
		
		
		return msg;
	}

	@Override
	public String Deletepro(int id) throws SellException {
		String msg="Not Deleted";
		DBConnection c =new DBConnection();
		try(Connection cn=c.db()){
			PreparedStatement p=cn.prepareStatement
					("delete  from seller  where sellid=?");
			p.setInt(1, id);
			
			int chk=p.executeUpdate();
			if(chk>0) {
				msg="Deleted";
			}
		} catch (Exception e) {
			// TODO: handle exception
			msg=e.getMessage();
		}
		
		
		
		return msg;
	}

}
