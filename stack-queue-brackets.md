# Code Challenge: Class 13

## Stack and queue Brackets 

### Feature Tasks

Write a function called validate brackets
Arguments: string
Return: boolean
representing whether or not the brackets in the string are balanced
There are 3 types of brackets:

Round Brackets : ()
Square Brackets : []
Curly Brackets : {}

## Solution

For this solution I decided to employ the use of an ArrayList, Switch statements, For Loop and many many variables (seen in pseudo code). My approach here was to count each bracket type in the string using a for loop and 'charAt' iterating through every single item. After that each iteration was checked against a switch statement that would update the appropriate variable. After that I would add each variable to the arraylist created and iterate through the list one more time. A counter variable was then created to start at 0 while for each loop added the value of each to the total counter lastly the return if modulo 2 returned 0 that would mean that the array is properly balance anything else would mean that the array was not balanced. edge cases would be to check if the array in the end was null then we would return false as no valid string was entered and a default in the case statement was added in the event the switch statement did not have a qualifying value meaning we read it displayed it to console but did not count it. 

## Whiteboard

![stack and queue brackets](<ScreenShots/Screenshot 2023-07-26 at 7.26.39 PM.png>)

- [x] Top-level README “Table of Contents” is updated
- [x] README for this challenge is complete - [X] Summary, Description, Approach & Efficiency, Solution - [X] Picture of whiteboard - [X] Link to code
- [x] Feature tasks for this challenge are completed
- [X] Unit tests written and passing - [ ] “Happy Path” - Expected outcome - [ ] Expected failure - [X] Edge Case (if applicable/obvious)
