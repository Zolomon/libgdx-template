package com.zolomon.libgdxtemplate;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.FPSLogger;
import com.zolomon.libgdxtemplate.screens.ExampleScreen;

/**
 * User: beer01
 * Date: 2013-08-05
 * Time: 10:55
 */
public class TemplateGame extends Game {
    public static final boolean DEV_MODE = false;
    public static final String LOG = TemplateGame.class.getSimpleName();
    private FPSLogger fpsLogger;

    @Override
    public void create() {
        Gdx.app.log( TemplateGame.LOG, "Creating game on " + Gdx.app.getType() );

        fpsLogger = new FPSLogger();

        setScreen(getExampleScreen());
    }

    @Override
    public void render() {
        super.render();

        fpsLogger.log();
    }

    @Override
    public void pause() {
        super.pause();
        Gdx.app.log(TemplateGame.LOG, "Pausing game");
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
        Gdx.app.log( TemplateGame.LOG, "Resizing game to: " + width + " x " + height );
    }

    @Override
    public void dispose() {
        super.dispose();

        Gdx.app.log(TemplateGame.LOG, "Disposing game");
    }

    public Screen getExampleScreen() {
        return new ExampleScreen(this);
    }
}
