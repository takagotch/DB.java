try(
	InputStream inputStream = new FileInputStream(new File("db.xml"));){
	Properties configuration = new Properties();
	configuration.loadFromXML(inputStream);
	System.out.println("HOST: " + configuration.getProperty("host", "localhost"));
	System.out.println("loginMsg: " + configuration.getProperty("loginMsg"));
}
catch(IOException e){
  System.out.println("EER;"+e.getMessage());
}



