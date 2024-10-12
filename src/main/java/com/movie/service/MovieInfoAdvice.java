package com.movie.service;

import org.aspectj.lang.ProceedingJoinPoint;

// 영화 등급 통과 후 영화 시작 및 종료
public class MovieInfoAdvice {
	
	public Object movieInfoAdvice(ProceedingJoinPoint pjp) throws Throwable {
			System.out.println("영화를 시작합니다.");
			
			// 비즈니스 로직 실행 (playMovie)
			Object returnObj = pjp.proceed();
			
			System.out.println("영화를 마칩니다. 감사합니다.");
			
			return returnObj;
	}

}
