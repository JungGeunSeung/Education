lux = {'health': 490, 'mana': 334, 'melee': 550, 'armor': 18.72}

print(lux['mana'])
lux['mana'] = 400
print(lux['mana'])

x = {1,2,3} #dictionary 생성 가능 키값만 존재 할 수도있다.
print(x)

# dict() 로도 생성가능

# zip(x,y)
# 첫번째 전달인자와 두번째 전달인자를 순서대로 매칭해주는 함수
lux2 = dict(zip(['first','second','third'],[123,456,789]))
print(lux2)

print('mana' in lux) # true
print(len(lux)) # 키와 밸류가 몇개 있나 출력도 가능

print(lux.items()) #키와 밸류를 묶어서 출력
print(lux.keys()) # 딕셔너리의 키값만 출력
print(lux.values()) # 딕셔너리의 밸류 값만 출력

print(lux.get('mana'))
print(lux.get('mana2')) # 키값이 없으니까 None 이 출력됨.
print(lux.get('mana2', 'not found')) # 첫번째 전달인자가 None일때 두번째 전달인자가 출력 된다.















