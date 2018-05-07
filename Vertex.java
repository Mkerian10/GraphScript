package graphscript;

public interface Vertex {

    /**
     * Called if shouldTerminate() is true
     * @return The next vertex in the graph
     */
    Vertex nextVertex();

    /**
     * This is called every cycle, this function us is used to know when to move to the next vertex
     *
     * @return True if this vertex is finished, false otherwise
     */
    boolean shouldTerminate();

    /**
     * The main execution of the vertex, this is what does stuff
     */
    void execute();

    /**
     * This is called if shouldTerminate() is false, this is done to predict the next function, but doesn't move
     * it to the next vertex in case of a failure or breakdown in game
     * @return True if the next vertex is about to come up, false otherwise
     *
     * This should only be used when it's likely you won't have to make any sort of actions until you get to the next
     * vertex
     */
    boolean shouldAnticipate();

    /**
     * The anticipation move, for example hovering the mouse over a tree or rock
     */
    void anticipate();


}
