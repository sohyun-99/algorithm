# 단지 번호 붙이기

# dfs

# dx = [0,0,1,-1]
# dy = [1,-1,0,0]

# def dfs(arr,x,y,c):
#     arr[x][y]=2 # 방문했다는 의미
#     c+=1
#     for i in range(4):
#         nx=x+dx[i]
#         ny=y+dy[i]
        
#         if nx<0 or ny<0 or nx>=n or ny>=n :
#             continue

#         # 방문한적 없는 집이 있는 곳
#         if arr[nx][ny]==1 :
#             c = dfs(arr,nx,ny,c)
#     return c    
    

# n = int(input())
# arr=[]
# for i in range(n):
#     arr.append(list(map(int,input())))

# answer=[]
# for i in range(n):
#     for j in range(n):
#         if arr[i][j]==1 :
#             answer.append(dfs(arr,i,j,0))

# answer.sort() # 오름차순
# print(len(answer))
# for i in range(len(answer)):
#     print(answer[i])

# 다른 풀이 참고하니 c를 전역변수로 설정해서 하는 사람도 있음

# # 23/12/14 -> BFS로도 풀어보기 !!!!!!!!!!!!!!!
from collections import deque

dx = [0,0,1,-1]
dy = [1,-1,0,0]

def bfs(arr,x,y):
    queue=deque((x,y))
    # queue.append(
    print(queue)

n = int(input())
arr=[]
for i in range(n):
    arr.append(list(map(int,input())))

bfs(arr,1,1)