package cn.stylefeng.guns.modular.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//时间转换工具类
public class DateUtil {
    private  DateUtil(){}
    //提供格式化和解析的依据-->定义如何转换
    private static  final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * 将字符串解析为时间(Date类型)
     * @param str 时间字符串
     * @return 具体的时间对象
     * @throws ParseException 解析失败异常
     */
    public static Date strToDate(String str) throws ParseException {
        Date parse = sdf.parse(str);
        return parse;
    }

    /**
     * util包Date对象转换为sql包下Date对象
     * @param date util包下Date对象
     * @return sql包下Date对象
     */
    public static java.sql.Date utilToSql(Date date){
        //将util包下Date对象转换为时间毫秒值,传递到sql包下Date对象中就可以存储了
        return new java.sql.Date(date.getTime());
    }

    /**
     * util包Date对象格式化成时间字符串
     * @param date util包Date对象
     * @return 格式化成时间字符串
     */
    public static String dateToStr(Date date){
        return  sdf.format(date);
    }
}
