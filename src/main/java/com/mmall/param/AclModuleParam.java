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
 * Created by ruhonglin on 2017/11/16.
 */
@Getter
@Setter
@ToString
public class AclModuleParam {

    private Integer id;

    @NotBlank(message = "module name cannot be blank.")
    @Length(min = 2, max = 20, message = "name should be 2-20 digits")
    private String name;

    private Integer parentId = 0;

    @NotNull(message = "seq cannot be null.")
    private Integer seq;

    @NotNull
    @Min(value = 0, message = "invalid status")
    @Max(value = 1, message = "invalid status")
    private Integer status;

    @NotBlank(message = "remark cannot be blank.")
    @Length(min = 2, max = 200, message = "name should be 2-200 digits")
    private String remark;
}
