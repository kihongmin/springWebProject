package com.ssafy.repository;

import java.util.List;

import com.ssafy.dto.HouseInfo;
import com.ssafy.dto.SidoGugunCode;
import com.ssafy.dto.HouseInfo;
import com.ssafy.dto.SidoGugunCode;

public interface HouseMapDao {

	List<SidoGugunCode> getSido() throws Exception;
	List<SidoGugunCode> getGugunInSido(String sido) throws Exception;
	List<HouseInfo> getDongInGugun(String gugun) throws Exception;
	List<HouseInfo> getAptInDong(String dong) throws Exception;
	
}
