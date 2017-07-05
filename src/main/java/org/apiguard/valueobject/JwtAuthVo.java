package org.apiguard.valueobject;

public class JwtAuthVo extends BaseRestResource {

	private static final long serialVersionUID = 1L;

	private String clientId;

	private String issuer;

	private String reqUri;

	private String secret;

	// nbf- identifies the time before which the JWT must not be accepted for processing.
	private boolean notBefore;

	// exp - identifies the expiration time on or after which the JWT must not be accepted for processing.
	private boolean expires;

	public JwtAuthVo(String id, String creationDate, String lastUpdateDate, String clientId, String reqUri, String issuer, String secret, boolean notBefore, boolean expires) {
		super(id, creationDate, lastUpdateDate);
		this.clientId = clientId;
		this.issuer = issuer;
		this.reqUri = reqUri;
		this.secret = secret;
		this.notBefore = notBefore;
		this.expires = expires;
	}

	public String getClientId() {
		return clientId;
	}

	public String getReqUri() {
		return reqUri;
	}

	public String getIssuer() {
		return issuer;
	}

	public String getSecret() {
		return secret;
	}

	public boolean isNotBefore() {
		return notBefore;
	}

	public boolean isExpires() {
		return expires;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}


}
