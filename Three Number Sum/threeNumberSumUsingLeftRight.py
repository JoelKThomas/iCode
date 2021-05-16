# O(N^2) time | O(N) space
def threeNumberSumUsingLeftRight(array, targetSum):
    array.sort()
    triplets = []
    for i in range(len(array) - 2):
        left = i + 1
        right = len(array) - 1
        while left < right:
            currentSum = array[i] + array[left] + array[right]
            if targetSum == currentSum:
                triplets.append([array[i], array[left], array[right]])
                left += 1
                right -= 1
            elif targetSum > currentSum:
                left += 1
            else:
                right -= 1
    return triplets


new_array = [12, 3, 1, 2, -6, 5, -8, 6]
print(threeNumberSumUsingLeftRight(new_array, 0))
