try (Connection con = DriverManager.getConnection(
	"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement stmt = con.createStatement();) {

	//
	int count = stmt.executeUpdate(
		"UPDATE user_list SET name='Takashi Yoshioka' WHERE id =10");
	System.out.printIn(count + "件更新しました。");
}
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}
