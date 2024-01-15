# 개념 정리
> **배열** : 메모리의 연속 공간 
        => 값의 접근이 쉬움
        => 값 삽입 및 삭제 어려움
        => 크기는 선언 시 지정 바꿀 수 없음 
 **리스트** : [ 값 + 포인터 => 노드 ]를 포인터로 연결한 자료구조
        => 인덱스가 없음 / head부터 순서대로 접근 : 접근 속도 느림
        => 데이터 삽입 삭제 빠름
        => 크기 별도 지정 X / 크기가 정해지지 않음 / 자유로움 

**BufferedReader 과 Scanner**
        BufferedReader : 대용량 데이터를 효율적으로 처리 / 단 모두 string의 형태로 받아옴 -> 추후 변형 필요
        Scanner : 사용자 입력을 다룰 때 더 편리하며, 간단한 형태의 입력 처리 
        => BufferedReader를 사용하는 것이 Scanner를 사용하는 것보다 빠르다
        + StringTokenizer : 구분자 기반으로 문자열 분할 (token으로 나누어짐)

# 알고리즘 로직
- 빼먹는 조건이 없도록 조건에 번호를 메기면서 풀어나가자
> **투포인터 이동원칙** (아주 basic)
    sum > N : sum = sum - start_index; start_index++
    sum < N : end_index++; sum = sum + end_index;
    sum == N : end_index++; sum = sum + end_index; count++; 

> 식을 수학적으로 변형하여 식을 간추려 => 더 나은 알고리즘

> 슬라이딩 윈도우 : 2개의 포인터로 범위를 지정한 후 다음 범위를 유지한 채로 이동하는 알고리즘 (투포인터와 유사)


# 숙지해야할 부분
```java
// 공백을 포함하지 않는 문자열을 입력 받음
        String sNum = sc.next();

// char(문자) 를 정수형으로 변환하여 값을 더해 나감
            sum += cNum[i] - '0';
```
```
인덱스 값으로 사용하려면 무조건 int 형
큰 값이 들어갈 것 같으면 long 형
```