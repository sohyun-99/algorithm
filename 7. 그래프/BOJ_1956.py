# 운동

# 도로 길이 최소 합 다 구해서 비교해야하는 것 같아서 플로이드워셜로 접근 시작
# 일방 통행

import sys
input = sys.stdin.readline

v, e = map(int, input().split())

INF = int(1e9) 
graph = [[INF]*(v+1) for _ in range(v+1)]

for a in range(1, v+1):
     for b in range(1, v+1):
          if a == b:
              graph[a][b] = 0


for _ in range(e):
    a, b, c = map(int, input().split())
    graph[a][b] = c

for k in range(1, v+1): # 총 노드의 갯수에 대해
	for a in range(1, v+1): # a
          for b in range(1, v+1): # b
               graph[a][b] = min(graph[a][b], graph[a][k]+graph[k][b])

for a in range(1, v+1):
	for b in range(1, v+1):
          if graph[a][b] == INF:
               print("INFINITY", end=" ")
          else:
              print(graph[a][b], end=" ")
          print(min(graph))