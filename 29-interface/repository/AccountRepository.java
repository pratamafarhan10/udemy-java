package repository;

import java.util.HashMap;
import java.util.Map;

import pojo.Account;

public class AccountRepository {

    private Map<String, Account> datastore = new HashMap<>();

    public void createAccount(Account account) {
        datastore.put(account.getId(), account.clone());
    }

    public Account retrieveAccount(String id) {
        return datastore.get(id).clone();
    }

    public void updateAccount(Account account) {
        datastore.put(account.getId(), account.clone());
    }

    public void deleteAccount(String id) {
        datastore.remove(id);
    }

    public void printAll(){
        datastore.forEach((key, value) -> {
            value.print();
        });
    }
}

