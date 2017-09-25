ResultSet rs = st.executeQuery(
	"SELECT CURRENT_TIMESTAMP(), CURRENT_TIME"); //
rs.next();
//
System.out.print(rs.getDate(1)); //
System.out.print(rs.getTime(2)); //
System.out.print(rs.getTimestamp(1)); //
