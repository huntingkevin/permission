package com.mmall.util;

import java.util.Date;
import java.util.Random;

/**
 * Created by ruhonglin on 2017/11/13.
 */
public class PasswordUtil {

    public final static String[] word = {
            "a", "b", "c", "d", "e", "f", "g",
            "h", "j", "k", "m", "n", "p", "q",
            "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "A", "B", "C", "D", "E", "F", "G",
            "H", "J", "K", "M", "N",
            "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"
    };

    public final static String[] num = {
            "2", "3", "4", "5", "6", "7", "8", "9"
    };

    public static String randomPassword() {
        StringBuffer sb = new StringBuffer();
        Random random = new Random(new Date().getTime());
        boolean flag = false;
        int length = random.nextInt(3) + 8;
        for (int i = 0; i < length; i++) {
            if (flag) {
                sb.append(num[random.nextInt(num.length)]);
            } else {
                sb.append(word[random.nextInt(word.length)]);
            }
            flag = !flag;
        }

        return sb.toString();
    }
}