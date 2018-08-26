package com.ibank.repositories;

import com.ibank.models.Account;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static java.util.Optional.ofNullable;

@Repository
public class AccountRepository implements DataRepository<Account, Long> {

    private static final Map<Long, Account> store = new HashMap<>();
    private static Long id = 1L;

    @Override
    public Account create(Account account) {
        account.setId(id);
        return store.put(id++, account);
    }

    @Override
    public Optional<Account> findById(Long id) {
        return ofNullable(store.getOrDefault(id, null));
    }

    @Override
    public Account update(Account account) {
        return findById(account.getId()).map(acc -> account).orElse(null);
    }
}
