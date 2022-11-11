package masai.com.dao;

import com.masai.Exception.Registration;
import com.masai.Exception.SellException;

public interface Roperation {

	public String newRegistration(int id, String name, String shopname) 
			throws Registration;
	
	public String SellItems(int sellid,String  productname,String productcat,int qn,int price,int rid) 
			throws SellException;
	
	public String priceID(int price, int con) throws SellException;
	
	public String QuantityId(int price, int con) throws SellException;
	
	public String UpdateName(String name, int con) throws SellException;
	
	public String Deletepro(int id) throws SellException;
	
	
}
