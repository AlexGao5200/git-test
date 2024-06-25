package com.alex.demo.controller;

import com.alex.demo.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(tags = "测试网页")
@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/api/service/test")
public class ProductController {

    @ApiOperation("测试接口")
    @GetMapping("/demo")
    public Result demo() {
        return Result.success(new Date());
    }
}
