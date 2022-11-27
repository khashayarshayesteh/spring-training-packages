package com.cydeo.repository;

import com.cydeo.entity.Account;
import com.cydeo.entity.Location;
import com.cydeo.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to list all accounts with a specific country or state


    List<Location> findAllByCountry(String country);



    //Write a derived query to list all accounts with age lower than or equal to a specific value

    List<Account> findAccountsByAgeLessThanEqual(String age);


    //Write a derived query to list all accounts with a specific role

    List<Account> findAccountsByRole(UserRole role);



    //Write a derived query to list all accounts between a range of ages

    List<Account> findByAgeBetween(String ageStart, String ageEnd);


    //Write a derived query to list all accounts where the beginning of the address contains the keyword
    List<Account> findByAddressContains(String address);

    //Write a derived query to sort the list of accounts with age

    List<Account> findByAge(String age);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query that returns all accounts


    //Write a JPQL query to list all admin accounts


    //Write a JPQL query to sort all accounts with age


    // ------------------- Native QUERIES ------------------- //

    //Write a native query to read all accounts with an age lower than a specific value


    //Write a native query to read all accounts that a specific value can be containable in the name, address, country, state city


    //Write a native query to read all accounts with an age higher than a specific value


}