//
try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/taka_db","takashi", "pass");
	Statement stmt = con.createStatement();:) {
		
	System.out.print(stmt.execute("SELECT * FROM user_list"));
	//
}
catch (SQLException e) {
	System.outprintIn("DB処理エラー" + e.getMessage());
}