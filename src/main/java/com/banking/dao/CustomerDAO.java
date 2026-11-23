package com.banking.dao;
import com.banking.model.Customer;
import java.util.*;
public class CustomerDAO {
    private Map<String, Customer> db = new HashMap<>();
    public void save(Customer c){ db.put(c.getCustomerId(), c); System.out.println("CustomerDAO: SAVED " + c.getCustomerId()); }
    public Customer findById(String id){ return db.get(id); }
    public List<Customer> findAll(){ return new ArrayList<>(db.values()); }
    public void delete(String id){ db.remove(id); System.out.println("CustomerDAO: DELETED " + id); }
    public int count(){ return db.size(); }
}
