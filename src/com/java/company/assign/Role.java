package com.java.company.assign;

public class Role {
	private String roleName;
	private int rolrCode;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getRolrCode() {
		return rolrCode;
	}

	public void setRolrCode(int rolrCode) {
		this.rolrCode = rolrCode;
	}

	@Override
	public String toString() {
		return "\n\t\tRole [roleName=" + roleName + ", rolrCode=" + rolrCode + "]";
	}

	public Role(String roleName, int rolrCode) {
		super();
		this.roleName = roleName;
		this.rolrCode = rolrCode;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
