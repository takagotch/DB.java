try (Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass");
	Statement st = con.createStatement();
	PreparedStatement pst = con.prepareStatement(
	
		//
		Calendar cal = Calendar.getInstance();
		pst.setDate(1, new Date(cal.getTimeInMillis()), cal);
		System.out.printf("レコード更新(setDate): %d \n,
												pst.executeUpdate());
		ResultSet rs = st.executeQuery("SELECT * FROM user_list");
		while(rs.next()){
			System.out.printIn(rs.getInt("id") + " " +
												rs.getString("gdate"));
}
		//
		cal.add(Calendar.DATE, -5);
		//
		pst.setTimestamp(1, new Timestamp(cal.getTimeInMills()), cal);
		System.out.printf("レコード更新(setTimestamp): %d\n",
													pst.executeUpdate());

		rs = st.executeQuery("SELECT * FROM user_list")
		while(rs.next()){
			System.out.printf(rs.getInt("id") + " " +
												rs.getString("gdate"));
		}
}												
catch (SQLException e) {
	System.out.printIn("DB処理エラー" + e.getMEssage());
}
