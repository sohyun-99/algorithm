# 투포인터

# 리스트에 순차적으로 접근해야할 때 두 개의 점의 위치 기록하면서 처리
# 시작점과 끝점 2개로 데이터의 범위를 표현


# Question
# N개의 자연수 => 합이 M인 부분 연속 수열의 개수 구하기

# 투포인터 알고리즘
# 1. 시작점과 끝점은 첫번째 원소의 인덱스를 가리킨다
# 2. 부분합이 m이면 카운트
# 3. 부분합 < M이면 end+1
# 4. 부분합 >=M 이면 start+1
# 5. 2~4반복

n,m = map(int,input().split())
arr = list(map(int,input().split()))

start,end = 0,0
count = 0


# 내가 작성한 코드 
while(end<n):
    print(count,start,end)
    sum = 0
    for i in range(start,end+1):
        sum+=arr[i]
    print(sum,m)
    if sum < m :
        end+=1
    elif sum > m:
        start+=1
    else :
        count+=1
        end+=1
        
print(count)
# 1703823549.674377

# 이코테 풀이
# n = 5 # 데이터의 개수 N
# m = 5 # 찾고자 하는 부분합 M
# data = [1, 2, 3, 2, 5] # 전체 수열

# count = 0
# interval_sum = 0
# end = 0

# # start를 차례대로 증가시키며 반복
# for start in range(n):
#     # end를 가능한 만큼 이동시키기
#     while interval_sum < m and end < n:
#         interval_sum += data[end]
#         end += 1
#     # 부분합이 m일 때 카운트 증가
#     if interval_sum == m:
#         count += 1
#     interval_sum -= data[start]

# print(count)

# 둘의 차이 : 나는 합 기준 , 풀이는 start기준으로 찾기
#           시간은 거의 같게 나타남


# 소요 실행시간 측정
# # 시작시간
# import time
# start = time.time()

# do_something()

# # 종료시간
# end = time.time()

# print(end - start)

# # 10.003219842910767