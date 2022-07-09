package pl.coderslab.beans;

import java.time.LocalDateTime;

public class SimpleCustomerLogger implements CustomerLogger {


    @Override
    public void log(String customerOperation) {
        System.out.println(LocalDateTime.now() + ": " + customerOperation);
    }
}
