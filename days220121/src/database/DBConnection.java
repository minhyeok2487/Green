package database;

import java.sql.*;

public class DBConnection {
	private Connection con;
	private Statement st;
	private ResultSet rs; // 실행된 결과를 받아오는 객체
	
	public DBConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?zeroDateTimeBehavior=convertToNull", "root", "2487");
			st = con.createStatement();
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 오류 : "+e.getMessage());
		}
	}
	
	public boolean isAdmin() {
		try {
			String SQL = "SELECT * FROM personal";
			rs = st.executeQuery(SQL);
			showTable(rs);
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 검색 오류 : "+e.getMessage());
		}
		return false;
	}
	
	public void showTable(ResultSet rs) {
		try {
			while(rs.next()) {
				String pno = rs.getString("pno");
				System.out.println("pno : "+pno);
				String pname = rs.getString("pname");
				System.out.println("pname : "+pname);
				String job = rs.getString("job");
				System.out.println("job : "+job);
				String manager = rs.getString("manager");
				System.out.println("manager : "+manager);
				String startdate = rs.getString("startdate");
				System.out.println("startdate : "+startdate);
				String pay = rs.getString("pay");
				System.out.println("pay : "+pay);
				String bonus = rs.getString("bonus");
				System.out.println("bonus : "+bonus);
				String dno = rs.getString("dno");
				System.out.println("dno : "+dno);
				System.out.println("---------------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	
	public void addData(int pno, String pname, String job, String manager, String startdate, String pay, String bonus, String dno) {
		String addSQL = "INSERT INTO personal VALUES "+"("+pno+", "+"'"+pname+"'"+", "+"'"+job+"'"+", "+"'"+manager+"'"+", "+"'"+startdate+"'"+", "+"'"+pay+"'"+", "+"'"+bonus+"'"+", "+"'"+dno+"'"+")";
		try {
			st.executeUpdate(addSQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
