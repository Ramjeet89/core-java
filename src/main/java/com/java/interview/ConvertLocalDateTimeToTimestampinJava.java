package com.java.interview;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ConvertLocalDateTimeToTimestampinJava {
    public static void main(String[] args) {
        LocalDateTime current_date_time = LocalDateTime.now();
        System.out.println("Local Date Time : " + current_date_time);

        Timestamp timestamp_object = Timestamp.valueOf(current_date_time);
        System.out.println("Time stamp : " + timestamp_object);
    }
}
