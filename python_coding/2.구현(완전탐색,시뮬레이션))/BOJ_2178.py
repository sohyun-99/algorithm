# 미로 탐색

# 1 = 이동할 수 있는 칸 
# 0 = 이동할 수 없는 칸

# (1,1)에서 출발 -> (n,M)
# 지나야하는 최소 칸 수

import sys
from collections import deque

arr=[]

n, m= map(int, input().split())
for _ in range(n):
  arr.append(list(map(int, input())))

x=0
y=0


dx = [-1, 1, 0, 0] 
dy = [0, 0, -1, 1]
# 왼, 오 , 위, 아래
# dx = [0,0,-1,1]
# dy = [-1,1,0,0]
# moves_type = ['L','R','U','D']

queue = deque()
queue.append((x, y))
while queue : 
    x, y = queue.popleft()

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        # 공간을 벗어나는 경우 넘어간다
        if nx < 0 or nx >= n or ny < 0 or ny >= n:
            continue

        if arr[nx][ny] == 0 : 
            continue

        if arr[nx][ny] == 1 :
            arr[nx][ny] = arr[x][y] + 1
            print(nx,ny)
            queue.append((nx,ny))

print(arr)
print(arr[n-1][m-1])