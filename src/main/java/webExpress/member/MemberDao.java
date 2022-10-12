package webExpress.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberDao { // Member 관련 데이터 연동 처리 기능을 제공
	// DAO는 프로그램 실행 후, 단일한 객체로 둘 수 있게 설계
	// 디자인(설계) 패턴 중, 싱글톤 패턴으로 구현할 수 있음
	// ㄴ Singleton Pattern
	private static Map<Integer, Member> store = new HashMap<>();
	private static int sequence = 0;
	
	// 1. 외부에서 new키워드를 통해 MemberDao 객체를 생성할 수 없도록 기본생성자를 막아버림
	private MemberDao() {}
	// 2. 단일한 객체를 클래스 내부에서 (private)생성자 호출을 통해 instance 할당
	private static MemberDao instance = new MemberDao();
	// 3. private 멤버를 참조할 수 있는 유일한 getter
	public static MemberDao getInstance() {
		return instance;
	}
	
	//여러가지 데이터 조작 기능 메소드 정의~
	public void save(Member member) {
		final int custno = ++sequence;
		member.setCustno(custno);
		store.put(custno, member);
	}
	
	public List<Member> findAll() {
		return new ArrayList<>(store.values());
	}
	
	public Member findByCustno(int custno) {
		return store.get(custno);
	}
}
