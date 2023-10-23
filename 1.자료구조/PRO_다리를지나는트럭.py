from collections import deque

def solution(bridge_length, weight, truck_weights):
    # 트럭수(다리 길이) , 견딜 무게 , 트럭별 무게
    # 최종 몇 초 걸리는가?
    
    bridge = [0]*bridge_length
    bridge = deque(bridge)
    
    for i in range(len(truck_weight)):
        bridge[0]=truck_weight[i]
    
    
    
    
    
    answer = 0
    return answer


# 첫 접근은 선입선출이 필요하므로 deque을 사용해서 시간복잡도를 줄이려했는데 sum을 계속 구해야하는데 방법을 모르므로 일단 리스트로 접근 시작
# 근데 리스트로 하게 되면 다리 길이만 큼 인덱스를 계속 늘려줘야함
# 다른 방식으로 접근 : deque의 rotate를 사용하되 sum을 저장하는 변수를 따로 만든다.