package com.kit._12_SteroAnnotation;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ipl {
	@Value("RCB , csk")
	private String teamNname;
	@Value("VK")
	private String teamCaptain;
	@Value("#{temp}")
	private List<String> playerName;

	public String getTeamNname() {
		System.out.println("hdhdkjsd");
		return teamNname;
	}

	public void setTeamNname(String teamNname) {
		System.out.println("hdhdkjsd");

		this.teamNname = teamNname;
	}

	public String getTeamCaptain() {
		return teamCaptain;
	}

	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}

	public List<String> getPlayerName() {
		return playerName;
	}

	public void setPlayerName(List<String> playerName) {
		this.playerName = playerName;
	}

	public Ipl(String teamNname, String teamCaptain, List<String> playerName) {
		super();
		this.teamNname = teamNname;
		this.teamCaptain = teamCaptain;
		this.playerName = playerName;
		System.out.println("Thss");
	}

	public Ipl() {
		super();
		System.out.println("super");
	}

	@Override
	public String toString() {
		return "Ipl [teamNname=" + teamNname + ", teamCaptain=" + teamCaptain + ", playerName=" + playerName + "]";
	}
}
