package com.mmall.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by ruhonglin on 2017/11/6.
 */
public class LevelUtil {

    public final static String SAPERATOR = ".";

    public final static String ROOT = "0";

    public static String calculateLevel(String parentLevel, int parentId) {
        if (StringUtils.isBlank(parentLevel)) {
            return ROOT;
        } else {
            return StringUtils.join(parentLevel, SAPERATOR, parentId);
        }

    }
}
