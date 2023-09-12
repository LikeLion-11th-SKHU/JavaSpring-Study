package hello.hellospring.repository;
import hello.hellospring.domain.Member;
import java.util.List;
import java.util.Optional;
public interface MemberRepository {
    Member save(Member member);//회원을 저장하면 저장된 회원 반환
    Optional<Member> findById(Long id); //id를 통해 찾기
    Optional<Member> findByName(String name); //name을 통해 찾기
    List<Member> findAll(); //지금까지 저장된 회원들 반환
}