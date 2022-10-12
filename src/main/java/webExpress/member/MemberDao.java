package webExpress.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberDao { // Member ���� ������ ���� ó�� ����� ����
	// DAO�� ���α׷� ���� ��, ������ ��ü�� �� �� �ְ� ����
	// ������(����) ���� ��, �̱��� �������� ������ �� ����
	// �� Singleton Pattern
	private static Map<Integer, Member> store = new HashMap<>();
	private static int sequence = 0;
	
	// 1. �ܺο��� newŰ���带 ���� MemberDao ��ü�� ������ �� ������ �⺻�����ڸ� ���ƹ���
	private MemberDao() {}
	// 2. ������ ��ü�� Ŭ���� ���ο��� (private)������ ȣ���� ���� instance �Ҵ�
	private static MemberDao instance = new MemberDao();
	// 3. private ����� ������ �� �ִ� ������ getter
	public static MemberDao getInstance() {
		return instance;
	}
	
	//�������� ������ ���� ��� �޼ҵ� ����~
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
