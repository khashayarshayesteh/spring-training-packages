package com.cydeo;

import com.cydeo.enums.UserRole;
import com.cydeo.repository.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryDemo implements CommandLineRunner {
    private final AccountRepository accountRepository;

    public QueryDemo(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("--------------------------   Account Repository -------------");
        System.out.println("findAccountsByCountryOrState" + accountRepository.findAccountsByCountry("United States"));
        System.out.println("findAccountsByAgeLessThanEqual" + accountRepository.findAccountsByAgeLessThanEqual("41"));
        System.out.println("findAccountsByRole" + accountRepository.findAccountsByRole(UserRole.valueOf("USER")));
        System.out.println("findByAgeBetween" + accountRepository.findByAgeBetween("25","44"));
        System.out.println("findByAddressContains" + accountRepository.findByAddressContains("2903"));
        System.out.println(" findByAge" + accountRepository. findByAge("44"));


    }
}
