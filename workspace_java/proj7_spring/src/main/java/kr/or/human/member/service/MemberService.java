package kr.or.human.member.service;

import java.util.List;

import kr.or.human.member.dao.MemberDAO;

public interface MemberService {
	
	public List listMember();
	public void setMemberDAO(MemberDAO memberDAO);
}
