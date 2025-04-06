package pl.edu.agh.mwo.hellomaven;


import com.indvd00m.ascii.render.Render;
import com.indvd00m.ascii.render.api.ICanvas;
import com.indvd00m.ascii.render.api.IContextBuilder;
import com.indvd00m.ascii.render.api.IRender;
import com.indvd00m.ascii.render.elements.PseudoText;


/**
 * Simple main application
 */
public class App {

    public static void main(String[] args) {


        IRender render = new Render();
        render.setPseudoCanvas(true);
        IContextBuilder builder = render.newBuilder();
        builder.width(120).height(20);
        builder.element(new PseudoText("Hello World", false));
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);


//        System.out.println("Hello World!");
    }
    
    public int getRandomNumber() {
        // chosen by fair dice roll.
        // guaranteed to be random
        return 4;
    }
}
