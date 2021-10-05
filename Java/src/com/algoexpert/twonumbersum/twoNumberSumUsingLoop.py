# O(n^2) time | O(N) space
def twoNumberSumUsingLoop(array, targetSum):
    for i in range(len(array) - 1):
        first = array[i]
        for j in range(i + 1, len(array)):
            second = array[j]
            if first + second == targetSum:
                return [first, second]
    return []


new_array = [3, 5, -4, 8, 11, 1, -1, 6]
print(twoNumberSumUsingLoop(new_array, 10))

