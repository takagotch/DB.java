try (Connection con = DriverManager.getConnection(
	"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement stmt = con.createStatement();) {
		
	//
	ResultSet rs1 = stmt.executeQuery("SELECT * FROM user_list");
	while (rs1.next()) {
		System.out.printIn(rs1.getInt("id") + " " +
											rs1.getString("name"));
	}
}
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMessage());
}