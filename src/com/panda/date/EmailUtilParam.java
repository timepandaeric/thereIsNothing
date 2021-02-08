package com.panda.date;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * <p></p>
 *
 * @author WuZhongLiang
 * @date : 2021-02-08 23:30
 **/
@Configuration
public class EmailUtilParam implements InitializingBean {

    @Value("${email.type}")
    private String type;

    @Value("${email.username}")
    private String username;

    @Value("${email.password}")
    private String password;

    @Value("${email.host}")
    private String host;

    @Value("${email.port}")
    private int port;

    public static String EMAIL_TYPE;
    public static String USERNAME;
    public static String PASSWORD;
    public static String HOST;
    public static int PORT;

    @Override
    public void afterPropertiesSet() throws Exception {
        EMAIL_TYPE = type;
        USERNAME = username;
        PASSWORD = password;
        HOST = host;
        PORT = port;
    }

    // function
}
