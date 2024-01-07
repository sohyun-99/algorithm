n,k = map(int,input().split())
A = list(map(int,input().split()))
B = list(map(int,input().split()))

A.sort() # 오름차순
B.sort(reverse=True) # 내림 차순

# A B 의 앞의 것끼리 바꿔나가야함
for i in range(k):
    A[i],B[i]= B[i],A[i]

print(sum(A))

# 여기서 기억해야하는 것 : B.sort(reverse=True) 정렬 방식 잊지 않기