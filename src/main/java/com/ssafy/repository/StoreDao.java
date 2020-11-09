package com.ssafy.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.happyhouse.model.HouseInfoDto;
import com.ssafy.happyhouse.model.SidoGugunCodeDto;
import com.ssafy.happyhouse.model.StoreCodeDto;
import com.ssafy.happyhouse.model.StoreInfoDto;
import com.ssafy.util.DBUtil;

public class StoreDao{
	
	private static StoreDao storeDao;
	
	private StoreDao() {}
	
	public static StoreDao getStoreDao() {
		if(storeDao == null)
			storeDao = new StoreDao();
		return storeDao;
	}

	public List<StoreCodeDto> getStoreCode() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StoreCodeDto> list = new ArrayList<StoreCodeDto>();
		try {
			conn = DBUtil.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT * FROM storeInfo");
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				StoreCodeDto dto = new StoreCodeDto();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(pstmt);
			DBUtil.close(conn);
		}
		return list;
	}

	public List<StoreInfoDto> getStoreInfo(String code, String gugun) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<StoreInfoDto> list = new ArrayList<StoreInfoDto>();
		try {
			conn = DBUtil.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT id,name,storeCode,lat,lng,sigungu FROM store \n");
			sql.append("where storeCode=? and sigungu=?\n");
			sql.append("LIMIT 50");
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, code);
			pstmt.setString(2, gugun);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StoreInfoDto dto = new StoreInfoDto();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setStoreCode(rs.getString("storeCode"));
				dto.setLat(rs.getString("lat"));
				dto.setLng(rs.getString("lng"));
				dto.setSigungu(gugun);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(pstmt);
			DBUtil.close(conn);
		}
		return list;
	}
}
