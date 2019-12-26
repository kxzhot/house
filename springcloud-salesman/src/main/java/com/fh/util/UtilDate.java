package com.fh.util;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UtilDate {

    public static final String Y_M_D="yyyy-MM-dd";

    public static final String FULL_YEAR = "yyyy-MM-dd HH:mm:ss ";

    public static final String date2Str(Date date,String pattern){
        if (date==null){
            return "";
        }
        SimpleDateFormat sim = new SimpleDateFormat(pattern);
        String dateStr = sim.format(date);
        return dateStr;
    }

    public static Date str2Date(String date,String pattern){
        if (StringUtils.isEmpty(date)){
            return null;
        }
        SimpleDateFormat sim = new SimpleDateFormat(pattern);
        Date currDate = null;
        try {
            currDate = sim.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return currDate;
    }
}
