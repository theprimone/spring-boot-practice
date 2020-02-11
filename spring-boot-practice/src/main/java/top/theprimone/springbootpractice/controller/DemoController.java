package top.theprimone.springbootpractice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

  @Value("${admin.name}")
  public String adminName;

  @ResponseBody
  @RequestMapping("/hello")
  public String hello() {
    return String.format("Hello, %s!", adminName);
  }
}
