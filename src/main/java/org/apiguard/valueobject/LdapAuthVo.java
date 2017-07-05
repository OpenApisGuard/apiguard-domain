package org.apiguard.valueobject;

import java.util.Date;

public class LdapAuthVo extends BaseRestResource {

	private static final long serialVersionUID = 1L;

	private String clientId;

	private String reqUri;

	private String ldapUrl;

	private String adminDn;

	private String adminPassword;

	private String userBase;

	private String userAttr;

	private Integer cacheExpireInSecond;

    private Date lastLoginDate;

	public LdapAuthVo(String id, String creationDate, String lastUpdateDate, String clientId, String reqUri, String ldapUrl,
					  String adminDn, String adminPassword, String userBase, String userAttr, Integer cacheExpireInSecond) {
		super(id, creationDate, lastUpdateDate);
		this.clientId = clientId;
		this.reqUri = reqUri;
		this.ldapUrl = ldapUrl;
		this.adminDn = adminDn;
		this.adminPassword = adminPassword;
		this.userBase = userBase;
		this.userAttr = userAttr;
		this.cacheExpireInSecond = cacheExpireInSecond;
	}

	public String getClientId() {
		return clientId;
	}

	public String getReqUri() {
		return reqUri;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getLdapUrl() {
		return ldapUrl;
	}

	public String getAdminDn() {
		return adminDn;
	}

	public String getAdminPassword() {
		return "******";
	}

	public String getUserBase() {
		return userBase;
	}

	public String getUserAttr() {
		return userAttr;
	}

	public Integer getCacheExpireInSecond() {
		return cacheExpireInSecond;
	}

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
