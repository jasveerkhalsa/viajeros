package com.viajeros.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

import com.viajeros.utils.Strings;

@NamedQueries({ @NamedQuery(name = "Destination.getAllSourceId", query = "select destinationId from Destination destination " +
		"order by destinationId asc ") })

@Entity
@Table(name = "destn")
public class Destination implements IOperable {
	
	@Version
	private Long version;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "destn_id")
	private Long destinationId;

	@Column(name = "name")
	private String name;

	@Column(name = "lat")
	private Double latitude;

	@Column(name = "lon")
	private Double longitude;
	

	public Long getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(Long destinationId) {
		this.destinationId = destinationId;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((destinationId == null) ? 0 : destinationId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destination other = (Destination) obj;
		if (destinationId == null) {
			if (other.destinationId != null)
				return false;
		} else if (!destinationId.equals(other.destinationId))
			return false;
		return true;
	}

	@Override
	public String getPrimaryId() {
		if(null== getDestinationId())
			return Strings.EMPTY;
		return getDestinationId().toString();
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
	
	
}
