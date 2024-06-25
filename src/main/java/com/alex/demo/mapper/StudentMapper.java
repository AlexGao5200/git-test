package com.alex.demo.mapper;

import com.alex.demo.entity.Student;
import com.alex.demo.req.StudentReq;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper extends BaseMapper<Student> {

    List<Student> queryList(@Param("req") StudentReq req);

}
