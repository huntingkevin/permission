package com.mmall.util;

import com.google.common.base.Splitter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ruhonglin on 2017/11/23.
 */
public class StringUtil {

    public static List<Integer> splitToListInt(String str) {
        List<String> strList = Splitter.on(",").trimResults().omitEmptyStrings().splitToList(str);
        List<Integer> list = strList.stream().map(strItem -> Integer.parseInt(strItem)).collect(Collectors.toList());
        return list;
    }
}
