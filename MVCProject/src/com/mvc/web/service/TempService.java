package com.mvc.web.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jdbc.app.entity.Notice;
import com.jdbc.app.entity.Temp;

public class TempService {
private	String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
private	String root = "root";
private	String pw = "als15978";
private	String driver = "com.mysql.jdbc.Driver";
	public List<Temp> getTemp(){
		

		String sql = "Select * from temp ";
		List<Temp> list = new ArrayList<Temp>();
		try {

			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				String date=rs.getString("date");
				int temp=rs.getInt("temp");
				int locID=rs.getInt("locID");
				String writer =rs.getString("writer");
				Temp tp= new Temp(date,temp,locID,writer);
				list.add(tp);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		return list;
	}
	
	public List<Temp> getTempeDetail( String writer) {
		String sql = "Select * from temp where writer=? and locID = 1";
		List<Temp> list = new ArrayList<Temp>();
		
		
		try {
			System.out.println(sql);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, writer);
			//System.out.println(writer);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				String date=rs.getString("date");
				int temp=rs.getInt("temp");
				int locID=rs.getInt("locID");
				
				
				Temp tp= new Temp(date,temp,locID,writer);
				list.add(tp);

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return list;
	
		
	}
}
