# Code Challenge: Class 12

## Stack and Queue Animal Shelter

### Feature Tasks

Create a class called AnimalShelter which holds only dogs and cats.
The shelter operates using a first-in, first-out approach.
Implement the following methods:
enqueue
Arguments: animal
animal can be either a dog or a cat object.
It must have a species property that is either "cat" or "dog"
It must have a name property that is a string.
dequeue
Arguments: pref
pref can be either "dog" or "cat"
Return: either a dog or a cat, based on preference.
If pref is not "dog" or "cat" then return null

## Solution

For this problem I decided to take a similar approach as the queue and stacks implementation but with adding a check to see if the Animal class was one that fit the check statements. If the animal species did not match what was needed then the iterator would continue to check until the species was found if not it will return the 'top' of the queue since it was first initialized to this. before the method returned the animal there was a helper method that would take look at the current stack and use the first in first out approach to rebuild the queue back to its original order.

## Whiteboard

![WhiteBoard Solution](<ScreenShots/Screenshot 2023-07-25 at 4.00.21 PM.png>)

- [x] Top-level README “Table of Contents” is updated
- [x] README for this challenge is complete - [X] Summary, Description, Approach & Efficiency, Solution - [X] Picture of whiteboard - [X] Link to code
- [x] Feature tasks for this challenge are completed
- [ ] Unit tests written and passing - [ ] “Happy Path” - Expected outcome - [ ] Expected failure - [X] Edge Case (if applicable/obvious)
