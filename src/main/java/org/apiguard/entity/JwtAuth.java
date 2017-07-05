package org.apiguard.entity;

public interface JwtAuth extends Base {
	
	public String getReqUri();

	public String getClientId();

	public String getIssuer();

	public String getSecret();

	/*
	 * nbf- identifies the time before which the JWT must not be accepted for processing.
	 */
	public boolean isNotBefore();

	/*
	 * exp - identifies the expiration time on or after which the JWT must not be accepted for processing.
	 */
	public boolean isExpires();
}
