package pl.coderslab.beans;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@Repository
public class MemoryCustomerRepository implements CustomerRepository {
    private List<Customer> customers = new ArrayList<>();
    private final SimpleCustomerLogger customerLogger;

    @Autowired
    public MemoryCustomerRepository(SimpleCustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
        customerLogger.log("customer added.");
    }

    @Override
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
        customerLogger.log("customer removed");
    }

    @Override
    public List<Customer> getCustomerList() {
        customerLogger.log("list of customers returned.");
        return customers;
    }
}
