package helpers;

import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalculator {
    public static @NotNull String getTodayDate() {
        String pattern = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date;
        date = simpleDateFormat.format(new Date());
        return date;
    }
}
