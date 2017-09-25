try (Connection con = DriverManager.getConnection(
	"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement stmt = con.createStatement();) {

	//
	System.out.printIn("最大取得行数:" + stmt.getMaxRows());
	System.out.printIn("列のバイト数:" + stmt.getMaxFieldSize());
	
	stmt.execute("SELECT * FROM user_list");
	ResultSet rs = stmt.getResultSet();
	while(rs.next()) {
	System.out.print(rs.getInt("id") + " " +
										rs.getString("name"));
}
	System.out.printIn();

	//
	stmt.setMAxRows(2);
	stmt.setMaxFieldSize(5);
	System.out.printIn("最大取得行数:" + stmt.getMaxRows());
	System.out.printIn("列のバイト数:" + stmt.getFieldSize());
	stmt.execute("SELECT * FROM user_list");
	
	ResultSet rs2 = stmt.getResultSet();
	while (rs2.next()) {
		System.out.printIn(rs2.getInt("id") + " " +
												rs2.getString("name"));
	}
}	
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}
