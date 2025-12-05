fruitShop={
    "apple":14,
    "banana":10,
    "cherry":5,
    "plum":4
}
fruitRequestFromUser=input("Enter the fruit name you want to check ").lower()
if fruitRequestFromUser in fruitShop:
    print("Yes")
else:
    print("No")