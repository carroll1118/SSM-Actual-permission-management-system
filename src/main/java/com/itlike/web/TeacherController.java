package com.itlike.web;

import com.itlike.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeacherController {
    /*注入服务层*/
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/teacher")
    public String teacher(String name){
        System.out.println(name);
        //调用服务层
        teacherService.save(name);
        return "success";
    }
}
