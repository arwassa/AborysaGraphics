package com.Aborysa.Graphics;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
	
public class Drawer {
	//This class will organize drawing
	private static boolean bufferDraw = false;
	private static boolean canvasDraw = false;
	private static boolean imageDraw = false;
	private static DrawingBuffer bufferTarget = null;
	private static BufferedImage imageTarget = null;
	private static Canvas canvasTarget = null;
	private static int depth = 0;
	private static BlendMode blendMode;
	private static Color color;
	public static void setTarget(Canvas canvas){
		color = new Color(0,0,0,0);
	}
	
	public static void setTarget(DrawingBuffer buffer){
		
	}
	public static void drawImage(int x, int y, BufferedImage image){
		
	}
	public static void drawImage(int x, int y, Image image){
		
	}
	public static void drawImage(int x, int y, DrawingBuffer buffer){
		int type = buffer.getType();
		int width = buffer.getWidth();
		imageTarget.getData();
	}
	public static void setDepth(int depth){
		Drawer.depth = depth;
	}
	public void setBlendMode(BlendMode mode){
		blendMode = mode; 
	}
}
