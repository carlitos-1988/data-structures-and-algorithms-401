# Breadth-First Traversal

## Feature Tasks

- Write a function called breadth first
- Arguments: tree
- Return: list of all values in the tree, in the order they were encountered

![Whiteboard Impl](<ScreenShots/Screenshot 2023-08-01 at 5.13.05 PM.png>)

## Approach & Efficiency

- Decided to use a queue for this approach. also utilized a Node with left and right values and lastly used an ArrayList to be able to hold variables that would be returned. The recursive method then took a Node as a parameter and the Arraylist. Before the recursive method was called a local queue was created and utilizing the tree.root set it to the first value of the queue. Once that occurred the recursive method was called to do the following. 1. check for case statement in this case if curr==null then if the node had a left or right they would be added to the queue then recursively calling the method again for the this time with the node argument of the popped node from the queue and passing the arrayList for further addition. Once the stack was done calling the return statement in each of the recursive calls would return the populated arraylist to be returned back by the method.

## Big O Notation

- Big O notation would be O(n) indicating that the search iterations would increase as the size of the queue increases as the queue would fully need to be processed before the recursive call can end.
