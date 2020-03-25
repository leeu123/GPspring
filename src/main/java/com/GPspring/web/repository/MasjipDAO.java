package com.GPspring.web.repository;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.GPspring.web.vo.ResdatDTO;
@Repository
public class MasjipDAO {
	
	
	@Autowired
	private SqlSession sql; // 싱글톤 객체
	
	
	public List<ResdatDTO> masjiprec() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjiprec");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipkor() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipkor");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipjpn() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipjpn");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipchn() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipchn");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public List<ResdatDTO> masjipwest() {

		try {
			List<ResdatDTO> rslist = sql.selectList("masjipwest");
			
			if(rslist.size()!=0) {

			return rslist;
			}
			else
				return null;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	
	
	
	

}
