package com.example.jwt_test.domain.member.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@Entity
@NoArgsConstructor @AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique =true)
    private String nickname;
    private String email;

    @Column(nullable = false)
    private String password;
    private String birth;
    private String gender;

    @Enumerated(EnumType.STRING)
    private Role role;


    @Builder
    public Member(String email, String nickname, String password, String gender, Role role, String birth){
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.birth = birth;
        this.role = role;
        this.gender = gender;
    }
}
