package com.banking.dao;
import com.banking.model.Account;
import java.util.*;
public class AccountDAO {
    private Map<String, Account> db = new HashMap<>();
    public void save(Account a){ db.put(a.getAccountNumber(), a); System.out.println("AccountDAO: SAVED " + a.getAccountNumber()); }
    public Account findById(String n){ return db.get(n); }
    public List<Account> findAll(){ return new ArrayList<>(db.values()); }
    public void update(Account a){ db.put(a.getAccountNumber(), a); System.out.println("AccountDAO: UPDATED " + a.getAccountNumber() + " balance P" + a.getBalance()); }
    public void delete(String n){ db.remove(n); }
}
