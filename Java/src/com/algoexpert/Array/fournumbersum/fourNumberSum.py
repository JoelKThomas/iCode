# Average: O(n^2) time | O(n^2) space - where n is the length of the input array
# Worst: O(n^3) time | O(n^2) space - where n is the length of the input array
def fourNumberSum(array, targetSum):
    quadruplets = []
    allPairSums = {}
    #leave the first element
    for i in range(1, len(array) - 1):
        for j in range(i + 1, len(array)):
            currentSum = array[i] + array[j]
            difference = targetSum - currentSum
            if difference in allPairSums:
                for pair in allPairSums[difference]:
                    quadruplets.append(pair + [array[i], array[j]])
        for k in range(0, i):
            currentSum = array[i] + array[k]
            if currentSum not in allPairSums:
                allPairSums[currentSum] = [[array[k], array[i]]]
            else:
                allPairSums[currentSum].append([array[k], array[i]])
    return quadruplets


new_array = [7, 6, 4, -1, 1, 2]
print(fourNumberSum(new_array, 16))
