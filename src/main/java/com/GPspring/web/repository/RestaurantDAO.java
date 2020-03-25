package com.GPspring.web.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.GPspring.web.vo.*;

@Repository
public class RestaurantDAO {

	@Autowired
	private SqlSession sq; // 싱글톤 객체

	public List<ResdatDTO> selectlistmasjip() { // 평점 베스트 10으로 평점과 식당번호(rnum)을 들고오기 위함
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjip");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkor() { // 한식 평점 베스트 10으로 평점과 식당번호(rnum)을 들고오기 위함
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipkor");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipchn() { // 중식 평점 베스트 10으로 평점과 식당번호(rnum)을 들고오기 위함
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipchn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjpn() { // 중식 평점 베스트 10으로 평점과 식당번호(rnum)을 들고오기 위함
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipjpn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipwest() { // 중식 평점 베스트 10으로 평점과 식당번호(rnum)을 들고오기 위함
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipwest");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipworld() { // 중식 평점 베스트 10으로 평점과 식당번호(rnum)을 들고오기 위함
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipworld");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipwhat() { // 중식 평점 베스트 10으로 평점과 식당번호(rnum)을 들고오기 위함
		List<ResdatDTO> list = null;

		list = sq.selectList("selectmasjipwhat");

		if (list != null) {
			return list;
		}
		return null;
	}

	public RestaurantDTO selectRestau(int rnum) { // 평점 베스트10에서 식당정보 들고 오기 위한 메소드 rnum으로 식당정보
		RestaurantDTO list = null;

		list = sq.selectOne("selectRestau", rnum);

		if (list != null) {
			return list;
		}
		return null;
	}

	public ResdatDTO selectResdat(int rnum) { // 평점 베스트10에서 식당정보 들고 오기 위한 메소드 rnum으로 식당정보
		ResdatDTO list = null;

		list = sq.selectOne("selectResdat", rnum);

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<RestaurantDTO> selectViewtop() { // 조회순으로 베스트 10 식당정보
		List<RestaurantDTO> list = null;

		list = sq.selectList("selectViewtop");

		if (list != null) {
			return list;
		}
		return null;

	}

	public List<RestaurantDTO> navsearch(RestaurantDTO dtoad) {
		System.out.println("");
		List<RestaurantDTO> list = null;

		list = sq.selectList("navsearch", dtoad);
		System.out.println("aa" + list.size());

		return list;
	}

	public List<RestaurantDTO> navlistcount(RestaurantDTO dtoad) {
		System.out.println("");
		List<RestaurantDTO> list = null;

		list = sq.selectList("navlistcount", dtoad);

		return list;
	}

	public List<ResdatDTO> selectlistmasjipseoul() { // 서울 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipseoul");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipdj() { // 대전 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipdj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipgj() { // 광주 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipgj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipbs() { // 부산 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipbs");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkk() { // 경기 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkk");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkw() { // 강원 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkw");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipcb() { // 충북 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipcb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipcn() { // 충남 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipcn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipic() { // 인천 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipic");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipsj() { // 세종 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipsj");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipus() { // 울산 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipus");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkn() { // 경남 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipkb() { // 경북 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipkb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipdg() { // 대구 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipdg");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjn() { // 전남 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjn");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjb() { // 전북 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjb");

		if (list != null) {
			return list;
		}
		return null;
	}

	public List<ResdatDTO> selectlistmasjipjj() { // 제주 맛집 베스트 10 정보를
		List<ResdatDTO> list = null;

		list = sq.selectList("masjipjj");

		if (list != null) {
			return list;
		}
		return null;
	}

}
