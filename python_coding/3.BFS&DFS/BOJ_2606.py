# 바이러스

# 연결된 걸 기준으로 모든 부분을 체크 해봐야함
# dfs가 적합하겠다고 생각

# dfs
def dfs(graph,v,visited):
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            dfs(graph,i,visited)

n = int(input())
l = int(input())


# 인접 리스트 형태로 변경
com = [[]*n for _ in range(n+1)]
for i in range (l):
    a,b = map(int,input().split())
    com[a].append(b)
    com[b].append(a)


visited = [False]*(n+1)
dfs(com,1,visited)
print(visited.count(True)-1)

