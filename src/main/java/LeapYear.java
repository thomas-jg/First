public class LeapYear {
    public boolean isLeapYear(int year) {
        return ((year % 5 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}
