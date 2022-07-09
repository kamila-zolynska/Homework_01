package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SimpleCustomerLogger implements CustomerLogger {

    @Override
    public void log(String customerOperation) {
        System.out.println(LocalDateTime.now() + ": " + customerOperation);
    }
}
