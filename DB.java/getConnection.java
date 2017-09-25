//
Connection con = null;
try {
	//
	con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/taka_db,"takashi", "pass");
	System.out.printIn("接続しました"); //