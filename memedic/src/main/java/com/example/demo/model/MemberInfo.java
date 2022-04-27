package com.example.demo.model;

public class MemberInfo {
	private Number m_seq;
	private String id;
	private String pw;
	
	public MemberInfo(Number m_seq, String id, String pw) {
		super();
		this.m_seq = m_seq;
		this.id = id;
		this.pw = pw;
	}

	public Number getM_seq() {
		return m_seq;
	}

	public void setM_seq(Number m_seq) {
		this.m_seq = m_seq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
