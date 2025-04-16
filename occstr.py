a=str(input("enter string: "))
char=str(input("enter character: "))
count=0
for x in a:
    if x==char:
        count+=1
print("occurence of ",char," : ",count)
