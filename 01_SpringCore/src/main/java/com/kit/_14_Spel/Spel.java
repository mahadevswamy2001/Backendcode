package com.kit._14_Spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// component is used to declare the Speal class as the bean

@Component("bean1")
public class Spel {
	@Value("#{99+50}")
	private int x;

	@Value("#{3>55?5:7}")
	private int y;

	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double pow;

	@Value("#{T(java.lang.Math).cbrt(27)}")
	private double cub;

	@Value("#{T(java.lang.Math).PI}")
	private double pi;

	@Value("#{3>5}")
	private boolean i;

	@Value("#{new java.lang.String('Kit')}")
	private String stringType;

	@Override
	public String toString() {
		return "Spel [x=" + x + ", y=" + y + ", pow=" + pow + ", cub=" + cub + ", pi=" + pi + ", i=" + i
				+ ", stringType=" + stringType + "]";
	}
}
