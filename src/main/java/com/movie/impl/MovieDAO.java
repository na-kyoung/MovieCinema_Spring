package com.movie.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service("mDAO")
public class MovieDAO {
	
	private Map<String, MovieDTO> movieDB = new HashMap<String, MovieDTO>();
	
	// 데이터 저장
	public void insertMovie(MovieDTO mDTO) {
//		System.out.println("[DAO - insertMovie] mDTO : " + mDTO);
		movieDB.put(mDTO.getmNo(), mDTO);
	}
	
	// 데이터 선택
	public MovieDTO selectMovie(String mNo) {
//		System.out.println("[DAO - selectMovie] mNo : " + mNo);
		return movieDB.get(mNo);
	}

}
