from flask import Flask, request, send_from_directory, render_template

app = Flask(__name__)

@app.route('/')
def index():
    data = {'title': 'Welcome to My Website', 'content': 'This is some content.'}
    return render_template('index.html', data=data)

if __name__ == '__main__':
    app.run(debug=True)