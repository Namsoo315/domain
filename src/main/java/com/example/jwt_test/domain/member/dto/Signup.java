package com.example.jwt_test.domain.member.dto;

import com.example.jwt_test.domain.member.entity.Role;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Signup {
    private String email;
    private String password;
    private String nickname;
    private String gender;
    private String birth;
    private Role role;
}
