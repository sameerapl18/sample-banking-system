/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem2014fall;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author LinJian
 */
public class DateAndTime {
    
    //a format string for the date and time
    public static final String DATE_FORMAT_NOW = "MMM-dd-yyyy HH:mm:ss";
    public static String dt;
    //get the date and time now
    public static String DateTime()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
        return sdf.format(cal.getTime());
    }
    
    
}
