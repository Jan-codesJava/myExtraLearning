package Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTime {
    public static void main(String[] args) {

       /*Display Current Date in Java
        SimpleDateFormat: Parse and Format Dates
        Compare Dates Example

        The year (in either 2 or 4 digits)
The month (in either 2 digits, First 3 letters of the month or the entire word of the month).
The date (it will be the actual date of the month).
The day (the day at the given date – like Sun, Mon, Tue, etc.)

        */

        // Instantiate a Date object by invoking its constructor
     /*   Date objDate = new Date();
        // Display the Date & Time using toString()
        System.out.println(objDate.toString());
    }
}

      */


//Output:

        // Wed Nov 29 06:36:22 UTC 2017


      Date objDate = new Date(); // Current System Date and time is assigned to objDate
        System.out.println(objDate);
        String strDateFormat = "hh:mm:ss a dd-MMM-yyyy"; //Date format is Specified
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
        System.out.println(objSDF.format(objDate)); //Date formatting is applied to the current date
    }
}


/*Output:

        Wed Nov 29 06:31:41 UTC 2017
     10:49:25 PM 15-сен-2021

 */


