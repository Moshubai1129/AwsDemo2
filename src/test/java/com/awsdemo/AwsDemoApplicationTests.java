package com.awsdemo;

import com.awsdemo.consecutive.RepeatServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
class AwsDemoApplicationTests extends AwsDemoApplication {

    @Autowired
    RepeatServiceImp repeatServiceImp;
    @Test
    void contextLoads() {
    }

    @Test
    public void testRepeatServiceImp(){
        System.out.printf("Input:");
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Output:");

    }
}
