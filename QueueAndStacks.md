# Implement Queue using two Stacks 


## Feature Tasks  

Create a new class called pseudo queue.
Do not use an existing Queue.
Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below),
Internally, utilize 2 Stack instances to create and manage the queue
Methods:
enqueue
Arguments: value
Inserts a value into the PseudoQueue, using a first-in, first-out approach.
dequeue
Arguments: none
Extracts a value from the PseudoQueue, using a first-in, first-out approach

## Summary 

## Approach 

for this approach I understood that stacks work by first in a last in first out manner. I then realized that the correct order for this would be to create a stack that follows this behavior and then use the other stack that will mimic the first in first out behavior.

Once StackA had the correct ordering I developed a helper methods that would insert a Node after the top value of the stack keeping the current order as the nodes are added this new stack is the inverse of stack A 

Once that is done the Pop method will take action against StackB by first creating a temporaty node and then setting the current top node to next. Once this was done the temporary node will be returned 

I am not sure if this is the correct implementation but it is the most accurate I can think of at the time. 


## Whiteboard
![Queue Using Two Stacks](<ScreenShots/Screenshot 2023-07-24 at 5.17.48 PM.png>)



 - [X] Top-level README “Table of Contents” is updated
 - [X] README for this challenge is complete
       - [X] Summary, Description, Approach & Efficiency, Solution
       - [X] Picture of whiteboard
       - [X] Link to code
 - [X] Feature tasks for this challenge are completed
 - [ ] Unit tests written and passing
       - [ ] “Happy Path” - Expected outcome
       - [ ] Expected failure
       - [ ] Edge Case (if applicable/obvious)