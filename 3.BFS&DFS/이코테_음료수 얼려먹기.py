def dfs(graph,x,y,visited):
        visited[x][y] = True
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or ny < 0 or nx>=n or ny>=m :
                continue
            x,y = nx,ny
            if visited[x][y] == False and graph[x][y] == '0':
                dfs(graph,x,y,visited)
                 
n,m = map(int,input().split()) # 세로 가로

dx=[0,0,1,-1]
dy=[1,-1,0,0]


graph = [[0]*m for _ in range(n)]
visited = [[False]*m for _ in range(n)] #  방문 기록 확인

# 그래프 입력 받음
for i in range(n):
    graph[i]=input()

# 이코테 풀이에서 이차원 맵 정보 받는 방법
# graph=[]
# for i in range(n):
#      graph.append(list(map(int,input()))) # 배열안의 배열을 넣는다 이 때 배열의 요소는 정수형으로 받아 넣겠다

x,y = 0 ,0
count=0
for i in range(n):
    for j in range(m):
        if graph[i][j]=='0' and visited[i][j]==False:
            count+=1
            dfs(graph,i,j,visited)
               
print(count)
