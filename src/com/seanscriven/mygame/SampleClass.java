package com.seanscriven.mygame;

import com.seanscriven.framework.Screen;
import com.seanscriven.framework.implementation.AndroidGame;

public class SampleClass extends AndroidGame{

	@Override
    public Screen getInitScreen() {
        return new LoadingScreen(this); 
    }
	
	@Override
	public void onBackPressed() {
		getCurrentScreen().backButton();
	}
	
}
