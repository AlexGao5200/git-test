package com.alex.demo.controller;

import com.alex.demo.common.Result;
import com.alex.demo.entity.Student;
import com.alex.demo.req.StudentReq;
import com.alex.demo.service.IStudentService;
import com.github.pagehelper.PageInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/api/service/student")
@RequiredArgsConstructor
public class StudentController{

    private final IStudentService StudentService;

    @PostMapping("/queryList")
    public Result<PageInfo<Student>> queryList(@RequestBody @Valid StudentReq req) {
        return Result.success(StudentService.queryList(req));
    }

}
