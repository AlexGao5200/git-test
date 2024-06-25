package com.alex.demo.service.impl;

import com.alex.demo.entity.Student;
import com.alex.demo.mapper.StudentMapper;
import com.alex.demo.req.StudentReq;
import com.alex.demo.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Override
    public PageInfo<Student> queryList(StudentReq req) {
        PageMethod.startPage(req.getPageNum(), req.getPageSize());
        List<Student> pageList = baseMapper.queryList(req);
        return new PageInfo<>(pageList);
    }
}
