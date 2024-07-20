a = 10
naver = 1
nvaer = 2 # 변수에 오타주의

b = a // 3 # 내림
print(b)
print(-a // 3)
print(2 ** 10) #  거듭 제곱

# int 자료형으로 형변환
a = int(-3.3)
print(a)
print(int(100)+1)
# print(int(10asf0)+1)

# print = 10 #함수가 변수로 덮여 쓰여진다. 따라서 조심해야한다
# print(a)
print(type(a)) # 변수의 타입을 알려주는 type함수
print(type(print))

#정밀도
a = 0.12345678901234567890 # 소수점 14자리 까지만 정밀하다
print(a)

a, b, c = 10, 20, 30 #한번에 변수를 지정할수 있다
print(a,b,c)

t = (10,20,30)
a, b, c = t


a = True #논리타입은 대문자로 시작한다
b = False # false에 해당하는건 자바스크립트와 동일하게 동작한다
# 파이썬에서 논리란
# False : False, None, 0, 0.0, Empty Container
# True : False가 아닌것.
c = None # 할당되지 않는 null은 None이다.

# a = input() 자바에서 Scanner 역할을 한다. 터미널에서 입력값을 받을수 있다.
print(a)

# 비교연산자는 기존 JS와 동일하다 (.equals가 없다)
# Str 타입도 == 으로 비교가 가능하다
# is 와 is not이 있다 (주소값을 비교할때 쓴다)
print('abc' == 'abc')

# 파이썬은 && = and, || = or 로 바꿔서 사용한다

a = 3 > 5
b = 7 > 5
print(a and b)
print(a or b)
print(not (a or b))

id = '아이디'

# 자바스크립트에서는 ``(빽틱)으로 안에 ${}로 변수를 사용했지만,
# 파이썬에서는 앞에 f를 붙혀주고 {}안에 변수를 넣어주면 사용이 가능하다

html = f'''
<div>
    <strong>{id}</strong>
</div>
'''

print(html)

print('쌍따옴표는 \"입니다') # 파이썬에서도 \를 지원한다

















