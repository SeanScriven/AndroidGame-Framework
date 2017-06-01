package com.seanscriven.mygame;

import com.seanscriven.framework.Game;
import com.seanscriven.framework.Graphics;
import com.seanscriven.framework.Graphics.ImageFormat;
import com.seanscriven.framework.Screen;

public class LoadingScreen extends Screen{

	public LoadingScreen(Game game) {
        super(game);
    }


    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.menu = g.newImage("menu.jpg", ImageFormat.RGB565);
        Assets.click = game.getAudio().createSound("explode.ogg");
        
        game.setScreen(new MainMenuScreen(game));
    }


    @Override
    public void paint(float deltaTime) {

    }


    @Override
    public void pause() {

    }


    @Override
    public void resume() {

    }


    @Override
    public void dispose() {

    }


    @Override
    public void backButton() {

    }
}
