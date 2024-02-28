package com.kit._02_CollectionTypeProgram;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employ {
	private List<String> Vehecle;
	private Set<String> email;
	private Map<String, String> name;

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
		return "Employ [Vehecle=" + Vehecle + ", email=" + email + ", name=" + name + "]";
	}
}
