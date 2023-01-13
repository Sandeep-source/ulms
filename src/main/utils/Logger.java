package main.utils;

import java.util.Calendar;

public class Logger {
  public static String getDatetime() {
    Calendar cal = Calendar.getInstance();
    return String.format("%04d-%02d-%02d %02d-%02d-%02d",
            cal.get(Calendar.YEAR),
            cal.get(Calendar.MONTH) + 1,
            cal.get(Calendar.DAY_OF_MONTH),
            cal.get(Calendar.HOUR_OF_DAY),
            cal.get(Calendar.MINUTE),
            cal.get(Calendar.SECOND)
    );
  }
}
