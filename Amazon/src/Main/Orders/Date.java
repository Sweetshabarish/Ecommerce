package Main.Orders;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Date {
    public ArrayList<Object> Date(){
        Calendar cal = Calendar.getInstance();
        String Date= String.valueOf(java.time.LocalDate.now());
        SimpleDateFormat simpleDateFormatObject = new SimpleDateFormat("yyyy-MM-dd");
        try{
            cal.setTime(simpleDateFormatObject.parse(Date));
        }catch(ParseException e){
            e.printStackTrace();
        }
        cal.add(Calendar.DAY_OF_MONTH,3);
        String DelveryDate=simpleDateFormatObject.format(cal.getTime());

        ArrayList<Object> dateObject=new ArrayList<>();
        dateObject.add(Date);
        dateObject.add(DelveryDate);

            return dateObject;
    }

}
