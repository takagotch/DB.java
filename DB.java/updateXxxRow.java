try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	//
	Statement st = con.createStatement(
		ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE); {
	
	//
	ResultSet rs = st.executeQuery("SELECT id,name FROM user_list");
	
	while(rs.next()) {
		String name = rs.getString("name");
		//
		rs.updateString("name", name.toUpperCase());
		//
		rs.updateRow();
	}
	
	//
	ResultSet rsa = st.executeQuery("SELECT * FROM user_list");
	while(rsa.next()) {
		System.out.printIn(rsa.getString("id") + " " +
												rsa.getString("name"));
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}
