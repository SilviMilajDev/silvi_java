package Seminari2.DateFormatChanger;

public class Main
{

    private static int month;
    private static int day;
    private static int year;

    private static String date;

    public static void main(String[] args)
    {
        setDate("2/3/2010");
        setMonth();
        setDay();
        setYear();
        System.out.println(getDate());
    }

    private static void setDate(String d) {
        date = d;
    }

    private static String getDate() {
        return getDay() + " " + getMonth() + " " + getYear();
    }

    private static void setMonth() {
        month = Integer.parseInt(
                date.substring(0, date.indexOf('/'))
        );
    }

    private static String getMonth() {
        String month_names[] = {
            "January", "February", "March", "April", "May", "July",
            "June", "August", "September", "October", "November", "December"
        };

        return month_names[month - 1];
    }

    private static void setDay() {
        day = Integer.parseInt(
                date.substring(date.indexOf('/')+1, indexOfSecondSlash())
        );
    }

    private static int getDay() {
        return day;
    }

    private static void setYear() {
        year = Integer.parseInt(
                date.substring(indexOfSecondSlash()+1, date.length())
        );
    }

    private static int getYear() {
        return year;
    }

    private static int indexOfSecondSlash() {
        return date.indexOf('/', date.indexOf('/') + 1);
    }

}
