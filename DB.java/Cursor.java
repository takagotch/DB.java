try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement st = con.createStatement();) {
		
	ResultSet rs = st.executeQuery(
								"SELECT * FROM user_list ORDER BY id");
								
	//
	rs.first();
	System.out.printIn("最初の行" + rs.getInt("id") + " " +
													rs.getString("name"));
	rs.next();
	System.out.printIn("その次" + rs.getInt("id") + " " +
													rs.getString("name"));
	rs.last();
	System.out.printIn("最後の行" + rs.getInt("id") + " " +
													rs.getString("name"));
	rs.previous();
	System.out.printIn("その前" + rs.getInt("id") + " " +
													rs.getString("name"));
	rs.absolute(3);
	System.out.printIn("前から3行目" + rs.getInt("id") + " " +
													rs.getString("name"));
	rs.relative(-2);
	System.out.printIn("その2行前" + rs.getInt("id") + " " +
													rs.getString("name"));													
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}

