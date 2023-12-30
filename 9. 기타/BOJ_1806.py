# 부분합

n,s = map(int,input().split())
arr = list(map(int,input().split()))

start,end = 0,0
answer = n+1 # 절대 나올 수 없는 값 => 만족시키는 값이 없는 상황 고려하기 위함
interval_sum = 0

for start in range(n):
    # end를 가능한 만큼 이동시키기
    while interval_sum < s and end < n:
        interval_sum += arr[end]
        end += 1
    # 부분합이 m일 때 카운트 증가
    if interval_sum >= s:
        # 앞서 end가 +1 증가된 상태로 나오므로 end-start+1에서 +1 없어도됨
        answer = min(end-start,answer)
    interval_sum -= arr[start]

if answer == n+1 :
    answer = 0

print(answer)

# s 이상이 되는 것들 중에서 가장 짧은 것을 구해라

# 수열의 일부분 중 길이구하는 문제 => 투 포인터 떠올리기

# 첫번째 도전 : 시간 초과
# n,s = map(int,input().split())
# arr = list(map(int,input().split()))

# start,end = 0,0
# answer = s
# while(end<n):
#     sum = 0
#     for i in range(start,end+1):
#         sum +=arr[i]
    
#     if sum >= s :
#         answer = min(end-start+1,answer)
#         start +=1
#     else :
#         end +=1

# print(answer)

# 두번째 도전 : 성공
# while 문이 너무 길게 돌아서 그런가 싶었음 -> 이코테에서 접했던 방식으로 전환
# while문이 도는 과정을 중간에서 끊어주니 시간 초과 안남
