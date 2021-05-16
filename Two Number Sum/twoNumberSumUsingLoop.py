def twoNumberSumUsingLoop(array, targetSum):
    for i in range(len(array) - 1):
        first = array[i]
        for j in range(i + 1, len(array)):
            second = array[j]
            if first + second == targetSum:
                return [first, second]
    return []


new_array = [1, 2, 3, 4]
print(twoNumberSumUsingLoop(new_array, 6))

