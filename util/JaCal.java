Locale jaJPJP = new Locale("ja", "JP", "JP");

System.out.println(jaJPJP);

DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, jaJPJP);

DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT, jaJPJP);

Date today = new Date();
System.out.println(df.format(today));
System.out.println(df2.format(today));

try{
  System.out.print(df.parse("%S44Y%5M%22D"))
}
catch(ParseException e){
  e.printStackTrace();
}

