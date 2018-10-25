package com.example.springboot;

import com.example.springboot.cglib.CglibProxyIntercepter;
import com.example.springboot.cglib.PersonService;
import com.example.springboot.service.DepartmentService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.asm.ClassWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@EnableCaching
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringbootApplication.class, args);

        //反射
//        DepartmentService departmentService = new DepartmentService();
//        Class<? extends DepartmentService> aClass = departmentService.getClass();   //得到类信息
//        Field[] declaredFields = aClass.getDeclaredFields();        //得到类的所有自定义变量
//        Field[] fields = aClass.getFields();
//        for (Field field : declaredFields) {
//            String key = field.getName();
//            PropertyDescriptor descriptor = new PropertyDescriptor(key, aClass);   //得到变量的信息（包括getter/setter）
//            Method method = descriptor.getReadMethod();                //拿到getter
//            Object value = method.invoke(departmentService);          //调用getter，拿到变量的值
//
//            System.out.println(key + ":" + value);
//        }
        //cglib
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        enhancer.setCallback(new CglibProxyIntercepter());
        PersonService proxy= (PersonService)  enhancer.create();
        proxy.setPerson();
//        proxy.getPerson("1");

//        ClassWriter cw = new ClassWriter(0);
//        enhancer.generateClass(cw);
//        byte[] klass = cw.toByteArray();
//        FileOutputStream fileOutputStream = new FileOutputStream(proxy.getClass().getName()+".class");
//        fileOutputStream.write(klass);
//        fileOutputStream.close();

    }
}
