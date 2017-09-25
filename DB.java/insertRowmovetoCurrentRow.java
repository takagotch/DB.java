try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement st = con.createStatement(
		ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
			
	ResultSet rs = st.executeQuery(
		"SELECT id, name FROM user_list ORDER BY id");
		rs.moveTOInsertRow(); //
		rs.updateInt(1, 10); rs.updateString(2, "Takashi Yoshioka");
		rs.insertRow();
		rs.moveToCurrentRow(); //
		rs.next();
		System.outprintIn(rs.getString("id")); //
		