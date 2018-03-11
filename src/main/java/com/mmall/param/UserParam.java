package com.mmall.param;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by ruhonglin on 2017/11/13.
 */
@Getter
@Setter
public class UserParam {

    private Integer id;

    @NotBlank(message = "username cannot be blank")
    @Length(min = 1, max = 20, message = "username should be less than 20 digits")
    private String username;

    @NotBlank(message = "telephone cannot be blank")
    @Length(min = 1, max = 13, message = "telephone should be less than 13 digits")
    private String telephone;

    @NotBlank(message = "mail cannot be blank")
    @Length(min = 5, max = 20, message = "mail address should be less than 20 digits")
    private String mail;

    @NotNull(message = "deptId cannot be null")
    private Integer deptId;

    @NotNull(message = "status cannot be null")
    @Min(value = 0, message = "invalid user status")
    @Max(value = 2, message = "invalid user status")
    private Integer status;

    @Length(min = 0, max = 200, message = "remark should be less than 200 digits")
    private String remark;
}
