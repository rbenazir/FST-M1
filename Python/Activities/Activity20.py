import pandas as pd
df=pd.read_excel("sample.xlsx")
print("Number of rows and columns ",df.shape)
print("Emails ",df["Email"])
print("Sorted names in ascending order")
print(df.sort_values('FirstName'))