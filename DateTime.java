import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DateTime
{
    public static void main(String args[])
    {
        Date currentDate = new Date();
        LocalTime currentTime = LocalTime.now();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Current Date Format 1: "+formattedDate);
		
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate1 = dateFormat1.format(currentDate);
        System.out.println("Current Date Format 2: "+formattedDate1);
		
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH : mm : ss");
        String formattedTime = timeFormat.format(currentDate);
        System.out.println("Current Time Format 1: "+formattedTime);  
		
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm:ss a");
        String formattedTime1 = currentTime.format(formatter);
        System.out.println("Current Time Format 2: " + formattedTime1);
		
        String greeting = getGreeting(currentTime);
        System.out.println(greeting);
    }
    private static String getGreeting(LocalTime currentTime)
    {
        int hour=currentTime.getHour();
        if(hour>=5 && hour<12)
            return "Good Morning!";
        else if(hour>=12 && hour<16)
            return "Good Afternoon!";
        else if(hour>=16 && hour<21)
            return "Good Evening!";
        else
            return "Good Night!";
    }
    

}