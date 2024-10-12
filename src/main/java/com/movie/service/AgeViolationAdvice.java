package com.movie.service;

import org.aspectj.lang.JoinPoint;

// 영화 시청 등급 미달 시 실행
public class AgeViolationAdvice {
	
	public void ageViolationAdvice(JoinPoint jp, Exception exceptObj) {
//		String pointCutName = jp.getSignature().getName();
//		System.out.println("[ageViolationAdvice] PointCut : " + pointCutName);
		System.out.println("[나이 제한] " + exceptObj);
	}

}
