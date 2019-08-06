package com.mostafa.sna.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private String [] operatingSystems = {"Windows", "Linux", "MacOS"};
	private String [] selectedOperatingSystems;
	
	private LinkedHashMap<String, String> countryOptions;
	private List<String> languageOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BD", "Bangladesh");
		countryOptions.put("PK", "Pakistan");
		countryOptions.put("IN", "India");
		countryOptions.put("FN", "France");
		
		List<String> list= new ArrayList<String>();
		list.add("Java");
		list.add("PHP");
		list.add("Ruby");
		list.add("Perl");
		languageOptions=list;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public List<String> getLanguageOptions() {
		return languageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public String[] getSelectedOperatingSystems() {
		return selectedOperatingSystems;
	}

	public void setSelectedOperatingSystems(String[] selectedOperatingSystems) {
		this.selectedOperatingSystems = selectedOperatingSystems;
	}
	
}
