package Seminari2.DateFormatChanger;

class FormatDate
{
    private String date;

    private int month;
    private int day;
    private int year;

    FormatDate(String date) {
        this.date = date;
        setMonth();
        setDay();
        setYear();
    }

    public String toString() {
        return getDay() + " " + getMonth() + " " + getYear();
    }

    private void setMonth() {
        month = Integer.parseInt(
                date.substring(0, date.indexOf('/'))
        );
    }

    private String getMonth() {
        String month_names[] = {
                "January", "February", "March", "April", "May", "July",
                "June", "August", "September", "October", "November", "December"
        };

        return month_names[month - 1];
    }

    private void setDay() {
        day = Integer.parseInt(
                date.substring(date.indexOf('/')+1, indexOfSecondSlash())
        );
    }

    private int getDay() {
        return day;
    }

    private void setYear() {
        year = Integer.parseInt(
                date.substring(indexOfSecondSlash()+1, date.length())
        );
    }

    private int getYear() {
        return year;
    }

    private int indexOfSecondSlash() {
        return date.indexOf('/', date.indexOf('/') + 1);
    }

}
