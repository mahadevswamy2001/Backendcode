package com.kit._11_StandAloneConcepts;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employ {

	private List<String> Vehecle;
	private Set<String> email;
	private Map<String, String> name;
	private Properties dbprop;

	public Properties getDbprop() {
		return dbprop;
	}

	public void setDbprop(Properties dbprop) {
		this.dbprop = dbprop;
	}

	public List<String> getVehecle() {
		return Vehecle;
	}

	public void setVehecle(List<String> vehecle) {
		Vehecle = vehecle;
	}

	public Set<String> getEmail() {
		return email;
	}

	public void setEmail(Set<String> email) {
		this.email = email;
	}

	public Map<String, String> getName() {
		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employ [Vehecle=" + Vehecle + ", email=" + email + ", name=" + name + ", dbprop=" + dbprop + "]";
	}
}
