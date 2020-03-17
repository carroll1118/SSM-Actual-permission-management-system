package com.itlike.service.impl;

import com.itlike.domain.Teacher;
import com.itlike.mapper.TeacherMapper;
import com.itlike.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    /*注入mapper*/
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public void save(String name) {
        /*调用mapper*/
        System.out.println("来到了服务层");
        Teacher teacher = new Teacher();
        teacher.setTeacherName(name);
        teacherMapper.insert(teacher);
    }
}
