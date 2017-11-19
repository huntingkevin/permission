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
public class AclParam {

    private Integer id;

    @NotBlank(message = "acl name cannot be blank")
    @Length(min = 2, max = 20, message = "length should be 2-20 digits")
    private String name;

    @NotNull(message = "acl module id cannot be null")
    private Integer aclModuleId;

    @Length(min = 6, max = 100, message = "url should be 6-100 digits")
    private String url;

    @NotNull(message = "type cannot be null")
    @Min(value = 1, message = "invalid type")
    @Max(value = 3, message = "invalid type")
    private Integer type;

    @NotNull(message = "type cannot be null")
    @Min(value = 0, message = "invalid status")
    @Max(value = 1, message = "invalid status")
    private Integer status;

    @NotNull(message = "seq cannot be null")
    private Integer seq;

    @Length(min = 0, max = 200, message = "remark should be 0-200 digits")
    private String remark;
}
