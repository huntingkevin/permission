package com.mmall.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by ruhonglin on 2017/11/6.
 */
@Getter
@Setter
@ToString
public class DeptParam {

    private Integer id;

    @NotBlank(message = "dept name cannot be blank")
    @Length(max = 15, min = 2, message = "dep name should be 2-15 digits")
    private String name;

    private Integer parentId = 0;

    @NotNull(message = "sequence cannot be null")
    private Integer seq;

    @Length(max = 150, message = "remark cannot be longer than 150 digits")
    private String remark;

}
