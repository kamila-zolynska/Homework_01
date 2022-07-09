package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.Customer;
import pl.coderslab.beans.MemoryCustomerRepository;
import pl.coderslab.beans.SimpleCustomerLogger;

public class SpringDiApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SimpleCustomerLogger simpleCustomerLogger = context.getBean("simpleCustomerLogger", SimpleCustomerLogger.class);
//        simpleCustomerLogger.log();

        MemoryCustomerRepository memoryCustomerRepository = context.getBean("memoryCustomerRepository", MemoryCustomerRepository.class);
        memoryCustomerRepository.addCustomer(new Customer(1, "ala", "kowalska"));
        memoryCustomerRepository.getCustomerList()
                .stream()
                .forEach(System.out::println);
        memoryCustomerRepository.removeCustomer(memoryCustomerRepository.getCustomerList().get(0));
        memoryCustomerRepository.getCustomerList()
                .stream()
                .forEach(System.out::println);


        context.close();
    }
}
