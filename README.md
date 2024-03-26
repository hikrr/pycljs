# pycljs

- This is just personal preferred choices for fullstack development aiming for quick POC.

# How to run this repo

## Backend

```bash
# terminal 0
python -m venv pycljs
source pycljs/bin/activate 
pip install flask
python py/server.py
```


## Frontend
```bash
# terminal 1
npm install
yarn dev
```

- Then go to browser and open `localhost:5000`.
- Hotcode reloading is support when cljs files are modified.
- Use [NextUI](https://nextui.org/) and Tailwind CSS for styling.
