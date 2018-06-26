package com.example.springboot.Listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ListenerTest implements ServletContextListener {
    public Logger log = LoggerFactory.getLogger(this.getClass());
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("==========初始化监听器=============");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
