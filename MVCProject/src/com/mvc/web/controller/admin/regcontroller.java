package com.mvc.web.controller.admin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.jdbc.app.entity.Notice;
import com.mvc.web.service.NoticeService;
@MultipartConfig(
		//location="/tmp", //어디에 저장될 건지 
		fileSizeThreshold = 1024*1024, //어느정도 용량이 커지면 디스크를 사용해라 ex1000byt*1000byt =1메가
		maxFileSize = 1024*1024*5,//최대 업로드 가능용량 
		maxRequestSize = 1024*1024*5*5// 전체요청에 대한 파일 용량 
		)
@WebServlet("/admin/board/notice/reg")
public class regcontroller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	req.getRequestDispatcher("/WEB-INF/view/admin/board/notice/reg.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String open=req.getParameter("open");
		boolean pub = Boolean.parseBoolean(open);
		
		
		
		Collection<Part> parts=req.getParts();
		StringBuilder builder = new StringBuilder();
		
		for(Part p : parts) {
			if(!p.getName().equals("file")) continue;
			if(p.getSize()==0) {
				continue;
			}
			Part filePart = p;
			
			String fileName =p.getSubmittedFileName();
			
			builder.append(fileName);
			builder.append(",");
		
		InputStream fis = p.getInputStream();
		
		
		String realPath = req.getServletContext().getRealPath("/upload");//어디다 파일이 저장될건지 직접 지정해주는것 
		System.out.println("realPath : "+realPath);
		
		String filePath = realPath +File.separator+ fileName;
		
		File fl = new File(realPath);
		if(!fl.exists())
			fl.mkdirs();
		
		FileOutputStream fos= new FileOutputStream(filePath);
		
		
		
		byte[] buf = new byte[1024];
		int size=0;
		
		
		while((size=fis.read(buf))!=-1)//-1 더이상 옮길께 없을때 까지
			fos.write(buf,0,size);
		
		fos.close();
		fis.close();
		}
		
		builder.delete(builder.length()-1,builder.length());
		
		System.out.println("builder :"+builder);
		int result = 0;
		Notice nt =new Notice();
		
		nt.setTitle(title);
		nt.setContent(content);
		nt.setWriterId("김민형");
		nt.setFiles(builder.toString());
		nt.setPub(pub);
		
		NoticeService ns =new NoticeService();
		result =ns.insertNotice(nt);
		resp.setContentType("text/html;charset=UTF-8");
		resp.sendRedirect("list");
		//PrintWriter out = resp.getWriter();
		//out.printf("title:"+title);
		//out.printf("content:"+content);
		//out.printf("open:"+open);
	}
}
