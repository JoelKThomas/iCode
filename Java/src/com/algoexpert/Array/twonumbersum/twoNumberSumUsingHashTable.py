# O(N) time | O(N) space
def twoNumberSumUsingHashTable(array, targetSum):
    nums = {}
    for num in array:
        potentialMatch = targetSum - num
        if potentialMatch in nums:
            return [num, potentialMatch]
        else:
            nums[num] = True
    return []


new_array = [3, 5, -4, 8, 11, 1, -1, 6]
print(twoNumberSumUsingHashTable(new_array, 10))
