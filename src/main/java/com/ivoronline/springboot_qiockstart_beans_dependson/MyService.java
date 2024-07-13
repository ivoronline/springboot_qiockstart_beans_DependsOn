package com.ivoronline.springboot_qiockstart_beans_dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("bean2")
public class MyService {

  //=======================================================================
  // CONSTRUCTOR
  //=======================================================================
  public MyService() {
    System.out.println("MyService");
  }
  
}
