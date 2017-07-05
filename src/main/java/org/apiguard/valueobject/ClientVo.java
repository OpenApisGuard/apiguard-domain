package org.apiguard.valueobject;

public class ClientVo extends BaseRestResource {

	private static final long serialVersionUID = 1L;

	private String clientId;

	public ClientVo(String id, String creationDate, String lastUpdateDate, String clientId) {
		super(id, creationDate, lastUpdateDate);
		this.clientId = clientId;
	}

	public String getClientId() {
		return clientId;
	}
}
