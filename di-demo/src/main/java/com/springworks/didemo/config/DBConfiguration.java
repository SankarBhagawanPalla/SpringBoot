package com.springworks.didemo.config;

import com.springworks.didemo.externalbeans.FakeDataSource;
import com.springworks.didemo.externalbeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:Datasource.properties")
public class DBConfiguration {

    @Value("${test.dburl}")
    private String dburl;
    @Value("${test.username}")
    private String username;
    @Value("${test.password}")
    private String password;
    @Value("${test.jms.url}")
    private String jmsusername;
    @Value("${test.jms.username}")
    private String jmspassword;
    @Value("${test.jms.password}")
    private String jmsurl;


    @Bean
    public FakeDataSource fakeDataSource(){
            FakeDataSource fakeDataSource = new FakeDataSource();
            fakeDataSource.setDburl(dburl);
            fakeDataSource.setUserName(username);
            fakeDataSource.setPassword(password);
            return fakeDataSource;
    }

    @Bean
    public FakeJMSBroker fakeJMSBroker(){
        FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
        fakeJMSBroker.setJmsurl(jmsurl);
        fakeJMSBroker.setUsername(jmsusername);
        fakeJMSBroker.setPassword(jmspassword);
        return fakeJMSBroker;
    }

    //This should be a static method
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}
