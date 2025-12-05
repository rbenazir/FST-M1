list1=[1,2,3,4,5,24,23,25,27]
list2=[6,7,8,9,0]
oddNumbers=[]
evenNumbers=[]
for i in list1:
    if i==0:
        continue
    elif i%2==0:
        continue
    else:
        oddNumbers.append(i)
for j in list2:
    if j==0:
        continue
    elif j%2!=0:
        continue
    else:
        evenNumbers.append(j)
list3=oddNumbers+evenNumbers
print(list3)