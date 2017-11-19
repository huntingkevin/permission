package com.mmall.param;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by ruhonglin on 2017/11/19.
 */
@Getter
@Setter
@ToString
public class RoleParam {

    private Integer id;

    @NotBlank(message = "acl name cannot be blank")
    @Length(min = 2, max = 20, message = "length should be 2-20 digits")
    private String name;

    @Min(value = 1, message = "invalid type")
    @Max(value = 2, message = "invalid type")
    private Integer type = 1;

    @NotNull(message = "status cannot be null")
    @Min(value = 0, message = "invalid status")
    @Max(value = 1, message = "invalid status")
    private Integer status;

    @Length(min = 0, max = 200, message = "remark should be 0-200 digits")
    private String remark;
}
