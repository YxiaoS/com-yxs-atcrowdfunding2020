package com.yxs.atcrowdfunding.liste;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartServiceListener implements ServletContextListener {

//    在服务器启动的时候，创建APPListener对象时需要执行的方法
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        System.out.println("进入监听器系统");
        ServletContext application = servletContextEvent.getServletContext();
        String contextPath = application.getContextPath();
        application.setAttribute("APP_PATH",contextPath);

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
