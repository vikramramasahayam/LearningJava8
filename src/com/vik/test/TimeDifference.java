package com.vik.test;

import java.util.Calendar;
import java.util.Date;

public class TimeDifference {

    public static void main(String[] args) {
        // "startTime": "2015-12-04T09:33:39.453Z",
        // "endTime": "2015-12-04T09:33:43.875Z",
        Calendar cal = Calendar.getInstance();
        cal.set(2015, 12, 04, 33, 39, 453);

        long startTime = Date.UTC(2015, 12, 04, 33, 39, 453);
        long endTime = Date.UTC(2015, 12, 04, 33, 43, 875);

        System.out.println(endTime - startTime);

    }

}
