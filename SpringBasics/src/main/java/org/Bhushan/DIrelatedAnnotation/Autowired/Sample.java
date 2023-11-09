package org.Bhushan.DIrelatedAnnotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

interface Vehicle
{
   public void start();

}
@Component
class car implements Vehicle
{
   @Override
   public void start(){
      System.out.println("Car travels");
   }
}
@Component
class bike implements Vehicle
{
   @Override
   public void start(){
      System.out.println("Bike Travels");
   }
}
class Driver
{
   @Autowired
   @Qualifier("bike")
    Vehicle v;

   @Bean
   public void service(){
      v.start();
   }
}
public class Sample {
   public static void main(String[] args) {
      ApplicationContext app= new AnnotationConfigApplicationContext(Driver.class);
      Driver d = app.getBean(Driver.class);
      d.service();

   }
   }
