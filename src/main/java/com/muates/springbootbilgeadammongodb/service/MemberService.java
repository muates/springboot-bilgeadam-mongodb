package com.muates.springbootbilgeadammongodb.service;

import com.muates.springbootbilgeadammongodb.model.Member;
import com.muates.springbootbilgeadammongodb.model.MemberPageRequest;
import org.springframework.data.domain.Page;

public interface MemberService {
    Member addMember(Member member);
    Member getMemberByEmail(String email);
    Page<Member> getMembers(MemberPageRequest pageRequest);
}
