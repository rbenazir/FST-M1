import pandas as pd

df=pd.read_csv("usernamePassword.csv")
print(df["Usernames"])
print(df["Usernames"][1],"|",df["Passwords"][1])
print(df.sort_values('Usernames'))
print(df.sort_values('Passwords',ascending=False))
