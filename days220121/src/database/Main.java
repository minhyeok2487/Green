package database;

public class Main {

	public static void main(String[] args) {
		DBConnection connection = new DBConnection();
		System.out.println(connection.isAdmin());
		
		int pno = 9999;
		String pname = "Hyeok";
		String job = "manager";
		String manager = "2222";
		String startdate = "2022-02-22";
		String pay = "1000";
		String bonus = "50";
		String dno = "10";
		connection.addData(pno,pname,job,manager,startdate,pay,bonus,dno);
	}

}
