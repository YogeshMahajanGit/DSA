# This file contain an simple example of LS;

def linear_search(list,target):

    for i in range(0, len(list)):
        if list[i] == target:
            return i
    return None

def verify(index):
    if index is not None:
        print("Target found at index: ", index)
    else:
        print("Target not found in List")

numbers  = [1,2,3,4,5,6,7,8]

result = linear_search(numbers, 12)
verify(result)

result = linear_search(numbers, 3)
verify(result)