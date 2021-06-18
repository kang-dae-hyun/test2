package test.testspring.service;

import test.testspring.domain.Member;

import test.testspring.repository.MemberRepository;
import test.testspring.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     *
     * 회원가입
     */

    public Long join (Member member) {
        //같은 이름이 있는 중복 회원 x
   /**     Optional<java.lang.reflect.Member> result = memberRepository.findByName(member.getName());
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원");
        });
**/

        memberRepository.save(member);
        return member.getId();
    }
}