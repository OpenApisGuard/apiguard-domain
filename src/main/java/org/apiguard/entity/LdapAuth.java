package org.apiguard.entity;

import java.util.Date;

public interface LdapAuth extends Base {
	
	public String getReqUri();

	public String getClientId();

	public String getLdapUrl();

	public String getAdminDn();

	public String getAdminPassword();

	public String getUserBase();

	public String getUserAttr();

    public Integer getCacheExpireInSecond();

    public Date getLastLoginDate();

    public void setLastLoginDate(Date lastLoginDate);
}
