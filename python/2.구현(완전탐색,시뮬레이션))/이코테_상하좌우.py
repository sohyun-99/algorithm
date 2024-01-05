import sys

n = int(input()) # 공간의 크기
plans = input().split() # 계획 배열로 입력 받음

# (x,y) 기준
dx = [0,0,1,-1]
dy = [1,-1,0,0]
types = ['R','L','D','U']

# 시작 (1,1)
x,y=1,1

for plan in plans :
    for i in range(len(types)) :
        if plan == types[i] :
            nx = x+dx[i]
            ny = y+dy[i]
    if nx<1 or ny<1 or nx>n or ny>n :
        continue
    x=nx
    y=ny

print(x,y)