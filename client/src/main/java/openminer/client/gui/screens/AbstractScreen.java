package openminer.client.gui.screens;

import jpize.graphics.font.BitmapFont;
import jpize.graphics.font.FontLoader;
import jpize.io.context.Screen;
import jpize.util.Disposable;

public abstract class AbstractScreen implements Screen, Disposable{

    protected final ScreenManager screenManager;
    protected final BitmapFont font;

    public AbstractScreen(ScreenManager screenManager){
        this.screenManager = screenManager;

        this.font = FontLoader.getDefault();
        this.font.setScale(0.75F);
    }

    public void setScreen(String name){
        screenManager.setScreen(name);
    }

    @Override
    public void dispose(){ }

}
