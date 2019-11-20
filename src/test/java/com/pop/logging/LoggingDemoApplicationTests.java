package com.pop.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoggingDemoApplicationTests {

    private Logger logger = LoggerFactory.getLogger(LoggingDemoApplicationTests.class);

    @Test
    void contextLoads() {

        logger.debug(" 这是一条 debug 日志");
        logger.info(" 这是一条 {} 日志","info");
        logger.error(" 这是一条 错误日志");

    }

}
