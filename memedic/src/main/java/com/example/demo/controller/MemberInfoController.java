package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.MemberInfo;
import java.util.*;
import javax.annotation.PostConstruct;

@RestController
public class MemberInfoController {
	private Map<Number,MemberInfo> memberMap;
	
	@PostConstruct
	public void init() {
		memberMap = new HashMap<Number,MemberInfo>();
		memberMap.put(1,new MemberInfo(1,"abcd123","abcd123"));
		memberMap.put(2,new MemberInfo(2,"efgh456","efgh456"));
		memberMap.put(3,new MemberInfo(3,"ijkl789","ijkl789"));
	}
	
	@GetMapping("/user/{m_seq}")
	public MemberInfo getMemberInfo(@PathVariable("m_seq") Number m_seq) {
		return memberMap.get(m_seq);
	}
	
	@GetMapping("/user/all")
	public List<MemberInfo> getMemberInfoList(){
		return new ArrayList<MemberInfo>(memberMap.values());
	}
	
	@PutMapping("/user/{m_seq}")
	public void putMemberInfo(@RequestParam("m_seq") Number m_seq,@RequestParam("id") String id, @RequestParam("pw") String pw) {
		MemberInfo memberInfo = memberMap.get(m_seq);
		memberInfo.setPw(pw);
	}
	
	@PostMapping("/user/{m_seq}")
	public void postMemberInfo(@RequestParam("m_seq") Number m_seq,@RequestParam("id") String id, @RequestParam("pw") String pw) {
		MemberInfo memberInfo = new MemberInfo(m_seq,id,pw);
		memberMap.put(m_seq, memberInfo);
		
	}
	
	@DeleteMapping("/user/{m_seq}")
	public void deleteMemberInfo(@PathVariable("m_seq") Number m_seq) {
		memberMap.remove(m_seq);
	}

	
}