package com.example.springboot.mapper;

import com.example.springboot.controller.vo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface DepartmentMapper {
    public void insert(Department department);

    public Department getById(Integer id);

    public void update(Department department);

    public void deleteById(Integer id);
}
