package kr.or.human.member.dao;

import java.util.List;

public interface MemberDAO {
	
	// 필드는 static final 이 자동으로 붙는다.
	// default void 라는 실행할수 있는 것도 있다.
	// 인터페이스는 public abstract 생략 가능
	public List selectMember();
}
