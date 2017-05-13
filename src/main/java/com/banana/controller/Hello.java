package com.banana.controller;

import com.banana.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Sai on 2017/5/13. this 15:31
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration({"/applicationContest.xml"})
@Controller
public class Hello {

  @Resource
  private HelloService helloService;

  @Test
  public void hello(){
    for (int i = 0; i <2; i ++){
      System.out.println(helloService.selectAll().get(i));
    }
  }


}
