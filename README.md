# pycljs

- This repo is just a personal preferred choice for full-stack development aiming for quick POC.

# How to run this repo

(Assume you are at the root of this repo)

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

- Then go to the browser and open `localhost:5000`.
- Hotcode reloading is supported when cljs files are modified.
- Use [NextUI](https://nextui.org/) and Tailwind CSS for styling.
