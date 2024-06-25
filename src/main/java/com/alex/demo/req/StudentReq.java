package com.alex.demo.req;

import lombok.Data;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@Data
public class StudentReq {

    @Min(value = 1,message = "pageNum不合法")
    @NotNull(message = "pageNum不能为空")
    private Integer pageNum = 1;

    @NotNull(message = "pageSize不能为空")
    private Integer pageSize = 10;
}
