try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	PreparedStatement pst = con.prepareStatement(
		"SELECT * FROM user_list WHERE (id < ?) AND (name LIKE ?)");
																	) {
	//
	pst.setInt(1, 3);
	pst.setString(2, "R%");
	
	//
	ResultSet rs = pst.executeQuery();
	
	while (rs.next()) {
		System.outprintIn(rs.getInt("id") + " " +
												rs.getString("name"));
	}
}
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}
