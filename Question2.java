package task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question2 {

	public static void main(String[] args) {

		// Sourrounded with try catch

		try {

			// Connection class is used to connect the sql and path is given

			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_details", "root",
					"test");

			// Statement class is implemented

			Statement input = connect.createStatement();

			// Inserting the table details

			input.execute(
					"INSERT INTO details (empcode, empname, empage, esalary) VALUES ('101', 'Jenny', '25', '10000');");

			input.execute(
					"INSERT INTO details (empcode, empname, empage, esalary) VALUES ('102', 'Jacky', '30', '20000');");

			input.execute(
					"INSERT INTO details (empcode, empname, empage, esalary) VALUES ('103', 'Joe', '20', '40000');");

			input.execute(
					"INSERT INTO details (empcode, empname, empage, esalary) VALUES ('104', 'John', '40', '80000');");

			input.execute(
					"INSERT INTO details (empcode, empname, empage, esalary) VALUES ('105', 'Shammer', '25', '90000');");

			// using Resultset class executing the result grid
			ResultSet result = input.executeQuery("select * from details");

			// to check wheather statement is completed

			System.out.println("Statement completed");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
