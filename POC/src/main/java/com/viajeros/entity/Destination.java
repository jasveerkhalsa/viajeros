package com.viajeros.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "destn")
public class Destination {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "destn_id")
	private Long destinationId;

	@Column(name = "desc")
	private String description;

	@Column(name = "lat")
	private Double latitude;

	@Column(name = "long")
	private Double longitude;
	

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = TransportationRate.class, mappedBy = "destination")
	private Set<TransportationRate> transportationRates;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = DetentionRate.class, mappedBy = "destination")
	private Set<DetentionRate> detentionRates;


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(Long destinationId) {
		this.destinationId = destinationId;
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

	public Set<TransportationRate> getTransportationRates() {
		return transportationRates;
	}

	public void setTransportationRates(Set<TransportationRate> transportationRates) {
		this.transportationRates = transportationRates;
	}

	public Set<DetentionRate> getDetentionRates() {
		return detentionRates;
	}

	public void setDetentionRates(Set<DetentionRate> detentionRates) {
		this.detentionRates = detentionRates;
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
}