# 최단 경로임을 보장 <- 너비 우선 탐색
# 노드 수가 적고 깊이가 얕은 값이 존재할 때 유리

# 언제
# 현재 나의 위치에서 가장 가까운 노드를 먼저 방문하는 상황
# 최단거리
# 규모 크지 않고 , 원하는 대상이 별로 멀지 않은 경우

from collections import deque

# BFS 메서드 정의
def bfs(graph, start, visited):
	# 큐(Queue) 구현을 위해 deque 라이브러리 사용
    queue = deque([start])
    # 현재 노드를 방문 처리
    visited[start] = True
    # 큐가 빌 때까지 반복
    while queue:
        # 큐에서 하나의 원소를 뽑아 출력하기
        v = queue.popleft()
        print(v, end=' ')
        # 아직 방문하지 않은 인접한 원소들을 큐에 삽입
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i] = True

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

# 각 노드가 방문된 정보를 표현 (1차원 리스트)
visited = [False]*9

# 정의된 BFS 함수 호출
bfs(graph, 1, visited)