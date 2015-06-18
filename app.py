from flask import Flask, request, jsonify
app = Flask(__name__)

import Calculator
cal = Calculator()

@app.route("/")
def hello():
    return "Hello World!"

@app.route('/add')
def add_numbers(): 
    a = int(request.args.get('a'))
    b = int(request.args.get('b'))
    return jsonify(dict(result=cal.addNumbers(a, b)))

if __name__ == "__main__":
    app.run(debug=True)