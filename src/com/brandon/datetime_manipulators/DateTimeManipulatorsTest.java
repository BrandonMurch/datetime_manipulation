package com.brandon.datetime_manipulators;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeManipulatorsTest {

    @Test
    void findClosestIndexTest() {
        List<LocalDateTime> list = new ArrayList<>();
        for (int i = 16; i < 24; i++) {
            LocalDateTime dateTime = LocalDateTime.parse("2020-10-11T" + i + ":00:00.00",
                    DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            list.add(dateTime);
        }
        LocalDateTime target = LocalDateTime.parse("2020-10-11T19:30:00.00",
                DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        int index = DateTimeManipulators.FindClosestIndex(list,
                target);
        assertEquals(3, index);
    }

}