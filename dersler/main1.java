package dersler;

import javax.naming.ldap.ManageReferralControl;
import javax.net.ssl.ManagerFactoryParameters;

public class main1 {

	public static void main(String[] args) {
    
		/*Emloyee employee = new Emloyee("mustafa murat","bili�im",3000);
		employee.showInfos();*/
		Manager manager = new Manager("mustafa murat co�kun","bili�im",4000);
		manager.showInfos();
		
		
	}

}
