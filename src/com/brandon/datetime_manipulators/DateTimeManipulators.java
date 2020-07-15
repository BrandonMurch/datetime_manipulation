package com.brandon.datetime_manipulators;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class DateTimeManipulators {
    public static int FindClosestIndex(List<LocalDateTime> list,
                                       LocalDateTime target) {
        Collections.sort(list);
        int start = 0;
        int end = list.size();

        while (start < end) {
            int check = start + ((end - start) / 2);
            LocalDateTime obj = list.get(check);

            if (obj.equals(target)) {
                return check;
            } else if ((start == check - 1 || start == check) && (end == check + 1 || end == check)) {
                return check;
            }

            if (target.compareTo(obj) > 0) {
                start = check;
            } else if (target.compareTo(obj) < 0) {
                end = check;
            }

        }
        return end;
    }
}
