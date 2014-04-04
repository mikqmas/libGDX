package com.mikqmas.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.mikqmas.GameWorld.GameWorld;
import com.mikqmas.GameWorld.GameRenderer;
import com.mikqmas.ZBHelpers.InputHandler;

public class GameScreen implements Screen {

	private GameWorld world;
	private GameRenderer renderer;

	public GameScreen() {
		float screenWidth = Gdx.graphics.getWidth();
		float screenHeight = Gdx.graphics.getHeight();
		float gameWidth = 136;
		float gameHeight = screenHeight / (screenWidth/gameWidth);
		
		int midPointY = (int) (gameHeight/2);
		
		world = new GameWorld(midPointY); // init world
		renderer = new GameRenderer(world); //init renderer
		
		Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
	}

	@Override
	public void render(float delta) {
		System.out.println(1/delta);
		world.update(delta);
		renderer.render();
		
	}

	@Override
	public void resize(int width, int height) {
		System.out.println("GameScreen - resizing");
	}

	@Override
	public void show() {
		System.out.println("GameScreen - show called");
	}

	@Override
	public void hide() {
		System.out.println("GameScreen - hide called");
	}

	@Override
	public void pause() {
		System.out.println("GameScreen - pause called");
	}

	@Override
	public void resume() {
		System.out.println("GameScreen - resume called");
	}

	@Override
	public void dispose() {
		// Leave blank
	}

}