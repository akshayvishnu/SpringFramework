package com.spring.bean_life_cycle;
import java.sql.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {

	private String driver;
	private String url;
	private String username;
	private String password;
	private String query; 
	private String deleteQuery;
	Connection con;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("Setting driver....");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("Setting url....");
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		System.out.println("Setting username....");
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("Setting password....");
		this.password = password;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getDeleteQuery() {
		return deleteQuery;
	}

	public void setDeleteQuery(String deleteQuery) {
		this.deleteQuery = deleteQuery;
	}
	
	/*public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}*/
	
	//@PostConstruct
	public void init() throws ClassNotFoundException, SQLException
	{
		createStudentDBConnection();
	}
	
	
	public void createStudentDBConnection() throws ClassNotFoundException, SQLException
	{
		System.out.println("Creating the DB connection");
		Class.forName(driver);
		con = DriverManager.getConnection(url, username, password);
	}

	public void selectStudents() throws ClassNotFoundException, SQLException
	{
		System.out.println("Selecting the list of students in hostel");
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			int studentId = rs.getInt(1);
			String studentName = rs.getString(2);
			int hostelFee = rs.getInt(3);
			String foodType = rs.getString(4);
			
			System.out.println(studentId+" "+studentName+" "+hostelFee+" "+foodType);
		}
	}
	
	public void deleteStudentRecord(int studentId) throws SQLException, ClassNotFoundException
	{
		System.out.println("Deleting a student record");
		Statement st=con.createStatement();
		int deletedRows = st.executeUpdate(deleteQuery+studentId+";");
	}
	
	
	public void closeConnection() throws SQLException
	{
		System.out.println("Destroying the bean inside the container");
		con.close();
	}
	
	//@PreDestroy
	public void destroy() throws SQLException
	{
		closeConnection();
	}

}
