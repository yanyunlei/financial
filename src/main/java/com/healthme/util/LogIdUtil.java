package com.healthme.util;

import org.apache.commons.lang.StringUtils;

import java.util.Random;
import java.util.UUID;

/**
 * @author root
 */
public class LogIdUtil {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();

    public static String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
            "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
            "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z" };

    public static String getLogId(){
        String logId = threadLocal.get();

        if (StringUtils.isBlank(logId)){
            logId = setLogIdByFilter(null);
        }

        return logId;
    }

    public static String setLogIdByFilter(String user){
        String logId = getRandomStr(user);
        threadLocal.set(logId);
        return logId;
    }

    private static String getRandomStr(String user){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++){
            stringBuilder.append(chars[random.nextInt(chars.length)]);
        }
        stringBuilder.append(System.currentTimeMillis());

        if (StringUtils.isNotBlank(user)){
            stringBuilder.append("|");
            stringBuilder.append(user);
        }

        return stringBuilder.toString();
    }

    public static void remove(){
        threadLocal.remove();
    }
}
