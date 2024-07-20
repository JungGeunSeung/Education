# 시퀀스 객체란?
# list, tuple, String, range 등 반복할 수 있는 객체
a = [0, 10, 20, 30, 40, 50, 60, 70, 80, 90]
print(30 in a) # in: 시퀀스에 특정 값이 있는 지 조사한다.
# 오른쪽 변수안에 왼쪽의 값이 있나 확인
print(100 not in a) # not in
print('o' in 'hello') # 문자열 가능
print(3 in range(0,10,2)) # range도 가능

b = [1,2,3]
print(a+b)
print('hello'+' world')
# print('hello'+3) # 3은 시퀀스 객체가 아니라 되지 않는다

# 파이썬에서는 문자열 + 문자열만 지원된다.
# 그이유는 시퀀스 + 시퀀스 만 가능하기 때문이다.

print('hello' + str(3)) # str 함수를 이용해서 3을 시퀀스 타입으로 바꾸어 줘야 한다.

print(b * 4) # 시퀀스를 반복해서 곱해준다.
print('hello ' * 3) # 문자열도 곱해서 한번에 출력해준다.
print('-'* 30) # 그래서 터미널창에 선을 긋고 싶을때 사용 하면 좋다. 

print( len(a))

print(a)
del a[1]
print(a)

c = 'abcd'
# c[0] = a # index로 접근하는 경우, range, tuple String은 읽기만 된다.


###중요###
# slice
# 리스트의 일부를 잘라서 새 리스트를 만든다.
# 인덱스로 접근 가능한 모든 곳에 사용할수 있다.
# 전달인자 - 시작index : 종료index : step
# 시작 index부터 종료 index 바로 앞까지 step씩 증가하면서 읽기
# 시작 index 기본값 :
# 종료 index 기본값 : len() 즉 배열의 길이
# step 기본값 : 1

print(a[0:3]) # 0번 index부터 3개
print(a[:3]) # 0번 index부터 3개
print(a[3:]) # 3번째 index부터 끝까지
print(a[::2]) # 전부 출력이지만 2개씩 건너뛰면서 출력
print(a[5:1:-1]) # 거꾸로 출력도 가능

print('-' * 30)
a[0] = 100
a[2:4] = [1,2] # 시작 인덱스에만 들어갔다
print(a)
a[2:4] = [1] 
print(a)
a[2:4] = [1,2,3,4,5,6,7,8,9] # 슬라이스 한 구역을 바꾼다.
print(a)

del a[2:8:2] # 슬라이스로 del도 가능
print(a)









