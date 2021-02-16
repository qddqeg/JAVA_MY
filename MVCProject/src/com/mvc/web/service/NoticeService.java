package com.mvc.web.service;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.jdbc.app.entity.Notice;
import com.jdbc.app.entity.NoticeComment;

public class NoticeService {
	private String url = "jdbc:mysql://13.124.135.97:3306/jdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private String root = "cinema_pm";
	private String pw = "cinema1234";
	private String driver = "com.mysql.jdbc.Driver";
	
	//list 체크
	public int removeNoticeAll(int[] ids) {
		String sql = "delete  from notice where id=?";
		
		int result = 0;
		try {
			System.out.println(sql);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			for(int i = 0 ; i<ids.length; i++) {
				int id = ids[i];
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, id);
			psmt.executeUpdate();
			result++;
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return result;
	}
	//글쓰기
	public int insertNotice(Notice nt) {
		int result = 0;
		String sql="insert into notice(title,writer_id,content,files,pubflag) "
				+ " values(?,?,?,?,?)";
		
		try {
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt =con.prepareStatement(sql);
			psmt.setString(1, nt.getTitle());
			psmt.setString(2, nt.getWriterId());
			psmt.setString(3, nt.getContent());
			psmt.setString(4, nt.getFiles());
			String pub ="N";
			if(nt.getPub()==true) {
				pub ="Y";
			}
			psmt.setString(5,pub );
			result =psmt.executeUpdate();
		
			
			
		} catch (Exception e) {
			e.printStackTrace();

	}
		
		
		return result;
	}
	
	//글수정
//	public int insertNotice(Notice nt) {
//			return 0;
//	}
		
		
		//글쓰기
//	public int insertNotice(Notice nt) {
//			return 0;
//	}
		
	
	//디테일 글삭제 
	public int Remove(int id) {
		 String sql = "delete from notice where id=?";

		 try {	
			 Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, id);
			int id_num=psmt.executeUpdate();
			 System.out.println(id_num);
			 
		 }catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	public List<Notice> getNoticeList(int page,String field, String query) { //글 조회
		int start = 1 + (page - 1) * 10; // 1, 11, 21 ,31, 41
		int end = page * 10; // 10 20 30 40 50

		String sql = "Select *" 
				+ "from (Select @rownum:=@rownum+1 as num , n.*" 
				+ "        from(select *"
				+ "               From notice" 
				+ "           where "+field+" like ?" // %검색어%
				+ "		      order by regdate desc)n"
				+ "        Where (@rownum:=0)=0) num " 
				+ "Where num.num between ? and ? ";

		List<Notice> list = new ArrayList<Notice>();
		System.out.println(sql);
		try {
			System.out.println(sql);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1,"%"+query+"%");
			psmt.setInt(2, start);
			psmt.setInt(3, end);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String writerid = rs.getString("writer_id");
				Date regDate = rs.getDate("regdate");
				String content = rs.getString("content");
				int hit = rs.getInt("hit");
				String files = rs.getString("files");
				String pubflag=rs.getString("pubflag");
				boolean pub = false;
				if(pubflag.equals("Y")) {
					pub =true;
				}

				Notice nt = new Notice(id, title, writerid, content, regDate, hit, files,pub);

				list.add(nt);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return list;
		
	}
	
	public List<Notice> getPubNoticeList(int page, String field, String query) {
		int start = 1 + (page - 1) * 10; // 1, 11, 21 ,31, 41
		int end = page * 10; // 10 20 30 40 50

		String sql = "Select *" 
				+ "from (Select @rownum:=@rownum+1 as num , n.*" 
				+ "        from(select *"
				+ "               From notice" 
				+ "           where pubflag= 'Y'"
				+ "             and "+field+" like ?" // %검색어%
				+ "		      order by regdate desc)n"
				+ "        Where (@rownum:=0)=0) num " 
				+ "Where num.num between ? and ? ";

		List<Notice> list = new ArrayList<Notice>();
		System.out.println(sql);
		try {
			System.out.println(sql);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1,"%"+query+"%");
			psmt.setInt(2, start);
			psmt.setInt(3, end);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String writerid = rs.getString("writer_id");
				Date regDate = rs.getDate("regdate");
				String content = rs.getString("content");
				int hit = rs.getInt("hit");
				String files = rs.getString("files");
				String pubflag=rs.getString("pubflag");
				boolean pub = false;
				if(pubflag.equals("Y")) {
					pub =true;
				}

				Notice nt = new Notice(id, title, writerid, content, regDate, hit, files,pub);

				list.add(nt);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return list;
	}
	
	public int getNoticeCount(String field, String query) { 
		int count = 0;

		String sql =  "Select count(num.id) as count " 
				 + "    from (Select @rownum:=@rownum+1 as num , n.*" 
				 + "        from(select *"
				 + "               From notice"
				 + "			  where "+field+" like ?"  // %검색어% 
				 + "		      order by regdate desc)n"
				 + "        Where (@rownum:=0)=0) num " ;
			
			

		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1,"%"+query+"%");
			ResultSet rs = psmt.executeQuery();
			
			if (rs.next()) {
				count = rs.getInt("count");
				System.out.println("count"+count);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return count;
	}

	public Notice getNoticeDetail(int id) {
		String sql = "Select * from notice where id=?";
		Notice nt =null;
		
		try {
			System.out.println(sql);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, id);
			System.out.println(id);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				id = rs.getInt("id");
				String title = rs.getString("title");
				String writerid = rs.getString("writer_id");
				Date regDate = rs.getTimestamp("regdate");
				String content = rs.getString("content");
				int hit = rs.getInt("hit");
				String files = rs.getString("files");
				String pubflag=rs.getString("pubflag");
				boolean pub = false;
				if(pubflag.equals("Y")) {
					pub =true;
				}

				nt = new Notice(id, title, writerid, content, regDate, hit, files,pub);

				
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return nt;
	
		
	}

	public int deletNoticeAll(int[] ids) {
		int result = 0;
		String params="";
		
		for(int i =0; i<ids.length; i++) {
			params +=ids[i];
			if(i<ids.length-1) {
				params +=",";
			}
		}
			String sql = "delete from notice where id in("+params+")";
			
			try {
				
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, root, pw);
				Statement st =con.createStatement();
				result =st.executeUpdate(sql);
			
				
				
			} catch (Exception e) {
				e.printStackTrace();

		}
		
		return result;
	}
	public void countNoticeHit(int id) {
		String sql="update notice set hit=(hit+1) where id = ?";
		
		try {
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt =con.prepareStatement(sql);
			psmt.setInt(1,id);
			psmt.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
	}
	
	}
	
	public int insertNoticeComment(NoticeComment nc) {
		int result = 0;
		String sql = "insert into comment(mid,writer,comment) values(?,?,?)";
		
		try {
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt =con.prepareStatement(sql);
			psmt.setInt(1,nc.getMid());
			psmt.setString(2,nc.getWriterId());
			psmt.setString(3,nc.getComment());
			result=psmt.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
	}
		
		return result;
		
	}
	public List<NoticeComment> getCommentList(int pid) {
		String sql ="select * from comment where mid=? order by regdate desc ";
		
		List<NoticeComment> list = new ArrayList<NoticeComment>();
		System.out.println(sql);
		try {
			System.out.println(sql);
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setInt(1, pid);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				int mid = rs.getInt("mid");
				String writerid = rs.getString("writer");
				Date regDate = rs.getDate("regdate");
				String comment = rs.getString("comment");
			

				NoticeComment nc = new NoticeComment(id,mid,writerid,comment ,regDate);

				list.add(nc);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return list;

	}
	public int getNoticeCount(int id) {
		
		return 0;
	}
	public int getNoticeCommentCount(int id) {
		int count = 0;
		String sql = "select count(id) as count from comment where mid =?";
		
try {
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, root, pw);
			PreparedStatement psmt =con.prepareStatement(sql);
			psmt.setInt(1,id);
			ResultSet rs = psmt.executeQuery();
		
			if(rs.next())
				count =rs.getInt("count");
		} catch (Exception e) {
			e.printStackTrace();
	}
		return count;
	}
}
