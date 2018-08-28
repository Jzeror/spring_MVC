package com.gms.web.repository;

import java.util.List;
import java.util.Map;

import com.gms.web.domain.MemberDTO;

public interface MemberDAO {
	public void insert(MemberDTO p) ;
	public List<?> selectList(Map<?,?> p) ;
	public List<?> selectSome(Map<?,?> p) ;
	public MemberDTO selectOne(MemberDTO p) ;
	public int count(Map<?,?> p) ;
	public void update(Map<?,?> p) ;
	public void delete(MemberDTO member) ;
	public MemberDTO login(MemberDTO member) ;  //선생님은 boolean 처리하심.
}
