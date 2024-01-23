package com.example.jwt_test.domain.member.repository;

import com.example.jwt_test.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email); //사용자 email(id)를 이용해 회원 아이디 찾기

}
