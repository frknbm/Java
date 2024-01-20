package dersler;

import javax.naming.ldap.ManageReferralControl;
import javax.net.ssl.ManagerFactoryParameters;

public class main1 {

	public static void main(String[] args) {
    
		/*Emloyee employee = new Emloyee("mustafa murat","biliþim",3000);
		employee.showInfos();*/
		Manager manager = new Manager("mustafa murat coþkun","biliþim",4000);
		manager.showInfos();
		
		
	}

}
