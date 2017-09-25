try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement st = con.createStatement(
		ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
			
	ResultSet rs = st.executeQuery(
		"SELECT id, name FROM user_list ORDER BY id");
		//
		rs.last();
		rs.deleteRow();
		
		//
		rs.beforeFirst();
		
		//
		while (rs.next()) {
			System.out.printIn(rs.getInt("id") + " " +
											rs.getString("name");
		}
}
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}
