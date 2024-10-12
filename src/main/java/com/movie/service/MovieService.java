package com.movie.service;

import com.movie.impl.MovieDTO;

public interface MovieService {
	
	void insertMovie (MovieDTO mDTO);
	MovieDTO selectMovie (String mNo);
	void playMovie (MovieDTO mDTO, int Age);
	
}
