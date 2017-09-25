try (Connection con = DriverManager.getConnection(
	"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement stmt = con.createStatement();) {

	//
	stmt.addBatch(
	"INSERT INTO user_list(id,name) VALUES (5, 'Takashi Yoshioka')");
	stmt.addBatch(
	"UPDATE user_list SET name='Takashi Yoshioka' WHERE id =5");
	
	//
	int[] ret = stmt.executeBatch();
	for (int i : ret) {
		System.out.printf("", i);
	}
	
	System.out.printIn("\n実行後");
	ResultSet after = stmt.executeQuery(
								"SELECT * FROM user_list ORDER BY id");
	while (after.next()) {
		System.out.printf("%s %s%n", after.getString("id"),
							after.getString("name").toString());
	}
}
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}
