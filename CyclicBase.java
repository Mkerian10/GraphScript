package graphscript;

import java.util.ArrayList;
import java.util.List;

public class CyclicBase<T extends Graph> {

    public CyclicBase(ArrayList<T> list){
        this.graphList = list;
    }

    private List<T> graphList = new ArrayList<>();

    public void cycle(){
        for(Graph g: graphList){
            if(g.hit()){
                g.traverse();
            }
        }
    }


}
