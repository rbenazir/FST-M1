inputFromUser=int(input("Enter the number of fibonacci numbers that you want "))
def fibonacciNumbers(inputFromUser):
    if(inputFromUser<=1):
        return inputFromUser
    else:
        return (fibonacciNumbers(inputFromUser-1) + fibonacciNumbers(inputFromUser-2))
print("Fibonacci sequence")
for i in range(inputFromUser):
    print(fibonacciNumbers(i))