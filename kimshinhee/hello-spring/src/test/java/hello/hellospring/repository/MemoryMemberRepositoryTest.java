package hello.hellospring.repository;
import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;
import static org.assertj.core.api.Assertions.*;
class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }
    @Test //@Test치면 org.junit.jupiter.api 뜨고 선택해서 임포트해줌
    public void save() {
        //given
        Member member = new Member(); //저장이 잘되는지 확인
        member.setName("spring");//나는 이름 스프링으로 해줌
        //when
        repository.save(member);//레포지토리에 멤버 세이브하기
        //then
        Member result = repository.findById(member.getId()).get();//제대로 잘 드갔나 확인
        //optional에서 값 꺼낼때 .get()으로 할 수 있음
        assertThat(result).isEqualTo(member);
        //sysout("result = " + (result == member));
        //Assertions.assertEquals(member, result);
        //Assertions.assertThat(member).isEqualTo(result); -->Assertions없애도 된다는 뜻
    }
    @Test
    public void findByName() {//이름으로 찾는거
        //given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();//이거 어차피 숫자하나 바뀌니까 위에꺼 복붙하고 member1에 shift + F6누르면 됨(rename)
        member2.setName("spring2");
        repository.save(member2);

        //when
        Member result = repository.findByName("spring1").get();

        //then
        assertThat(result).isEqualTo(member1);
    }
    @Test
    public void findAll() {
        //given
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        //when
        List<Member> result = repository.findAll();

        //then
        assertThat(result.size()).isEqualTo(2);//2개가 나와야 함.
    }
}