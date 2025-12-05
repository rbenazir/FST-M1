tuple_list=tuple(input("Enter a list of numbers separated by a comma ").split(","))
for i in tuple_list:
    if(int(i)%5==0):
        print(f"{i} divisible by 5")