# Find the first repeated word in a book

Method to be able to return the first repeated word in an input array. 

## Whiteboard Process

https://juancarlosolmedo148958.invisionapp.com/freehand/Code-Challenges-TN0yeXmct

![Part 1](<screenshotsSort/Screenshot 2023-08-22 at 12.12.06 AM.png>)
![Part 2](<screenshotsSort/Screenshot 2023-08-22 at 12.12.26 AM.png>)


## Approach & Efficiency

Approach for this was to use a stream method for the input string. before the stream could be called the following needed to be created. 

- String[] words = input.split("\\W+)
- Map<String, Integer> wordCountMap

Once the two were created an Optional<String.> firstRepeated word variable was created and Arrays.stream(words) was started

Once started the stream would:

- collect the non empty values of the array 
- lowercase all values in the array 
- peek (non destructive) the word into the wordCount hashMap by either adding to the hashmap or adding to the Integer counter with wordCountMap.get(word,0) +1 
- one more filter for each of the items in the hashmap where Integer was greater than 1
- lastly getFirst after all have been counted
- The stream was then called in the return statement with an .orElse("no repeating items") in the event there where no repeating items. 



## Solution

have not implemented solution 