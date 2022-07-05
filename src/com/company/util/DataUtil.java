package com.company.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataUtil {

    public static String formatarData(LocalDateTime data) {
        if (data == null) {
            return "";
        }
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm:ss"));
    }

}
