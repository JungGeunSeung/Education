from flask import Flask, request, render_template

# flask 초기화
app = Flask(__name__)

@app.route("/home")
def home():
    a = 10
    print(a)
    return '<h1>hello web to</h1>'


@app.route("/login", methods = ['GET','POST'])
def login() :
    # 넘겨 받은 파라메터 출력
    print(request.method)

    if request.method == 'GET' :
        # get 방식
        id = request.args.get("id")
        print("id :", id)
    elif request.method == 'POST' :
        # post 방식
        id = request.form.get("id")
        print("id :", id)
    else :
        print("다른 메소드")


    # return f'너의 아이디는 your id is {id} 입니다'
    return render_template('main.html', id2=id, d={'k' : 'v'})

@app.route("/join")
def join() :
    return render_template('join.html')


# 서버 구동
# flask 기본 포트 : 5000
app.run(port=5000, debug=True)
