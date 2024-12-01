# Container-with-Most-Water
Given an array height where each element represents the height of a vertical line on a coordinate plane, find two lines such that they, along with the x-axis, form a container that holds the most water. Return the maximum amount of water the container can store.

Example:
height = [1, 8, 6, 2, 5, 4, 8, 3, 7]

Output:
49
Explanation:
The lines at indices 1 and 8 (heights 8 and 7) form a container with the largest area:

Area = min(8, 7) * (8 - 1) = 7 * 7 = 49

Constraints:
The array will have at least 2 elements.
Each height is a non-negative integer.

Output:
For the input height = [1, 8, 6, 2, 5, 4, 8, 3, 7]:

Maximum Water Area: 49

Explanation of the Approach:
Two-Pointer Technique: Start with one pointer at the beginning (left) and another at the end (right).
Calculate Area: At each step, calculate the container's area using the formula:
Area = min(height[left], height[right]) * (right - left)
Update Maximum: Keep track of the maximum area encountered.
Move the Pointer: Move the pointer pointing to the smaller height, as the width decreases with each move, and a taller line might yield a larger area.
Terminate: When the two pointers meet, return the maximum area found.


Time Complexity:
O(n): Each element is visited at most once by the two pointers.
Space Complexity:
O(1): No extra space is used beyond variables.
