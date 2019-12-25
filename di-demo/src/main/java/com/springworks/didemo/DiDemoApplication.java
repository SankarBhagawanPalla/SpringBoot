package com.springworks.didemo;

import com.springworks.didemo.externalbeans.FakeDataSource;
import com.springworks.didemo.controllers.ConstructorInjectedController;
import com.springworks.didemo.controllers.MyController;
import com.springworks.didemo.controllers.PropertyInjectorController;
import com.springworks.didemo.controllers.SetterInjectedController;
import com.springworks.didemo.externalbeans.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan(basePackages = {"com.service", "com.springworks"})
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller= (MyController) ctx.getBean("myController");
        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean("fakeDataSource");
        FakeJMSBroker fakeJMSBroker = ctx.getBean(FakeJMSBroker.class);

        Environment env = (Environment) ctx.getBean("environment");
        System.out.println(env.getProperty("COMPUTERNAME"));
        System.out.println(fakeJMSBroker.toString());
        System.out.println(fakeDataSource.toString());
        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectorController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}
