package com.kit._07_BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Chicken implements InitializingBean, DisposableBean {
	private double cost;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
		System.out.println("Setting the cost=....!");
	}

	@Override
	public String toString() {
		return "Chicken [cost=" + cost + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Collecting the Prepared Chicke...!");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("We ate the Chicken...!");
	}

	
}
