package com.gms.web.service;

import java.util.List;
import java.util.Map;

import com.gms.web.domain.MemberDTO;

public interface MemberService {
	public void add(MemberDTO p) ; // com.gms.web.domain.MemberDTO
	public List<?> list(Map<?,?> p) ;
	public List<?> search(Map<?,?> p) ;
	public MemberDTO retrieve(MemberDTO p) ;
	public int count(Map<?,?> p) ;
	public void modify(Map<?,?> p) ;
	public void remove(MemberDTO member) ;
	public MemberDTO login(MemberDTO member) ;  //선생님은 boolean 처리하심.
}
