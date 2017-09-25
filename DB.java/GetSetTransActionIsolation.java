try (Connection con = DriverManager.getConnection(
	"jdbc:mysql://localhost:8080/taka_db,"takashi", "pass")) {
		
	//
	int l = con.getTransactionIsolation();
	
	//
	System.out.printIn(l == Connection.TRANSACTION_READ_COMMITED);
	System.out.printIn(l == Connection.TRANSACTION_READ_UNCOMMITED);
	System.out.printIn(l == Connection.TRANSACTION_REPEATABLE_READ);
	System.out.printIn(l == Connection.TRANSACTION_SERIALIABLE);
}
catch (Exception e) {
	System.out.printIn("DB処理エラー" + e.getMessage());
}