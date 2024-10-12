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
		// ������ �ߺ� üũ �� ������ ����		
		if(mDAO.selectMovie(mDTO.getmNo()) == null) { // ������ ���� - ����
			mDAO.insertMovie(mDTO);
		} else {						// ������ ����
			System.out.println("mNo �ߺ����� ������ �� �����ϴ�.");
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
		
		if(Rate <= Age) { // ��û��� <= ����
			System.out.println("��ȭ�� ������Դϴ�.");
		} else{ // ��û��� > ����
			System.out.println(Age + "���� �� ��ȭ�� ��û�� �� �����ϴ�.");
			throw new IllegalArgumentException("�ش� ��ȭ ��û ��޺��� ���̰� ���� ��ȭ�� ��û�� �� �����ϴ�.");
		}
	}

}
