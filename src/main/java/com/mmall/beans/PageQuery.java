package com.mmall.beans;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;

/**
 * Created by ruhonglin on 2017/11/15.
 */

public class PageQuery {

    @Getter
    @Setter
    @Min(value = 1, message = "invalid page no.")
    private int pageNo = 1;

    @Getter
    @Setter
    @Min(value = 1, message = "invalid page size.")
    private int pageSize = 10;

    @Setter
    private int offset;

    public int getOffset() {
        return (pageNo - 1) * pageSize;
    }
}
