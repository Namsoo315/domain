package com.example.jwt_test.domain.member.service;

import com.example.jwt_test.domain.member.entity.Role;

import java.util.Date;

public interface MemberService {
    Long join(String email, String nickname, String password, String gender, Role role, String birth);
}
