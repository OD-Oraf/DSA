nums = [2,7,11,15]
target = 9

def two_sum(nums, target):
    hashmap = {}

    for i in range(0, len(nums)):
        hashmap[nums[i]] = i

    for i in range(0, len(nums)):
        complement = target - nums[i]
        if complement in hashmap and hashmap[complement] != i:
            return [hashmap[complement], i]

print(two_sum(nums, target))