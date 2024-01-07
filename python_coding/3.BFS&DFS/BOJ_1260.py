# DFS와 BFS

from collections import defaultdict, deque

# DFS 함수 정의
def dfs(graph, start):
    visited = []
    stack = [start]

    while stack:
        node = stack.pop()
        if node not in visited:
            visited.append(node)
            stack.extend(sorted(graph[node], reverse=True))
    
    return visited

# BFS 함수 정의
def bfs(graph, start):
    visited = []
    queue = deque([start])

    while queue:
        node = queue.popleft()
        if node not in visited:
            visited.append(node)
            queue.extend(sorted(graph[node]))

    return visited

# 입력값 받기
n, m, v = map(int, input().split())
graph = defaultdict(list)

# 그래프 정보 입력받기
for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

# DFS와 BFS 호출하여 결과 출력
print(*dfs(graph, v))
print(*bfs(graph, v))