package com.km.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware , BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("## I'm in the life cycleBean Constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## the lifeCycleBean has its property Set ");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## the lifeCycleBean has been terminated  ");

    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## My Bean Name is  "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#Bean Factory has been set   ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#Application Context has been set   ");
    }
    @PostConstruct
    public void postConstructor(){
        System.out.println("## The Post Construct annotated method has been called");
    }

    @PreDestroy
    public void preDestory(){
        System.out.println("## The Predestroy annotated method has been called");
    }
    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
