package com.movie.service;

import org.aspectj.lang.ProceedingJoinPoint;

// ��ȭ ��� ��� �� ��ȭ ���� �� ����
public class MovieInfoAdvice {
	
	public Object movieInfoAdvice(ProceedingJoinPoint pjp) throws Throwable {
			System.out.println("��ȭ�� �����մϴ�.");
			
			// ����Ͻ� ���� ���� (playMovie)
			Object returnObj = pjp.proceed();
			
			System.out.println("��ȭ�� ��Ĩ�ϴ�. �����մϴ�.");
			
			return returnObj;
	}

}
