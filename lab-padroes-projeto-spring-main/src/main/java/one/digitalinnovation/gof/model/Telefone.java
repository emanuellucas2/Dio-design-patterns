package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Telefone {

	private Boolean valid;
	@Id
	private String number;
	private String localFormat;
	private String internationalFormat;
	private String countryPrefix;
	private String countryCode;
	private String countryName;
	private String location;
	private String carrier;
	private String lineType;

	
	public Boolean getValid() {
		return valid;
	}
	
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getLocalFormat() {
		return localFormat;
	}
	
	public void setLocalFormat(String localFormat) {
		this.localFormat = localFormat;
	}
	
	public String getInternationalFormat() {
		return internationalFormat;
	}
	
	public void setInternationalFormat(String internationalFormat) {
		this.internationalFormat = internationalFormat;
	}
	
	public String getCountryPrefix() {
		return countryPrefix;
	}
	
	public void setCountryPrefix(String countryPrefix) {
		this.countryPrefix = countryPrefix;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getCarrier() {
		return carrier;
	}
	
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	public String getLineType() {
		return lineType;
	}
	
	public void setLineType(String lineType) {
		this.lineType = lineType;
	}

}