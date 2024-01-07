# 3rd
# 트럭을 순서대로 태워야만 한다는 생각 때문에 반복문을 트럭기준으로만 계속 돌리니 답이 안나옴 or 시간 초과
# 다리를 빠져나가는 마지막 부분 처리가 아예 안됨 - 모르겠음
# 발상의 전환 : 다리를 기준으로 반복문을 돌리면 어떨까? 
from collections import deque

def solution(bridge_length, weight, truck_weights):
    bridge = [0] * bridge_length
    bridge = deque(bridge)
    truck_weights = deque(truck_weights)

    answer = 0
    current_weight = 0

    while bridge: # 다리를 기준으로 초기 {0,0,0,0...} set
        answer += 1
        current_weight -= bridge.popleft() # 1초가 지나니까 빼주고 넣을지 말지를 결정

        if truck_weights: # 만약에 태울 것이 남아있으면 처리 / 더 남은 트럭이 없으면 그냥 넘어감
            if current_weight + truck_weights[0] <= weight: # 더 태울 수 있다면 태우고
                current_truck = truck_weights.popleft()
                bridge.append(current_truck)
                current_weight += current_truck
            else: # 무게 때문에 태울 수 없으니 빈자리를 0으로 채움
                bridge.append(0)
        

    return answer
            

# 1st
# 첫 접근은 선입선출이 필요하므로 deque을 사용해서 시간복잡도를 줄이려했는데 sum을 계속 구해야하는데 방법을 모르므로 일단 리스트로 접근 시작
# 근데 리스트로 하게 되면 다리 길이만 큼 인덱스를 계속 늘려줘야함
# 다른 방식으로 접근 : deque의 rotate를 사용하되 sum을 저장하는 변수를 따로 만든다.

# 2nd
# from collections import deque

# def solution(bridge_length, weight, truck_weights):
#     # 트럭수(다리 길이) , 견딜 무게 , 트럭별 무게
#     # 최종 몇 초 걸리는가?
    
#     bridge = [0]*bridge_length
#     bridge = deque(bridge)

#     answer = 0 # 걸린 시간
#     sum = 0 # 다리위에있는 트럭 무게 합
        
#     bridge.popleft()
#     bridge.append(truck_weights[0])    
#     sum+=truck_weights[0]
#     answer+=1 
#     for i in range(1,len(truck_weights)):
#         # 지금 탑승해야하는 트럭을 넣으면 무게가 넘어가므로 탑승할때까지 대기한 후 탑승 
#         while sum + truck_weights[i] > weight :
#             complete = bridge.popleft()
#             bridge.append(0)
#             answer+=1
#             sum -= complete # 다 지난거 빼주는 것
            
#         #이제 탑승 가능
#         bridge.popleft()
#         bridge.append(truck_weights[i])
#         sum+=truck_weights[i]
#         answer+=1 # 탑승   
    
#     # 다타고 마지막엔 뺴줘야함 
#     if bridge.count(0)  + len(truck_weights) ==bridge_length : 
#         answer += bridge_length
#     return answer

# 마지막에 빼주는 부분은 
# 모든 트럭이 다리를 건넌 후 마지막 트럭이 다리를 빠져나갈 때까지 걸리는 시간은 다리의 길이가 아닐 수도 있다 그러므로 예외처리 하지 못함
# 그리고 2중 반복문으로 애초에 시간 초과라 좋은 코드가 아님
# 실시간으로 모든 걸 다 해야함

