package com.movie.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.movie.impl.MovieDTO;

public class MoiveMain {

	public static void main(String[] args) {

		// #1. 설정파일을 이용하여 객체 생성
		ApplicationContext context = new GenericXmlApplicationContext("MovieSettings.xml");
		
		// #2. MovieService 객체 가져오기 (컨테이너로부터)
		MovieService mService = (MovieService) context.getBean("movieService");
		
		// #3. 영화 정보 가져오기
		MovieDTO mDTO_1 = (MovieDTO) context.getBean("movie1");
		MovieDTO mDTO_2 = (MovieDTO) context.getBean("movie2");
		MovieDTO mDTO_3 = (MovieDTO) context.getBean("movie3");
		
		// #4. 영화 정보 저장
		mService.insertMovie(mDTO_1);
		mService.insertMovie(mDTO_2);
		mService.insertMovie(mDTO_3);

//		System.out.println(mDTO_1);
//		System.out.println(mDTO_1.getClass().getName()); // 자료형 확인 com.movie.impl.MovieDTO
		
		// #5. 영화 선택
		MovieDTO selectedMovie = mService.selectMovie("m001");
		
//		System.out.println("selectedMovie : " + selectedMovie); // 리턴값 확인
		
		// #6. 영화 시작 (시청등급 확인)
		mService.playMovie(selectedMovie, 16); // 16세
//		mService.playMovie(selectedMovie, 10); // 10세
		
	}

}
