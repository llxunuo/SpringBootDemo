package com.example.springboot.service; 

import com.example.springboot.controller.vo.Department;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageImpl;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/** 
* DepartmentService Tester. 
* 
* @author <Authors name> 
* @since <pre>07/19/2018</pre> 
* @version 1.0 
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentServiceTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: save(Department department) 
* 
*/ 
@Test
public void testSave() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: update(Department department) 
* 
*/ 
@Test
public void testUpdate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: getDepartmentById(Integer id) 
* 
*/ 
@Test
public void testGetDepartmentById() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(Integer id) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: transaction() 
* 
*/ 
@Test
public void testTransaction() throws Exception { 
//TODO: Test goes here... 
} 

@Autowired
private DepartmentService departmentService;

/** 
* 
* Method: queryAll() 
* 
*/ 
@Test
public void testQueryAll() throws Exception {
    PageInfo<Department> list = departmentService.queryAll();
}


} 
