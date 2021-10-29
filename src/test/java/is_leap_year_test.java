import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class is_leap_year_test {
    @Test
    public void is_Leap_Year_Correct() {
        assertTrue(is_leap_year(2000));
        assertFalse(is_leap_year(1700));
        assertFalse(is_leap_year(1800));
        assertFalse(is_leap_year(1900));
        assertFalse(is_leap_year(2100));
    }

    @Test
    public void is_divisible_by_four_and_not_hundred(){
         assertTrue(is_leap_year(2024) && ((2024 % 4 == 0) && (2024 % 100 != 0)));
    }

    @Test
    public void is_divisible_by_fourhundred() {
        assertTrue(is_leap_year(2000) && (2000 % 400 == 0));
    }

    @Test
    public void not_divisible_by_four() {
        assertFalse(is_leap_year(1800) && (1800 != 4));

    }

    @Test
    public void divisible_by_100_and_not_by_400() {
        assertFalse(is_leap_year(1800) && (((1800) % 100 == 0) && (1800 % 400 != 0)));
    }

    public boolean is_leap_year(int year) {
        return new LeapYear().isLeapYear(year);
    }

}