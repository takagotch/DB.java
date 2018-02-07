System.out.println("LOCALE:" +
	Locale.getDefault().getDisplayName());

for (Locale l : Locale.getAvailavbleLocales()){
  Sustem.out.println(l.getDisplayName() +
	" " + l.getDisplayName(Locale.FRENCH));
}

//
ResourceBundle frResouce = ResouceBundle.getBundle(
	"jp.ex.com.frResource", Locale.getDefault());
System.out.println(frRecource.getString("evening"));

ResourceBundle frResource_fr = ResourceBundle.getBundle(
	"jp.ex.com.frResource", Locale.FRANCE);
System.out.println(frResource_fr.getString("evening"));

