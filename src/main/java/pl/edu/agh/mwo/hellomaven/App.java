package pl.edu.agh.mwo.hellomaven;


import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;


/// Simple main application
public class App {


    static final int WIDTH = 120;
    static final int HEIGHT = 20;
    static final int RANDOM_NUMBER = 4;


    public static void main(String[] args) {

        IRender render = new Render();
        render.setPseudoCanvas(true);
        IContextBuilder builder = render.newBuilder();
        builder.width(App.WIDTH).height(App.HEIGHT);
        builder.element(new PseudoText("Hello World", false));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);
    }
    
    public int getRandomNumber() {
        // chosen by fair dice roll.
        // guaranteed to be random
        return App.RANDOM_NUMBER;
    }
}
