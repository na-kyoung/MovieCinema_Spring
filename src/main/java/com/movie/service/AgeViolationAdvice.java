package com.movie.service;

import org.aspectj.lang.JoinPoint;

// ��ȭ ��û ��� �̴� �� ����
public class AgeViolationAdvice {
	
	public void ageViolationAdvice(JoinPoint jp, Exception exceptObj) {
//		String pointCutName = jp.getSignature().getName();
//		System.out.println("[ageViolationAdvice] PointCut : " + pointCutName);
		System.out.println("[���� ����] " + exceptObj);
	}

}
