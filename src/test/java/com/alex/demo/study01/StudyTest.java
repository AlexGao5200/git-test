package com.alex.demo.study01;

import com.alex.demo.controller.StudentController;
import com.alex.demo.entity.Student;
import com.alex.demo.req.StudentReq;
import com.alex.demo.service.IStudentService;
import com.github.pagehelper.PageInfo;
import net.minidev.json.JSONArray;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudyTest {
    @Autowired
    private IStudentService studentService;

    @Test
    public void queryListTest() {
        StudentReq studentReq = new StudentReq();
        studentReq.setPageNum(1);
        studentReq.setPageSize(10);
        PageInfo<Student> pageInfo = studentService.queryList(studentReq);
        System.out.println(JSONArray.toJSONString(pageInfo.getList()));
        Assert.assertEquals(5, pageInfo.getList().size());
    }

}
