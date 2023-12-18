# 위에서 아래로

n = int(input())

arr = []
for i in range(n):
    arr.append(int(input()))

arr = sorted(arr,reverse=True)


for i in range(n):
    print(arr[i],end=" ")
    
# 풀이에는 상관없지만 놓친부분 
# 애초에 for i in arr: print(i,end=" ")로 했어도 됨 <- 굳이 i라는 인덱스 X 