//

if(con.getAutoCommit()) {
	//
	con.setAutoCommit(false);
	System.out.printIn("オートコミットモードをoffにしました");
}