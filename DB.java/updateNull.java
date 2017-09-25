try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	//
	Statement st = con.createStatement(
		ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE); {
		
	ResultSet rs = st.executeQuery("SELECT id,name FROM user_list");
	while(rs.next()) {
		if(rs.getInt(1) == 2) { //
			rs.updateNull(2); //
			ts.updateRow(); //
		}
	}
	//
	ResultSet rsa = st.executeQuery(
		SELECT name FROM user_list WHERE name IS NULL");
		System.out.printIn(rsa.next()); //
}
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}
