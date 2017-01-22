package demo;

import domain.Address;
import domain.Customer;
import function.Demodentity;

import java.util.List;

/**
 * Created by Mrguozp on 2017/1/21.
 */
public class DemoFunc {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Address address = new Address();
        address.setStreet("mmmmmmm");
        customer.setAddress(address);
        customer.setName("zhangsan");
        Demodentity<String> demoEntity = new Demodentity<>(customer)
                .map(Customer::getAddress)
                .map(Address::getStreet)
                .map(s -> s.substring(0, 3))
                .map(String::toUpperCase);
      /*  System.out.println(idBytes);*/
       /* new Thread(()->System.out.print(Thread.currentThread().getName())
        ).start();
        new Thread(()->System.out.print(Thread.currentThread().getPriority())
        ).start();
        m1(Arrays.asList("a","n"));*/
    }

    public static void m1(List<String> list) {
        list.sort((a, b) -> a.length() - b.length());
    }
}
