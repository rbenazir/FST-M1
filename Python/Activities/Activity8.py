inputFromUser=input("Enter a list of numbers separated by a comma ").split(",")
if(inputFromUser[0]==inputFromUser[len(inputFromUser)-1]):
    print("First and last numbers are same")
else:
    print("First and last numbers are not same")