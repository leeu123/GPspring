package com.GPspring.web.repository;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.GPspring.web.vo.MembershipDTO;


@Repository
public class MembershipDAO {
	
	
	@Autowired
	private DataSource datasource;
	
	
	@Autowired
	private SqlSession sql; // 싱글톤 객체
	
	
	public String loginAction(MembershipDTO mb) {

		try {
			String s = sql.selectOne("login", mb);
			
			if(s!=null) {

			return s;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	

}
