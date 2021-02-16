package com.mvc.web.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeService;
@WebServlet("/admin/board/notice/detail")
public class DetailController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		int id= Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		
		NoticeService ns =new NoticeService();
		Notice nt=ns.getNoticeDetail(id);
		 
		 
			req.setAttribute("nt", nt);
			req.getRequestDispatcher("/WEB-INF/view/admin/board/notice/detail.jsp").forward(req,res);

		}
	}

