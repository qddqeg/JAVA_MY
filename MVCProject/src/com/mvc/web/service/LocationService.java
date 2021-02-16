package com.mvc.web.service;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jdbc.app.entity.Location;
import com.jdbc.app.entity.Notice;

public class LocationService {


	public List<Location> getlocation() {
		String url = "jdbc:mysql://localhost:3306/home_work?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String root = "root";
		String pw = "als15978";
		String driver = "com.mysql.jdbc.Driver";

		String sql = "Select * from location ";
		List<Location> list=new ArrayList<Location>();
		try {

			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
                int id=rs.getInt("ID");
				String locName = rs.getString("locName");
				String regdate = rs.getString("regdate");
				System.out.println(regdate);
				String flag = rs.getString("Flag");
				Location lo= new Location(id,locName,regdate,flag);
				
				list.add(lo);
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return list;
	}
}
