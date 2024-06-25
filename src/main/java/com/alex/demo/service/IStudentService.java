package com.alex.demo.service;

import com.alex.demo.entity.Student;
import com.alex.demo.req.StudentReq;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;

public interface IStudentService extends IService<Student> {

    PageInfo<Student> queryList(StudentReq Req);

}
