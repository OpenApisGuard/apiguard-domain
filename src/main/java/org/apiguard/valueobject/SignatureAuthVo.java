package org.apiguard.valueobject;

public class SignatureAuthVo extends BaseRestResource {

	private static final long serialVersionUID = 1L;

	private String clientId;

	private String clientAlias;

	private String secret;
	
	private String reqUri;

	public SignatureAuthVo(String id, String creationDate, String lastUpdateDate, String clientAlias, String clientId, String secret, String reqUri) {
		super(id, creationDate, lastUpdateDate);
		this.clientAlias = clientAlias;
		this.clientId = clientId;
		this.secret = secret;
		this.reqUri = reqUri;
	}

	public String getClientAlias() {
		return clientAlias;
	}

	public String getClientId() {
		return clientId;
	}

	public String getSecret() {
		return secret;
	}

	public String getReqUri() {
		return reqUri;
	}

}
