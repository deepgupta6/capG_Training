package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import model.Address;
import model.Employee;
import model.HelloWorld;

@Configuration
@PropertySource("classpath:data.properties")
@ComponentScan("model")
public class MyConfig {

//    @Bean("h")
//    @Scope("prototype")
//    public HelloWorld helloBean() {
//        HelloWorld hello = new HelloWorld();
//        hello.setName("Guddu");
//        return hello;
//    }
//
//    @Bean("employee")
//    public Employee employeeBean() {
//        Employee emp = new Employee();
//        return emp;
//    }
//
//    @Bean("address")
//    public Address addressBean() {
//        Address adr = new Address();
//        return adr;
//    }
}