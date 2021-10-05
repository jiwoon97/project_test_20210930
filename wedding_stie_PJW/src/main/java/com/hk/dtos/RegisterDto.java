package com.hk.dtos;

import java.io.Serializable;
import java.util.Date;

public class RegisterDto implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	private int re_no;
	private String re_name;
	private String re_content;
	private String re_ad;
	private String re_phone;
	private String re_Image1;
	private String re_Image2;
	private String re_Image3;
	private Date re_date;
	

	public RegisterDto() {
		super();

	}
	public RegisterDto(int re_no, String re_name, String re_content, String re_ad, String re_phone, String re_Image1,
			String re_Image2, String re_Image3, Date re_date) {
		super();
		this.re_no = re_no;
		this.re_name = re_name;
		this.re_content = re_content;
		this.re_ad = re_ad;
		this.re_phone = re_phone;
		this.re_Image1 = re_Image1;
		this.re_Image2 = re_Image2;
		this.re_Image3 = re_Image3;
		this.re_date = re_date;
	}
	public int getRe_no() {
		return re_no;
	}
	public void setRe_no(int re_no) {
		this.re_no = re_no;
	}
	public String getRe_name() {
		return re_name;
	}
	public void setRe_name(String re_name) {
		this.re_name = re_name;
	}
	public String getRe_content() {
		return re_content;
	}
	public void setRe_content(String re_content) {
		this.re_content = re_content;
	}
	public String getRe_ad() {
		return re_ad;
	}
	public void setRe_ad(String re_ad) {
		this.re_ad = re_ad;
	}
	public String getRe_phone() {
		return re_phone;
	}
	public void setRe_phone(String re_phone) {
		this.re_phone = re_phone;
	}
	public String getRe_Image1() {
		return re_Image1;
	}
	public void setRe_Image1(String re_Image1) {
		this.re_Image1 = re_Image1;
	}
	public String getRe_Image2() {
		return re_Image2;
	}
	public void setRe_Image2(String re_Image2) {
		this.re_Image2 = re_Image2;
	}
	public String getRe_Image3() {
		return re_Image3;
	}
	public void setRe_Image3(String re_Image3) {
		this.re_Image3 = re_Image3;
	}
	public Date getRe_date() {
		return re_date;
	}
	public void setRe_date(Date re_date) {
		this.re_date = re_date;
	}
	@Override
	public String toString() {
		return "RegisterDto [re_no=" + re_no + ", re_name=" + re_name + ", re_content=" + re_content + ", re_ad="
				+ re_ad + ", re_phone=" + re_phone + ", re_Image1=" + re_Image1 + ", re_Image2=" + re_Image2
				+ ", re_Image3=" + re_Image3 + ", re_date=" + re_date + "]";
	}
	
}
