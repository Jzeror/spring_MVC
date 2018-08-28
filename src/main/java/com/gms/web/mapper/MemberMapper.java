package com.gms.web.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gms.web.domain.MemberDTO;
import com.gms.web.repository.MemberDAO;
@Repository
public class MemberMapper implements MemberDAO {
	@Autowired SqlSessionFactory factory;
	private static final String ns =
						"com.gms.web.mapper.MemberMapper";
	@Override
	public void insert(MemberDTO p) {
		SqlSession sqlSession = factory.openSession();
		sqlSession.insert(ns+".insert",p);
	}

	@Override
	public List<?> selectList(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> selectSome(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO selectOne(MemberDTO p) {

    	System.out.println("retrieve :: " +p.getMemId() );
		SqlSession sqlSession = factory.openSession();
		
		return sqlSession.selectOne(ns+".selectOne",p);
	}

	@Override
	public int count(Map<?, ?> p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(Map<?, ?> p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MemberDTO member) {
		System.out.println("오냐 ::: "+member.getMemId());
		System.out.println("오냐 ::: "+member.getPassword());
		factory.openSession().delete(ns+".delete",member);
		
	}

	@Override
	public MemberDTO login(MemberDTO member) {
		SqlSession sqlSession = factory.openSession();
		return (MemberDTO)sqlSession.selectOne(ns+".login",member);
	}

}
