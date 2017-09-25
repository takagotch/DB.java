//
stmt.executeUpdate(
	"CREATE or REPLACE PROCEDURE OUTPARAMNAME " +
	"(IN mid INT, OUT vname TEXT)" +
	"SELECT name INTO vname FROM user_list WHERE id=mid; end;");
	
//
CallableStatement cs = con.prepareCall("{call OUTPARAMNAME(?,?)}");
//
cs.setInt(1,3);
//
cs.registerOutParameter(2, java.sql.Types.VARCHAR);
cs.execute();

//
String out = cs.getString(2);
System.out.printIn(out); //