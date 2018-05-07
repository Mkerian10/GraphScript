package graphscript;

import org.tribot.api.input.Mouse;
import org.tribot.api2007.Player;
import org.tribot.api2007.types.RSTile;

import java.awt.*;

public class VertexExample implements Vertex{

    private Vertex nextVertex;
    private Vertex optionalVertex;

    public VertexExample(Vertex nextVertex, Vertex optionalVertex){
        this.nextVertex = nextVertex;
        this.optionalVertex = optionalVertex;
    }

    
    @Override
    public Vertex nextVertex() {
        if(true) //Can return different vertices depending on conditions
            return nextVertex;
        else
            return optionalVertex;
    }

    @Override
    public boolean shouldTerminate() {
        return new RSTile(-1,1).distanceTo(Player.getPosition()) < 6;
    }

    @Override
    public void execute() {
        Mouse.click(0);
    }

    @Override
    public boolean shouldAnticipate() {
        return new RSTile(-1,1).distanceTo(Player.getPosition()) < 16;
    }

    @Override
    public void anticipate() {
    Mouse.move(new Point(5, 25));
    }
}
