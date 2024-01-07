#     1. 레코드가 순서대로 문자열 잘라서 딕셔너리에 넣고
#     2. 딕셔너리를 key순서로 정렬
#       (key에 차번호 담고 value에 있던 시간 담고)
#     3. 계산하는 함수 만들어서 계산만 해주게
#     결국 계산된 answer에 넣으면 끝

import math

def calculate_time(_input,_output):
    i_h,i_m= _input.split(':')
    o_h,o_m= _output.split(':')
    
    o = int(o_h)*60 + int(o_m)
    i = int(i_h)*60 + int(i_m)
    return o-i 

def calculate_fee(fees,time):
    if time <= fees[0]:
        fee = fees[1]
    else:
        fee_ = math.ceil((time - fees[0])/fees[2])
        fee = fee_ * fees[3] + fees[1]
    return fee

def solution(fees, records):
    
    # 1. 레코드가 순서대로 문자열 잘라서 딕셔너리에 넣고
    answer = []
    
    car = dict()
    car_record = dict()
    for i in range(len(records)):
        num = records[i][6:10]
        time = records[i][0:5]

        if records[i][11:13] == 'IN':
            # 차번호 = 입차시간
            car[num] = time 
        else : 
            # out인 상황 => 출차 - 입차 = 시간 추가 및 초기화
            _out = time
            _in = car.get(num)
            del car[num] 
            
            if (num in car_record):
                car_record[num]=car_record[num]+calculate_time(_in,_out)
            else:
                car_record[num] = calculate_time(_in,_out)
    
    for i in car:
        num = i
        time = car[num]
        
        if (num in car_record):
                car_record[num]=car_record[num]+calculate_time(time,"23:59")
        else:
            car_record[num] = calculate_time(time,"23:59")
            
    car_record = dict(sorted(car_record.items()))
    lst = list(car_record.values())
    print(lst)

    for i in range(len(lst)):
        answer.append(calculate_fee(fees,lst[i]))
    return answer