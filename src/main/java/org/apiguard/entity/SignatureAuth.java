package org.apiguard.entity;

public interface SignatureAuth extends Base {
	
	public String getSecret();

	public String getReqUri();

	public String getClientAlias();

	public String getClientId();
}
