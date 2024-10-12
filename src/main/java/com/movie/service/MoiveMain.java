package com.movie.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.movie.impl.MovieDTO;

public class MoiveMain {

	public static void main(String[] args) {

		// #1. ���������� �̿��Ͽ� ��ü ����
		ApplicationContext context = new GenericXmlApplicationContext("MovieSettings.xml");
		
		// #2. MovieService ��ü �������� (�����̳ʷκ���)
		MovieService mService = (MovieService) context.getBean("movieService");
		
		// #3. ��ȭ ���� ��������
		MovieDTO mDTO_1 = (MovieDTO) context.getBean("movie1");
		MovieDTO mDTO_2 = (MovieDTO) context.getBean("movie2");
		MovieDTO mDTO_3 = (MovieDTO) context.getBean("movie3");
		
		// #4. ��ȭ ���� ����
		mService.insertMovie(mDTO_1);
		mService.insertMovie(mDTO_2);
		mService.insertMovie(mDTO_3);

//		System.out.println(mDTO_1);
//		System.out.println(mDTO_1.getClass().getName()); // �ڷ��� Ȯ�� com.movie.impl.MovieDTO
		
		// #5. ��ȭ ����
		MovieDTO selectedMovie = mService.selectMovie("m001");
		
//		System.out.println("selectedMovie : " + selectedMovie); // ���ϰ� Ȯ��
		
		// #6. ��ȭ ���� (��û��� Ȯ��)
		mService.playMovie(selectedMovie, 16); // 16��
//		mService.playMovie(selectedMovie, 10); // 10��
		
	}

}
