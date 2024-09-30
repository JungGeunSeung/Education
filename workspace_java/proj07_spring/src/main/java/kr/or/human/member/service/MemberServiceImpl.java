package kr.or.human.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human.member.dao.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService {

	// 의존성을 줄이기 위해 필드에 dao를 올려놓고 생성자를 생성해서
	// 전달인자로 들어온 dao를 필드에 다시 올려줌으로서 
	// 같은 타입의 어떤 dao가 들어와도 실행이 가능하게 한다.
	
	// Ioc(inversion of Control) : 제어의 역전
	// 찾아서 new를 대신해줌.
	
	// DI (Dependency Injection) : 의존성 주입
	// 변수에 넣는다.
	
	
	// 자기가 가지고 있는 Bean들 중에 자동으로 형변환 될수 있는 걸 찾는다.
	// new 해서 넣어서 자동으로 넣어준다
	// 우선순위
	// 1. 완전히 동일한 클래스
	// 2. 자동 형변환이 가능한 클래스(자식 클래스)
	@Autowired
	// @Autowired를 할때 두개 이상의 bean이 후보라면
	// 1. @Primary가 있는 객체 우선
	// 2. @Qualifier(bean id)가 있는 경우 bean id에 해당하는 객체를 찾는다
	// 3. @Primary, @Qualifier도 없는 경우 변수명과 bean id가 같은 객체 찾기
	
	@Qualifier("memberDAOImpl")
	MemberDAO memberDAO;
	
//	MemberServiceImpl(MemberDAO memberDAO){
//		this.memberDAO = memberDAO;
//	}
	
//	dao를 service 필드에 넣어주는 setter이다.
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	
	@Override
	public List listMember() {
//		MemberDAO dao = new MemberDAOImpl(); 인터페이스로 호출 가능 (자동 형변환)
//		MemberDAOImpl dao = new MemberDAOImpl();
		
		List list = this.memberDAO.selectMember();
		
		
		return list;
	}

}
