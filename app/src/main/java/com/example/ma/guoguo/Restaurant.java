package com.example.ma.guoguo;

public class Restaurant {

	private String name;

	private String about;

	private int imageId;

	public Restaurant(String name, int imageId, String about) {
		this.name = name;
		this.imageId = imageId;
		this.about = about;
	}

	public String getName() {
		return name;
	}

	public String getAbout(){
		return about;
	}

	public int getImageId() {
		return imageId;
	}

}
