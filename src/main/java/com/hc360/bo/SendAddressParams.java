package com.hc360.bo;

public class SendAddressParams {

	private long providerid;
	private long ssoid;
	private long province;
	private long city;
	private long area;
	private String isdefault;
	private String address;
	private long country;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getCountry() {
		return country;
	}

	public void setCountry(long country) {
		this.country = country;
	}

	public long getProviderid() {
		return providerid;
	}

	public void setProviderid(long providerid) {
		this.providerid = providerid;
	}

	public long getSsoid() {
		return ssoid;
	}

	public void setSsoid(long ssoid) {
		this.ssoid = ssoid;
	}

	public long getProvince() {
		return province;
	}

	public void setProvince(long province) {
		this.province = province;
	}

	public long getCity() {
		return city;
	}

	public void setCity(long city) {
		this.city = city;
	}

	public long getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}

	public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

}
