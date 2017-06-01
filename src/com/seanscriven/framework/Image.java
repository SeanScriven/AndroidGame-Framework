package com.seanscriven.framework;

import com.seanscriven.framework.Graphics.ImageFormat;

public interface Image {

	public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
