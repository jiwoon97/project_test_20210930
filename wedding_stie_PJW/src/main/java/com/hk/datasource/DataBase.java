package com.hk.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {
	public DataBase() {
		//OracleDriver.class -->java 컴파일된 파일
				//강제 객체 생성 -->오라클 로딩 실행
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("1단계:드라이버 로딩 성공!");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					System.out.println("1단계:드라이버 로딩 실패");
				}
	}
	public Connection getConnection() throws SQLException {
		//2단계: DB연결
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="jiwoon1";
		String password="jiwoon1";
		return DriverManager.getConnection(url, user, password);		
	}
	
	//6단계: DB닫기-try/catch문 - 함수화하기
	   public void close(ResultSet rs,PreparedStatement psmt, Connection conn) {
	      try {
	         if(rs!=null) {
	            rs.close();            
	         }
	         if(psmt!=null) {
	            psmt.close();            
	         }
	         if(conn!=null) {
	            conn.close();
	         }
	         System.out.println("6단계: DB닫기 성공");
	      } catch (SQLException e) {
	         System.out.println("6단계: DB닫기 실패");
	         e.printStackTrace();
	      }      
	   }
}
