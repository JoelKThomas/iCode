# O(nlogn) time | O(1) space
def twoNumberSumUsingSort(array, targetSum):
    array.sort()
    left = 0
    right = len(array) - 1
    while left < right:
        currentSum = array[left] + array[right]
        if targetSum == currentSum:
            return [array[left], array[right]]
        elif targetSum > currentSum:
            left += 1
        else:
            right -= 1
    return []


new_array = [3, 5, -4, 8, 11, 1, -1, 6]
print(twoNumberSumUsingSort(new_array, 10))
