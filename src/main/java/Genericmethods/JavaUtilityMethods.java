package Genericmethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtilityMethods {
public int getRandomNumber() {
	Random r= new Random();
	return r.nextInt();
	
}
public Date GetDate() {
	
	Date da= new Date();
	return da;
}

public String GetFormattedDateDDMMYY() {
	Date da= new Date();
	SimpleDateFormat s= new SimpleDateFormat("dd/mm/yy");
   return s.format(da);
	
}

public String GetFormattedDayDateDayMMYY() {
	Date da= new Date();
	
	String[] date=   da.toString().split(" ");
	
	return date[0]+" "+date[2]+"_"+date[1]+"_"+date[5];
	
}




}
