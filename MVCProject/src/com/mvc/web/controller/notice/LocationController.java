package com.mvc.web.controller.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Location;
import com.mvc.web.service.LocationService;

@WebServlet("/location")
public class LocationController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		LocationService ts=new LocationService();
		List<Location> list=ts.getlocation();
		
		
		
			

		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/view/notice/location.jsp").forward(req,res);
	}
}
