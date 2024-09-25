package kr.or.human.member.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

// Spring에서 Bean으로 등록하기
// SQL문을 실행시킬때 예외처리가 어쩌구 저쩌구...(못들었다..)

@Repository
@Primary // 우선되는것
public class MemberDAOImpl2 implements MemberDAO {

	@Override
	public List selectMember() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		
		return list;
	}

	
	
}
