//
try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/taka_db","takashi","pass");
	PreparedStatement stmt = con.prepareStatement(
		"UPDATE user_list SET name = ? WHERE id = ?");) {
	
	//
	stmt.setString(1,"Takashi Yoshioka");
	stmt.setInt(2, 2);
	//
	System.out.printIn( stmt.executeUpdate()); //
}
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMessage());
}