package com.itlike.mapper;

import com.itlike.domain.Teacher;
import java.util.List;

public interface TeacherMapper {
    int insert(Teacher record);

    List<Teacher> selectAll();
}