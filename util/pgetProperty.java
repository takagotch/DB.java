//DBName=testdb
try(
	InputStram inputStream = new FileInputStream(new File("db.properties"));){
	Properties configuration = new Properties();
	configuration.load(inputStream);
	System.out.println("host:" + configuration.getProperty("host", "localhost"));
	System.out.println("db:" + configuration.getProperty("DBName"));
} catch(IOException e){
	  System.out.println("EER;"+e.getMessage());
}

