package com.zolomon.libgdxtemplate.screens;

import com.badlogic.gdx.Gdx;
import com.zolomon.libgdxtemplate.TemplateGame;

/**
 * User: beer01
 * Date: 2013-08-05
 * Time: 11:05
 */
public class ExampleScreen extends AbstractScreen {

    public ExampleScreen(TemplateGame game) {
        super(game);
    }

    @Override
    public void show() {
        super.show();

        Gdx.app.log(TemplateGame.LOG, "Showing ExampleScreen");
    }
}
