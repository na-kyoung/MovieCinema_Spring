package com.movie.service;

import com.movie.impl.MovieDTO;

// 선택한 영화명 출력
public class SelectedMovieAdvice {
	
	public void selectedMovieAdvice(Object returnObj) {
		MovieDTO mDTO = (MovieDTO) returnObj;
		System.out.println("선택한 영화는 [" + mDTO.getmName() + "] 입니다.");
	}

}
