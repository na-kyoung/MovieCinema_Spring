package com.movie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.impl.MovieDAO;
import com.movie.impl.MovieDTO;

@Service("movieService")
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieDAO mDAO;

	@Override
	public void insertMovie(MovieDTO mDTO) {
		// 데이터 중복 체크 후 데이터 저장		
		if(mDAO.selectMovie(mDTO.getmNo()) == null) { // 데이터 없음 - 저장
			mDAO.insertMovie(mDTO);
		} else {						// 데이터 있음
			System.out.println("mNo 중복으로 저장할 수 없습니다.");
		}
	}

	@Override
	public MovieDTO selectMovie(String mNo) {		
		MovieDTO mDTO = mDAO.selectMovie(mNo);
		return mDTO;
	}

	@Override
	public void playMovie(MovieDTO mDTO, int Age) {
		int Rate = mDTO.getmRatings();
		
		if(Rate <= Age) { // 시청등급 <= 나이
			System.out.println("영화를 재생중입니다.");
		} else{ // 시청등급 > 나이
			System.out.println(Age + "세는 이 영화를 시청할 수 없습니다.");
			throw new IllegalArgumentException("해당 영화 시청 등급보다 나이가 적어 영화를 시청할 수 없습니다.");
		}
	}

}
