while True:
   user1=input("Enter your name player 1 ")
   user2=input("Enter your name player 2 ")
   user1Choice=input(f"{user1}, please enter your choice for rock paper scissor ").lower();
   user2Choice=input(f"{user2}, please enter your choice for rock paper scissor ").lower();
   if(user1Choice==user2Choice):
      print("It's a tie")
   elif(user1Choice=="rock"):
      if(user2Choice=="scissor"):
          print("rock wins")
      else:
          print("paper wins")
   elif user1Choice=="paper":
        if(user2Choice=="rock"):
            print("paper wins")
        else:
            print("scissor wins")
   elif(user1Choice=="scissor"):
        if(user2Choice=="paper"):
            print("scissor wins")
        else:
            print("rock wins")
   else:
       print("please enter a valid input")

   userWish=input("Do you wanna play again? Yes/No ").lower();
   if userWish=="yes":
       pass
   elif userWish=="no":
       raise SystemExit
   else:
       print("Enter a valid input")
       raise SystemExit