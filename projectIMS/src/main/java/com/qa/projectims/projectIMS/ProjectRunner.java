package com.qa.projectims.projectIMS;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.log4j.Logger;

public class ProjectRunner {

	public static final Logger LOGGER = Logger.getLogger(ProjectRunner.class);

	public static void main(String[] args) throws SQLException {
//	
//	ProjectCustomerDao dao = new ProjectCustomerDao();
//	ArrayList<ProjectCustomer> customers = dao.readAll();
//	for (ProjectCustomer customer : customers) {
//		System.out.println(customer.getId()+" "+customer.getName());
//		}
// 
//	ProjectCustomerDao dao2 = new ProjectCustomerDao();
//	dao2.create(null);
//	
//	
//	ProjectCustomerDao dao3 = new ProjectCustomerDao();
//	dao3.delete(0);

//	ProjectCustomerDao dao4 = new ProjectCustomerDao();
//	dao4.update(null);

// ============================================================================================================ITEMS
//		ProjectItemDao dao5 = new ProjectItemDao();
//		dao5.create(null);
//	}

	ProjectItemDao dao6 = new ProjectItemDao();
	ArrayList<ProjectItem> items = dao6.readAll();for(
	ProjectItem item : items)
	{
		System.out.println(item.getId() + " " + item.getName() + " " + item.getPrice());
	}

//	ProjectItemDao dao3 = new ProjectItemDao();
//    dao3.update(null);
//	
	
//		ProjectItemDao dao3 = new ProjectItemDao();
//		dao3.delete(0);
	
	
	}

}










