package com.qa.projectims.projectIMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectCustomerDao implements ProjectDao<ProjectCustomer> {

	private Connection connection;

	public ProjectCustomerDao() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://35.246.84.97:3306/projectdatabase", "root",
				"nczoedpcw8pGm76J");
	}

	public void create(ProjectCustomer customer) {
		try {
			System.out.println("Creating new customer, please enter your customer name: ");
			String name = ProjectUtils.scanner1.nextLine();
			java.sql.Statement statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO customer(customer_name) VALUES ('" + name + "');");		
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ProjectCustomer> readAll() {
		// TODO Auto-generated method stub
		ArrayList<ProjectCustomer> customers = new ArrayList<ProjectCustomer>();
		try {
			java.sql.Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from customer");
			while (resultSet.next()) {
				Long id = resultSet.getLong("id");
				String name = resultSet.getString("customer_name");
				customers.add(new ProjectCustomer(id, name));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}

	public void update(ProjectCustomer t) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Updating customer name, please enter the customer's name to be updated: ");
			String oldName = ProjectUtils.scanner2.nextLine();
			System.out.println("What do you wish " + oldName + " to be known as: ");
			String newName = ProjectUtils.scanner1.nextLine();
			java.sql.Statement statement = connection.createStatement();
			statement.executeUpdate("UPDATE customer SET customer_name = ('" + newName + "') WHERE customer_name = ('" + oldName + "');");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Deleting customer from database, please enter the customer's ID to be deleted: ");
			int ID = ProjectUtils.scanner1.nextInt();
			java.sql.Statement statement = connection.createStatement();
			statement.executeUpdate("DELETE FROM customer WHERE id = (" + ID +");");
		} catch (SQLException e) {
			e.printStackTrace();
	}
	}
}
