def solution(numbers):

    answer = []
    
    for number in numbers :
        # 짝수일때는 그냥 +1  
        if number%2 == 0 :
            answer.append(number+1)
        else: # 홀수일 때
            num_2 = list('0'+ bin(number)[2:]) #앞 자리에 0추가하면서 2진수로 변경
            idx = ''.join(num_2).rfind('0') # 문자열로 바꿔주면서 최초의 0을 찾아냄
            num_2[idx]='1' # 1로 바꿔줌
            num_2[idx+1]='0' # 1로 바꿔줌
            
            answer.append(int(''.join(num_2),2))

    return answer

# 전수조사 알고리즘 => 입출력 패턴 분석하면 쉽게 풀리는 패턴 

# join 사용시 join의 모든 요소는 str상태여야함 즉, 정수는 안된다는 뜻