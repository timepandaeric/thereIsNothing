package com.panda.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>日期转换</p>
 *
 * @author WuZhongLiang
 * @date : 2021-01-17 19:05
 **/
public class DateUtil {
    public static void main(String[] args) {

        System.out.println(DateUtil.getWeekOfYear("2021-01-17"));
    }

    /**
     * 计算给定日期在当年的第几周
     * @param date 给定的时间
     * @return 给定日期在当年的第几周
     */
    public static String getWeekOfYear(String date)  {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date time = null;
        try {
            if (date != null) {
                time = sdf.parse(date);
            }
            Calendar calendar = Calendar.getInstance();

            // 设置周一为一周的第一天
            calendar.setFirstDayOfWeek(Calendar.MONDAY);
            calendar.setTime(time);
            return calendar.get(Calendar.YEAR) + "年" + "第" + calendar.get(Calendar.WEEK_OF_YEAR) + "周";
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
