package com.example.dmeo.services;

import java.util.key;
import java.util.Date;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;

@Service
public class JWTServiesImpl {
	private String genrateToken(UserDetails userDetails) {
		return Jwts.builder().setSubject(userDetails.getUsername()).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 24))

				.signWith(getsignkey().signatureAlgerithm.HS256).compact();
	}

	private key getsignature() {
		byte[] key=Detector
	}
}
