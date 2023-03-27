package ezen.project.IGSJ;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ezen.project.IGSJ.member.domain.MemberDTO;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class DTTest {
	
	
	@PostMapping("/memberlogin")
	public void joinMember(
			@RequestBody MemberDTO memberDTO) throws Exception{
		
		log.info(memberDTO.toString());
		
	}
	
	// @RequestBody는 post로만 사용이 가능하다.
	
}
