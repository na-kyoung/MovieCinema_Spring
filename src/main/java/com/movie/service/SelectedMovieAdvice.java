package com.movie.service;

import com.movie.impl.MovieDTO;

// ������ ��ȭ�� ���
public class SelectedMovieAdvice {
	
	public void selectedMovieAdvice(Object returnObj) {
		MovieDTO mDTO = (MovieDTO) returnObj;
		System.out.println("������ ��ȭ�� [" + mDTO.getmName() + "] �Դϴ�.");
	}

}
