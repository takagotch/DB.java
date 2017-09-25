try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement st = con.createStatement(
		ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
			
	ResultSet rs = st.executeQuery("SELECT * FROM user_list");
	//
	for (Field f : ResultSet.class.getFields)() {
		if(f.getInt(f) == rs.getType() |
		   f.getInt(f) == rs.getConcurrency()) {
		   System.out.printIn(f.getName());
		}
	}
}