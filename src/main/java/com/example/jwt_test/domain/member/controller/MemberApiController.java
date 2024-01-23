package com.example.jwt_test.domain.member.controller;

import com.example.jwt_test.domain.member.dto.Signup;
import com.example.jwt_test.domain.member.service.MemberService;
import com.example.jwt_test.global.dto.MessageResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class MemberApiController {

    private final MemberService memberService;

    @PostMapping("/signup") //회원가입
    public ResponseEntity<MessageResponse> signup(@RequestBody @Valid Signup request){
        Long joinMemberId = memberService.join(
                request.getEmail(),
                request.getNickname(),
                request.getPassword(),
                request.getGender(),
                request.getRole(),
                request.getBirth()

        );
        return ResponseEntity.ok(new MessageResponse("회원가입 완료."));
    }

        //로그인

}
