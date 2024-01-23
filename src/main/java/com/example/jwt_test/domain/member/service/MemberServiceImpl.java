package com.example.jwt_test.domain.member.service;

import com.example.jwt_test.domain.member.entity.Member;
import com.example.jwt_test.domain.member.entity.Role;
import com.example.jwt_test.domain.member.repository.MemberRepository;
import com.example.jwt_test.global.exception.CustomException;
import com.example.jwt_test.global.exception.ErrorCode;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    @Transactional
    public Long join(String email, String nickname, String password, String gender, Role role, String birth){
        if(memberRepository.findByEmail(email).isPresent()){
            throw new CustomException(ErrorCode.MEMBER_ALREADY_EXIST);  //중복 처리
        }
        Member member = Member.builder()
                .email(email)
                .password(password)
                .nickname(nickname)
                .birth(birth)
                .gender(gender)
                .role(role)
                .build();
        Member savedMember = memberRepository.save(member);
        return savedMember.getId();
    }
}
