package com.muates.springbootbilgeadammongodb.controller;

import com.muates.springbootbilgeadammongodb.model.Member;
import com.muates.springbootbilgeadammongodb.model.MemberPageRequest;
import com.muates.springbootbilgeadammongodb.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/add")
    public Member addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }

    @GetMapping("/getByEmail/{email}")
    public Member getMemberByEmail(@PathVariable String email) {
        return memberService.getMemberByEmail(email);
    }

    @GetMapping
    public Page<Member> getMembers(@ModelAttribute MemberPageRequest request) {
        return memberService.getMembers(request);
    }
}
