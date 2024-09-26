package kr.or.human.dto;

import lombok.Data;

// Silver bullet lombok
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@EqualsAndHashCode

@Data // 위 5개를 한번에 사용 가능한 Data
public class MemberDTO {
	
	private String userID;
	private String userPW;
	private int age;
	private String userName;
}
