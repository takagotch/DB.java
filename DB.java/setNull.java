try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement st = con.createStatement();
	PreparedStatement pst = con.prepareStatement(
	
		//
		"INSERT INTO user_list ( id, name ) VALUES (" +
		"(SELECT max_id + 1 FROM (" +
		"SELECT MAX(id) AS max_id FROM user_list ) AS t ),?)");) {
		
	pst.setNull(1, java.sql.Types.VACHAR); //
	System.out.printf("レコードの追加: %d\n", pst.executeUpdate());
}
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}
