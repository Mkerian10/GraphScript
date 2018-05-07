package graphscript;

public abstract class Graph{

    public Graph(final Vertex initialVertex){
        this.currentVertex = initialVertex;
    }

    private Vertex currentVertex;

    /**
     *
     * @return True if this graph's conditions were satisfied, false otherwise
     */
    public abstract boolean hit();

    public void traverse(){

        if(currentVertex.shouldTerminate()){
            currentVertex = currentVertex.nextVertex();
        }else{
            currentVertex.execute();
            if(currentVertex.shouldAnticipate()){
                currentVertex.nextVertex().anticipate();
            }
        }
    }

}
