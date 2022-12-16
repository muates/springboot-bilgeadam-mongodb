package com.muates.springbootbilgeadammongodb.service.impl;

import com.muates.springbootbilgeadammongodb.model.Member;
import com.muates.springbootbilgeadammongodb.model.MemberPageRequest;
import com.muates.springbootbilgeadammongodb.repository.MemberRepository;
import com.muates.springbootbilgeadammongodb.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member addMember(Member member) {
        return memberRepository.insert(member);
    }

    @Override
    public Member getMemberByEmail(String email) {
        return memberRepository.findMemberByEmail(email);
    }

    @Override
    public Page<Member> getMembers(MemberPageRequest pageRequest) {
        Pageable pageable = PageRequest.of(pageRequest.getPage(), pageRequest.getSize());
        return memberRepository.findAll(pageable);
    }
}
