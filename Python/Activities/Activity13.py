def sum(list):
    sum=0
    for i in list:
        sum+=int(i)
    return sum
inputList=input("Enter a list of numbers separated by a comma ").split(",")
print(sum(inputList))