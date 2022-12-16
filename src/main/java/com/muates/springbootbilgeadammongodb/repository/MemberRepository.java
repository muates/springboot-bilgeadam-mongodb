package com.muates.springbootbilgeadammongodb.repository;

import com.muates.springbootbilgeadammongodb.model.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberRepository extends MongoRepository<Member, String> {
    Member findMemberByEmail(String email);
}
