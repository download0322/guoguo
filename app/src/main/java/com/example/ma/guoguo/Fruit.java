package com.example.ma.guoguo;

public class Fruit {

	private String name;

	private String about;

	private int imageId;

	public Fruit(String name, int imageId, String about) {
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
