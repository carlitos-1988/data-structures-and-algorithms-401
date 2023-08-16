# Code Challenge: Class 27

## Screenshots!

[Part 1](<screenshotsSort/Screenshot 2023-08-15 at 5.36.22 PM.png>)
![Part 2](<screenshotsSort/Screenshot 2023-08-15 at 5.36.38 PM.png>)
![Part 3](<screenshotsSort/Screenshot 2023-08-15 at 5.36.57 PM.png>)
![Part 4](<screenshotsSort/Screenshot 2023-08-15 at 5.37.18 PM.png>)

### Additional notes

- Merge sort is one that takes in an array of sortable elements and splits it up until the original array has an event amount of values in the array in this case done by splitting the array by 2 and checking that the smallest array is no greater than 1 in index position leaving index 0 and 1. Once the smallest array is made with two elements the merge function creates three variables one to track index of left right and array of the original passed in array. In this Merge function items are merged together once i the index of the left side are equals. Once this is done the remaining values are pushed to the right. In any other event the remaining values are sent to the left to compare the new left with the right since it is the highest number at the time. This happens over and over again until the entire array is sorted then returned for that subset of arrays then the Merge function returns with the updated array and again called with the right side of the array to be sorted in the same manner. 