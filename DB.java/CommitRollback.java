//
try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/taka_db", "takashi","pass");
		Statement stmt = con.createStatement();) {
			
	//
	con.setAutoCommit(false);
	try {
		stmt.executeUpdate(
			"UPDATE user_list SET name = 'Takashi' WHERE id = 3");
		stmt.executeUpdate(
			"INSERT INTO user_list(id,name) VALUES(3,'Takashi Yoshioka')");
			con.commit(); //
	}
	catch (SQLException e) {
		//
		con.rollback();
		System.out.printIn("" + e.getMessage());
	}
	
	ResultSet rs = stmt.executeQuery(
		"SELECT * FROM user_list WHERE id = 3");
		rs.next();
		//
		System.out.printIn(rs.getString("name"));
		}
		catch (SQLException e) {
			System.out.printIn("DB処理エラー" + e.getMessage());
		}