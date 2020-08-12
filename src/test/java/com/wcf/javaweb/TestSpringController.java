package com.wcf.javaweb;

import com.wcf.javaweb.controller.IndexController;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = IndexController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestSpringController {

    @Autowired
    private IndexController indexController;

    @Test
    public void test1(){
        TestCase.assertEquals(this.indexController.first(),"Hello World! Nice to meet you, I am Jason");
    }
}
