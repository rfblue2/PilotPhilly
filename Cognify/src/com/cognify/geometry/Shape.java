package com.cognify.geometry;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

public class Shape {
	
	int posX, posY;
	int dir;
	COLOR c;
	String imgSrc;
	Bitmap bmp;
	boolean hole;//true if it is a hole
	
	public enum DIR	{UP, DOWN, LEFT, RIGHT};
	public enum SHAPE {RECTANGLE, CIRCLE, TRIANGLE_RIGHT, TRIANGLE_EQU,
		ARROW, HEXAGON, OVAL, PENTAGON, RHOMBUS, SQUARE, STAR};
	public enum COLOR {PURPLE, GREEN, RED, YELLOW, BLUE};
	
	public Shape(SHAPE shape, int x, int y, COLOR c, boolean hole)	{
		this.hole = hole;
		this.c = c;
		
		switch(shape)	{
		case RECTANGLE:
			imgSrc = "rectangle.png";
			break;
		case CIRCLE:
			imgSrc = "circle.png";
			break;
		case TRIANGLE_RIGHT:
			imgSrc = "triangle_right.png";
			break;
		case TRIANGLE_EQU:
			imgSrc = "triangle_equal.png";
			break;
		case ARROW:
			imgSrc = "arrow.png";
			break;
		case HEXAGON:
			imgSrc = "hexagon.png";
			break;
		case OVAL:
			imgSrc = "oval.png";
			break;
		case PENTAGON:
			imgSrc = "pentagon.png";
			break;
		case RHOMBUS:
			imgSrc = "rhombus.png";
			break;
		case SQUARE:
			imgSrc = "square.png";
			break;
		case STAR:
			imgSrc = "star.png";
			break;
		}
		
		bmp = BitmapFactory.decodeFile(imgSrc);
	}
	
	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public COLOR getC() {
		return c;
	}

	public void setC(COLOR c) {
		this.c = c;
	}

	public String getImgSrc() {
		return imgSrc;
	}

	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}

	public boolean isHole() {
		return hole;
	}

	public void setHole(boolean hole) {
		this.hole = hole;
	}
	
}


