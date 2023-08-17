# Code Challenge: Class 28

![Part1](<screenshotsSort/Screenshot 2023-08-16 at 5.33.41 PM.png>)
![Part2](<screenshotsSort/Screenshot 2023-08-16 at 5.33.59 PM.png>)
![Part3](<screenshotsSort/Screenshot 2023-08-16 at 5.34.23 PM.png>)
![Part4](<screenshotsSort/Screenshot 2023-08-16 at 5.34.44 PM.png>)
![Part 5](<screenshotsSort/Screenshot 2023-08-16 at 5.34.59 PM.png>)

## Additional Notes

Merge sort is one of those algorithms that uses pivots to set split the array into even arrays. In the beginning the pivot value is moved to the right side of the split array and the following conditions are checked.

- grab the largest value from left
- grab the smallest value from right
- swap the two values
- end if index position of left side is larger of left side

Once this happens the pivot will be in the correct location since all numbers to the left of pivot are smaller and all numbers to the right of pivot are larger.

This process will occur recursively until the array is sorted correctly from smallest to largest. 
