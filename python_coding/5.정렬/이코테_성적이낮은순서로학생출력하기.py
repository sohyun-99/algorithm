n = int(input())
arr = []
for i in range(n):
    name,score = input().rstrip().split()
    arr.append((name,int(score)))

arr = sorted(arr,key=lambda x:x[1]) # **

for i in arr:
    print(i[0],end=" ")


# 람다식 정리 !!!!!!!!!!!
# 특정한 기능을 수행하는 함수를 한 줄에 작성할 수 있음