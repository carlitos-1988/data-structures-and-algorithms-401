# Code Challenge Class 32

## Feature Tasks

Write a function called tree_intersection that takes two binary trees as parameters.
Using your Hashmap implementation as a part of your algorithm, return a set of values found in both trees.


### Code generated 

code can be found in sorting->insertion->app->src->main->java->tree

test cases are in sorting->insertion->app->src->test->java->insertion


### Approach 

- for this assignment the the approach was to separate responsibilities as much as possible. A TreeNode, Tree, and ValuesFinder class was implemented. The tree node contained all of the same values as a normal node in a tree to include its value, left and right reference nodes. The Tree class only contained the root node with a normal default constructor.
- Lastly the Values Finder class was what did the heavy lifting for the tree and tree nodes preciously created. This class had the following methods inside of it:
  - findCommonValues() - 
  - (1)This only public method first checked if the root of either of the trees passed in was null, if it is it will throw an illegal argument exception, then a hashSet for storing all unique values is created. the new hashset is then populated with items by calling the preorder traversal method.
  - (3) now that the Hashset has been populated the next step is to use the new hashset table created and use the last method to find the shared values from findCommonValuesPreOrder() method.
  - (4) finally the sharedValues ArrayList is returned 
  - preOrderTraversal(): (2)preorder traversal is one that will continue until its case statement of the passed in node is null. when it is not null it will call itself for both the left and right nodes until the break statement is reached before a recustion call the method will add the current nodes value to the hashset. 
  - findCommonValuesPreOrder()
  - (4) this method is a recursive method where its case statement is when node passed in equals null Once that is done the logic block will check if the value of the current node is in the Hashset of the left sided tree if it is then the currrent value is added to the commonValues Array list. This will also happen until the nodes are null.