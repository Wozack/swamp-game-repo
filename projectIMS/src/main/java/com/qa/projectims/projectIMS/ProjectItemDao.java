package com.qa.projectims.projectIMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProjectItemDao implements ProjectDao<ProjectItem> {

	private Connection connection;

	public ProjectItemDao() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://35.246.84.97:3306/projectdatabase", "root",
				"nczoedpcw8pGm76J");
	}

	public void create(ProjectItem t) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Creating new item, please enter item name: ");
			String itemName = ProjectUtils.scanner1.nextLine();
			System.out.println("Enter item price: ");
			String itemPrice = ProjectUtils.scanner2.nextLine();
			java.sql.Statement statement = connection.createStatement();
			statement.executeUpdate(
					"INSERT INTO item (item_name, item_price) VALUES ('" + itemName + "', '" + itemPrice + "');");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ProjectItem> readAll() {
		// TODO Auto-generated method stub
		ArrayList<ProjectItem> items = new ArrayList<ProjectItem>();
		try {
			java.sql.Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from item");
			while (resultSet.next()) {
				Long id = resultSet.getLong("id");
				String name = resultSet.getString("item_name");
				Double price = resultSet.getDouble("item_price");
				items.add(new ProjectItem(id, name, price));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return items;
	}

	public void update(ProjectItem t) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Updating item price, please enter the item ID to be updated: ");
			String itemId = ProjectUtils.scanner2.nextLine();
			System.out.println("What is the updated price of item ID " + itemId + ": ");
			String newPrice = ProjectUtils.scanner1.nextLine();
			java.sql.Statement statement = connection.createStatement();
			statement.executeUpdate("UPDATE item SET item_price = ('" + newPrice + "') WHERE id = ('" + itemId + "');");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Deleting item from database, please enter the item ID to be deleted: ");
			int ID = ProjectUtils.scanner1.nextInt();
			java.sql.Statement statement = connection.createStatement();
			statement.executeUpdate("DELETE FROM item WHERE id = (" + ID + ");");
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
}
