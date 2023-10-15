package movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class kannada_movie {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspider","root","root");
		Statement s=c.createStatement();
      //  s.execute("create database jspider");
	//	s.execute("create table mock_details(id int,name varchar(10),"
		//		+ "java_mock_rating Int(20),sql_mock_rating int(10),web_mock_rating int(10))");
		boolean flag=true;
		while(flag)
		{
			System.err.println("1.add student\n2.update java_mock\n3.update sql mock\n4.fetch the student by id\n5.fetch all the student\n6.remove the student by id\n7.exit\n select other option");
			switch(sc.nextInt())
			{
			case 1:
			{
				PreparedStatement pt=c.prepareStatement("insert into mock_details values(?,?,?,?,?)");
				System.out.println("enter the id");
				pt.setInt(1, sc.nextInt());
				System.out.println("enter the name");
				pt.setString(2, sc.next());
				System.out.println("enter the java mock rating");
				pt.setInt(3, sc.nextInt());
				System.out.println("enter the sql mock rating");
				pt.setInt(4, sc.nextInt());
				System.out.println("enter the web mock rating");
				pt.setInt(5, sc.nextInt());
				pt.executeUpdate();
			}
			break;
			case 2:
			{
				PreparedStatement pt=c.prepareStatement("update mock_details set java_mock_rating=? where id=?");
				System.out.println("enter the new java mock rating");
				pt.setString(1, sc.next());
				System.out.println("enter the id");
				pt.setInt(2, sc.nextInt());
				pt.executeUpdate();
				System.out.println("done");
			}
			break;
			case 3:
			{
				PreparedStatement pt=c.prepareStatement("update mock_details set sql_mock_rating=? where id=?");
				System.out.println("enter the new sql mock rating");
				pt.setString(1, sc.next());
				System.out.println("enter the id");
				pt.setInt(2, sc.nextInt());
				pt.executeUpdate();
				System.out.println("done");
			}
			break;
			case 4:
			{
				PreparedStatement pt=c.prepareStatement("select * from mock_details where id=?");
				System.out.println("enter the id");
				pt.setInt(1, sc.nextInt());
				ResultSet r=pt.executeQuery();
				r.next();
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3)+" "+r.getInt(4)+" "+r.getInt(5));
			}
			break;
			case 5:
			{
				PreparedStatement pt=c.prepareStatement("select * from mock_details ");
				System.out.println("mock details table");
				ResultSet rs =pt.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
				}
				
			}break;
			
			case 6:
			{
				PreparedStatement pt = c.prepareStatement("delete from mock_details where id=?");
				System.out.println("enter the id that to be deleted");
				pt.setInt(1, sc.nextInt());
				pt.executeUpdate();
				
			}break;
			case 7:
			{
				flag=false;
				System.out.println("Thank you");
			}
			break;
			default:
			{
				System.out.println("invalid ption");
			}
		}
		}
        c.close();
	}

}
