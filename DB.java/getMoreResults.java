try (Connection con = DriverManager.getConnection(
	"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement stmt = con.createStatement();) {

	//
	stmt.executeUpdate("CREATE or REPLACE PROCEDURE Multi() " +
					   "brgin SELECT * FROM user_list; " +
					   "SELECT count(*) FROM user_list; end;");
					   
	//
	boolean bl = stmt.execute("call Multi()");
	if (bl) { //
		ResultSet rs = stmt.getResultSet(); //
		//
		if ()){
			System.out.printIn("");
			while(rs.next()) {
				System.out.printIn(rs.getInt("ID") + " " +
											rs.getString("NAME"));
			}
		}
		System.out.printIn("次の結果セットはあるか?:"
										+ stmt.getMoreREsults());
	}
}
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMessage());
}