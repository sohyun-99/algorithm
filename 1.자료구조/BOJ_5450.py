# AC

# Sol : 처음 걸 버린다 -> 선입 선출 ->  R : dequeue 

from collections import deque

t = int(input())

for _ in range(t):
    # p 배열 입력
    p = input()
    n = int(input())
    arr = input()
    arr_q = deque(arr[1:-1].split(",")) # ,기준으로 문자열 분리 / 배열은 인덱스 1번째 부터 마지막전까지만 출력 => 1 2 3 4 만 남게됨

    count_r = 0

    if n == 0 :
        print("error")
    else : 
        for i in range(len(p)):
            if p[i]=='D':
                if count_r %2 != 0:
                    arr_q.reverse() # 큐 역으로 순서 바꿈

                if len(arr_q)==0:
                    print("error")
                    break
                else : 
                    arr_q.popleft() # 큐 맨처음꺼 버림
                count_r=0
            elif p[i]=='R':
                count_r +=1
                
        print("["+ ",".join(arr_q)+ "]")

# 결국은 D를 기준점으로 잡고 
# D가 나왔을 때 앞서 나온 R이 홀수 일때만 바꿔준 후 삭제
# R이 짝수라면 그냥 그대로 삭제   

    




