package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import java.util.*;

public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        //given
        Member member = new Member();
        member.setName("Dong-Jae");

        //when
        repository.save(member);

        //then
        Member result = repository.findById(member.getId()).get();
        assertThat(result).isEqualTo(member);
    }

    @Test
    public void findByName() {
        //given
        Member member1 = new Member();
        member1.setName("Dong-Jae");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("Crayon");
        repository.save(member2);

        //when
        Member result = repository.findByName("Crayon").get();

        //then
        assertThat(result).isEqualTo(member2);
    }

    @Test
    public void findAll() {
        //given
        Member member1 = new Member();
        member1.setName("Dong-Jae");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("Crayon");
        repository.save(member2);

        //when
        List<Member> result = repository.findAll();

        //then
        assertThat(result.size()).isEqualTo(2);
    }
}