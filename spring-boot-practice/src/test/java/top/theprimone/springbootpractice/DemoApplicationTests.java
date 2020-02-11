package top.theprimone.springbootpractice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import top.theprimone.springbootpractice.bean.Admin;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	Admin admin;

	@Test
	void contextLoads() {
		System.out.println(admin);
	}

}
