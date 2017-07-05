package org.apiguard.valueobject;

import org.apiguard.commons.utils.DateTimeFormater;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.Date;

public class BaseRestResource implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String creationDate;

	private String lastUpdateDate;
	
	public BaseRestResource(String id, String creationDate, String lastUpdateDate) {
		this.id = id;

		if (StringUtils.isEmpty(creationDate) && StringUtils.isEmpty(lastUpdateDate)) {
			String date = DateTimeFormater.toString(new Date());
			this.creationDate = date;
			this.lastUpdateDate = date;
		}
		else {
			this.creationDate = creationDate;
			this.lastUpdateDate = lastUpdateDate;
		}

	}

	public String getId() {
		return id;
	}
	
	public String getCreationDate() {
		return creationDate;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
}
