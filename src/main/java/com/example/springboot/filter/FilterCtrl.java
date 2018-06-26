package com.example.springboot.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

public class FilterCtrl implements Filter {
//    LoggerFactory.getLogger(this.Class)；
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("===初始化过滤器===");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest,servletResponse);
        logger.info("filter耗时："+(System.currentTimeMillis()-start));
    }

    @Override
    public void destroy() {
//        logger.info("===销毁过滤器===");
        System.out.println("===销毁过滤器===");
    }
}
