a=str(input("enter string: ")
count=0
vowel="aeiouAEIOU"
for x in a:
    if x in vowel:
        count+=1
print("vowels in: ",a,"-->",count)
