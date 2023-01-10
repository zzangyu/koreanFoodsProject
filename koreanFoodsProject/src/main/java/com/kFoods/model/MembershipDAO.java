package com.kFoods.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.naming.*;

public class MembershipDAO {
	
	private static MembershipDAO instance = null;

	public MembershipDAO() {}

	public static MembershipDAO getInstance() {
		
		if(instance == null) {
			synchronized (MembershipDAO.class) {
				instance = new MembershipDAO();
			}
		}
		return instance;
		
	}
	
	private Connection getConnection() {
		
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			DataSource ds = (DataSource)initContext.lookup("java:/comp/env/jdbc/myoracle");
			conn = ds.getConnection();
		} catch (NamingException e) {
			System.out.println("Naming Connection ERROR");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Connection ERROR");
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public void saveAccount(String id, String pw1,String pw2, String email, String nick) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {			
			conn = getConnection();
			pstmt = conn.prepareStatement("insert into Membership (kfoods_id, kfoods_pw1, kfoods_pw2, kfoods_email, kfoods_nick) values (?, ?, ?, ?, ?)");
			pstmt.setString(1, id);
			pstmt.setString(2, pw1);
			pstmt.setString(3, pw2);
			pstmt.setString(4, email);
			pstmt.setString(5, nick);
			pstmt.executeUpdate();
			
		} catch (SQLException s1) {
			s1.printStackTrace();
		} finally {
			if(rs!=null) try {rs.close();} catch (SQLException s1) { }
			if(pstmt!=null) try {pstmt.close();} catch (SQLException s2) { }
			if(conn!=null) try {conn.close();} catch (SQLException s3) { }
		}
	} // 회원가입
	
	public int idCheck(String id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int check = 0;
		
		try {			
			
			conn = getConnection();
			String strQuery = "select kfoods_id from Membership where kfoods_id = ?";
			
			pstmt = conn.prepareStatement(strQuery);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				check = 1;
			}
			
		} catch (Exception s1) {
			s1.printStackTrace();
		} finally {
			if(rs != null) try{ rs.close(); }catch(SQLException s1){}
			if(pstmt!=null) try {pstmt.close();} catch (SQLException s2) { }
			if(conn!=null) try {conn.close();} catch (SQLException s3) { }
		}
		
		return check;
	} // 아이디 중복 확인
	
	public int emailCheck(String email) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int check = 0;
		
		try {			
			
			conn = getConnection();
			String strQuery = "select kfoods_email from Membership where kfoods_email = ?";
			
			pstmt = conn.prepareStatement(strQuery);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				check = 1;
			}
			
		} catch (Exception s1) {
			s1.printStackTrace();
		} finally {
			if(rs != null) try{ rs.close(); }catch(SQLException s1){}
			if(pstmt!=null) try {pstmt.close();} catch (SQLException s2) { }
			if(conn!=null) try {conn.close();} catch (SQLException s3) { }
		}
		
		return check;
	} // 이메일 중복 확인
	
	public int nickCheck(String nick) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int check = 0;
		
		try {			
			
			conn = getConnection();
			String strQuery = "select kfoods_nick from Membership where kfoods_nick = ?";
			
			pstmt = conn.prepareStatement(strQuery);
			pstmt.setString(1, nick);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				check = 1;
			}
			
		} catch (Exception s1) {
			s1.printStackTrace();
		} finally {
			if(rs != null) try{ rs.close(); }catch(SQLException s1){}
			if(pstmt!=null) try {pstmt.close();} catch (SQLException s2) { }
			if(conn!=null) try {conn.close();} catch (SQLException s3) { }
		}
		
		return check;
	} // 닉네임 중복 확인
	
}
