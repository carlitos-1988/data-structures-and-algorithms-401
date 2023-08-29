package graph;

import java.util.HashMap;
import java.util.*;
import java.util.List;

public class Graph<T> {


    private Map<T, List<T> > map = new HashMap<>();



    //vertex is another word for node
    public void addVertex(T t){
        map.put(t, new LinkedList<T>());
    }

    //edge connects two nodes together
    public void addEdge(T source,T destination, boolean bidirectional){

        //check to see if the source is not already in the map of type T of the key
        if(!map.containsKey(source)){
            addVertex(source);
        }

        //do the same check for the destination if it is not present then add it to the map along with a new linked list
        if (!map.containsKey(destination)) {
            addVertex(destination);
        }

        //get source which is of type LinkedList and add the destination to it.
        map.get(source).add(destination);

        //in the previous example source had the only info to store its destination in this check destination now has info for the source node
        if(bidirectional==true){
            map.get(destination).add(source);
        }
    }

    //bidirectional edge count just to know if you want to count edges once or twice
    public void getEdgeCount(boolean biDirectional){
        //count for the edges found;
        int count  = 0;
        for (T node: map.keySet()){
            count += map.get(node).size();
        }
        //if statement needed to not count edge count twice for ech nod/vertex
        if (biDirectional == true){
            count = count/2;
        }

        System.out.println("The graph has "+ count + " edges");
    }
    public void hasVertex(T s)
    {
        if (map.containsKey(s)) {
            System.out.println("The graph contains "
                    + s + " as a vertex.");
        }
        else {
            System.out.println("The graph does not contain "
                    + s + " as a vertex.");
        }
    }

    // This function gives whether an edge is present or not.
    public void hasEdge(T s, T d)
    {
        if (map.get(s).contains(d)) {
            System.out.println("The graph has an edge between "
                    + s + " and " + d + ".");
        }
        else {
            System.out.println("The graph has no edge between "
                    + s + " and " + d + ".");
        }
    }

    public List<T> breathFirst(){

        if (this.map.isEmpty()){
            return new ArrayList<>();
        }

        //this code gets the first vertex placed inside the hashmap
        T startVertex = map.keySet().iterator().next();

        List<T> visited = new ArrayList<>();
        Queue<T> queue = new LinkedList<>();

        queue.add(startVertex);
        visited.add(startVertex);

        while(!queue.isEmpty()){
            //this is the same as enqueue and dequeue but done in one go. it will get the top of the queue and remove it from the queue
            T currentNode = queue.poll();
            List<T> neighbors = map.get(currentNode);

            //check to see if the currentNode has any neighbors connected to it
            if (neighbors!= null){
                //to iterate each of the neighbors of the current node
                for(T neighbor:neighbors){
                    //checks to see if this node has been visited before
                    if(!visited.contains(neighbor)){
                        //add the neighbor to the end of the queue to be called on later
                        queue.add(neighbor);
                        //mark current neighbor as visited
                        visited.add(neighbor);
                    }
                }
            }
        }

        return visited;

    }






    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}
