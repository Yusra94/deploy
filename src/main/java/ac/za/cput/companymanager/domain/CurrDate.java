package ac.za.cput.companymanager.domain;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrDate {

    String currentDate;

    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date date = new Date();

    public String getDate(){
        currentDate = dateFormat.format(date);
        return currentDate;
    }
}
