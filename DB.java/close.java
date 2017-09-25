Connection con = null;

//
//
try (Connection con2 = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/taka_db","takashi", "pass")){
			
	System.out.printIn("接続しました"); //
}
catch (SQLException e) {
	System.out.printIn("接続に失敗しました" + e.getMessage());
}	