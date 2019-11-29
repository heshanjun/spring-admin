package com.hsj.springboot;

import com.hsj.springboot.bean.Person;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    Person person;
    @Test
    void contextLoads() {
//        System.out.print(person);
        Log log = LogFactory.getLog(getClass());
        //日志的级别
        //由低到高  trace<debug<info <warn<error
        //可以调整日志级别，日志只会在这个级别以后的高级级别生效
        log.debug("这是调试信息 ");
        log.trace("这是trace日志");
        //springboot默认给我们的是info级别
        log.info("这是info日志");
        log.warn("这是警告日志");
        log.error("这是错误日志");
    }

}
