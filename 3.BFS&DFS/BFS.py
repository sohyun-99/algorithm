# 최단 경로임을 보장 <- 너비 우선 탐색
# 노드 수가 적고 깊이가 얕은 값이 존재할 때 유리

# 언제
# 현재 나의 위치에서 가장 가까운 노드를 먼저 방문하는 상황
# 최단거리
# 규모 크지 않고 , 원하는 대상이 별로 멀지 않은 경우

def dfs(graph, v, visited):
	# 현재 노드를 방문 처리
    visited[v] = True
    print(v, end=' ')
    # 현재 노드와 연결된 다른 노드를 재귀적으로 방문
    for i in graph[v]:
    	if not visited[i]:
        	dfs(graph, i, visited)

# 인접 리스트 방식으로 그래프 표현
# 각 노드가 연결된 정보를 표현(2차원 리스트)
graph = [
	[],
    [2,3,8],
    [1,7],
    [1,4,5],
    [3,5],
    [3,4],
	[7],
    [2,6,8],
    [1,7]
]

# 각 노드가 방문된 정보를 표현(1차원 리스트)
# 기본적으로 모든 값들을 False로 초기화하고, index 0은 사용하지 않는다.
visited = [False]*9

# 정의된 DFS 함수 호출
dfs(graph,1,visited)