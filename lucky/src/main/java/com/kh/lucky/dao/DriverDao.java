package com.kh.lucky.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.lucky.dto.DriverDto;

@Repository
public class DriverDao {

	@Autowired
	private SqlSession sqlSession;

	// 조회 전체
	public List<DriverDto> selectList() {
		return sqlSession.selectList("driver.list");
	}
	
	//등록
	public void insert(DriverDto driverDto) {
		sqlSession.insert("driver.insert",driverDto);
	}
	//시퀀스
	public int sequence() {
		return sqlSession.selectOne("driver.sequence");
	}
	//상세
	public DriverDto selectOne(int driverNo) {
		return sqlSession.selectOne("driver.find", driverNo);
	}
	
	//전체수정
	public boolean editAll(DriverDto driverDto) {
		return sqlSession.update("driver.editAll",driverDto) > 0;
	}
	//일부수정
	public boolean edit(DriverDto driverDto) {
		return sqlSession.update("driver.edit",driverDto) > 0;
	}
	
	//삭제
	public boolean delete(int driverNo) {
		return sqlSession.delete("driver.delete",driverNo) > 0;
	}
}
