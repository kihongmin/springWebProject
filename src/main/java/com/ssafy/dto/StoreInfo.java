package com.ssafy.dto;

public class StoreInfo {
	private String id;
	private String name;
	private String lat;
	private String lng;
	private String sigungu;
	private String storeCode;
	public String getStoreCode() {
		return storeCode;
	}
	public void setStoreCode(String storeCode) {
		this.storeCode = storeCode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getSigungu() {
		return sigungu;
	}
	public void setSigungu(String sigungu) {
		this.sigungu = sigungu;
	}
	@Override
	public String toString() {
		return "StoreInfoDto [id=" + id + ", name=" + name + ", lat=" + lat + ", lng=" + lng + ", sigungu=" + sigungu
				+ ", storeCode=" + storeCode + "]";
	}
	
}
