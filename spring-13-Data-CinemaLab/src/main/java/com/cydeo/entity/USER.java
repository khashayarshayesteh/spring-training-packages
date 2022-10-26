package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user_account")
public class USER extends BaseEntity{

    private String email;
    private String username;
    private String password;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_detals_id")
    private Account account;





}
