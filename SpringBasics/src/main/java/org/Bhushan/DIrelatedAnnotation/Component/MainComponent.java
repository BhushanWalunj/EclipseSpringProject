package org.Bhushan.DIrelatedAnnotation.Component;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainComponent {


    public static void main(String[] args)
    {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.springframework.stereotype.Component");
        context.refresh();


        Component123 componentDemo = context.getBean(Component123.class);
        componentDemo.demoFunction();


        context.close();
    }
}
