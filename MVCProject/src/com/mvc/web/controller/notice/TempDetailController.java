package com.mvc.web.controller.notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Temp;
import com.mvc.web.service.TempService;

@WebServlet("/Tempdetail")
public class TempDetailController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       String writer=req.getParameter("writer");
        TempService ts= new TempService();
        List<Temp> tp=ts.getTempeDetail(writer);
        req.setAttribute("list", tp);
        req.getRequestDispatcher("WEB-INF/view/notice/TempDetail.jsp").forward(req, res);
	}
}
