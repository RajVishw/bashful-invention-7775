package masai.com.dao;

import com.masai.Exception.Registration;

public interface Roperation {

	public String newRegistration(int id, String name, String shopname) 
			throws Registration;
	
	
}
