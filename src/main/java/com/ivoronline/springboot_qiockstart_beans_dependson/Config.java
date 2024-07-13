package com.ivoronline.springboot_qiockstart_beans_dependson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class Config {

  //=======================================================================
  // BEAN 1
  //=======================================================================
  @Bean("bean1")
  @DependsOn("bean2")
  public String createBean1() {
    System.out.println("Bean1");
    return "Hello from Bean1";
  }

  //=======================================================================
  // BEAN 2
  //=======================================================================
  @Bean("bean2")
  //@DependsOn("bean1")
  public String createBean2() {
    System.out.println("Bean2");
    return "Hello from Bean2";
  }

}
