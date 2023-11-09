package org.Bhushan.DIrelatedAnnotation.BeanAnn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class CollegeConfig {
    @Bean
    public College colconfig(){
        return new College();
    }
    @Bean
    @Primary
    public College colconfig2(){
        return new College();
    }
}
