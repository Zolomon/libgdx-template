package com.zolomon.libgdxtemplate.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.zolomon.libgdxtemplate.TemplateGame;

/**
 * User: beer01
 * Date: 2013-08-05
 * Time: 10:56
 */
public class DesktopLauncher {
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "Title";
        cfg.useGL20 = true;
        cfg.width = 800;
        cfg.height = 480;
        new LwjglApplication(new TemplateGame(), cfg);
    }
}
