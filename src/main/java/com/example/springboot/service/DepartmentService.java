package com.example.springboot.service;

import com.example.springboot.controller.vo.Department;
import com.example.springboot.mapper.DepartmentMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@CacheConfig(cacheNames = "department")
@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @CachePut(key = "#department.id")
    public Department save(Department department) {
        System.out.println("保存 id=" + department.getId() + " 的数据");
        this.departmentMapper.insert(department);
        return department;
    }

    @CachePut(key = "#department.id")
    public Department update(Department department) {
        System.out.println("修改 id=" + department.getId() + " 的数据");
        this.departmentMapper.update(department);
        return department;
    }

    @Cacheable(key = "#id")
    public Department getDepartmentById(Integer id) {
        System.out.println("获取 id=" + id + " 的数据");
        Department department = this.departmentMapper.getById(id);
        return department;
    }

    @CacheEvict(key = "#id")
    public void delete(Integer id) {
        System.out.println("删除 id=" + id + " 的数据");
        this.departmentMapper.deleteById(id);
    }

    @Transactional
    public void transaction(){
        Department department = new Department();
        department.setName("事务测试一");
        department.setDescr("事务测试一");
       this.departmentMapper.insert(department);
        int i = 1/0;
        Department department2 = new Department();
        department2.setName("事务测试二");
        department2.setDescr("事务测试二");
        this.departmentMapper.insert(department2);
    }

    public PageInfo<Department> queryAll(){
        Page page = PageHelper.startPage(0, 6);
        List<Department> list= this.departmentMapper.queryAll();
        PageInfo<Department> pageInfo = new PageInfo<Department>(list);
        return pageInfo;
    }
}