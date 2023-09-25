package hello.hellospring.repository;
import hello.hellospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;
/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 */
@Repository //정형화되어있는 패턴
public class MemoryMemberRepository implements MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;//sequence는 0,1,2 이렇게 key값 생성해주는 아이
    @Override
    public Member save(Member member) {
        member.setId(++sequence);//sequence값 하나 올려주기
        store.put(member.getId(), member);//스토어에 put-->map에 저장됨
        return member;
    }
    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
        //return store.get(id);라 하기도 하는데 null반환 가능성이 있으면 optional.of~~ 사용해줌
        //이러면 null도 감쌀수있음
    }
    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());//store에 있는 멤버들이 반환됨
    }
    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))//파라미터로 넘어온 name이랑 같은지 확인
                .findAny();//찾으면 반환(루프돌면서 찾으면 바로 반환), 없으면 null포함해서 반환
    }
    public void clearStore() {
        store.clear();
    }
}