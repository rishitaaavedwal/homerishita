a=str(input("enter string: "))
count=0
small=0
caps=0
num=0
spc=0
for x in a:
    count+=1
    if x in "ABCDEFGHIJKLMNOPQRSTUVWXYZ":
        caps+=1
    elif x in "abcdefghijklmnopqrstuvwxyz":
        small+=1
    elif x in [1,2,3,4,5,6,7,8,9,0]:
        num+=1
    else
        spc+1
print("total characters in: ",a,"-->",count)
print("small letters: ",small)
print("capital letters: ",caps)
print("numbers: ",num);
print("special characters: ",spc)
