package com.movie.impl;

public class MovieDTO {
	private String mNo; // 영화 번호
	private String mName; // 영화 이름
	private String mDirector; // 영화 감독
	private int mRatings; //  영화 상영 등급
	
	public MovieDTO() {
		super();
	}
	public MovieDTO(String mNo, String mName, String mDirector, int mRatings) {
		super();
		this.mNo = mNo;
		this.mName = mName;
		this.mDirector = mDirector;
		this.mRatings = mRatings;
	}
	@Override
	public String toString() {
		return "MovieDTO [mNo=" + mNo + ", mName=" + mName + ", mDirector=" + mDirector + ", mRatings=" + mRatings
				+ "]";
	}
	
	public String getmNo() {
		return mNo;
	}
	public void setmNo(String mNo) {
		this.mNo = mNo;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmDirector() {
		return mDirector;
	}
	public void setmDirector(String mDirector) {
		this.mDirector = mDirector;
	}
	public int getmRatings() {
		return mRatings;
	}
	public void setmRatings(int mRatings) {
		this.mRatings = mRatings;
	}

}
