package org.Bhushan.DIrelatedAnnotation.BeanAnn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {


    public static void main(String[] args)
    {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);

        College college = (College) context.getBean( College.class);

        college.test();
    }
}
