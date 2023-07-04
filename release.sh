#in venv
#pip install -r req.txt
#pip freeze > req.txt
chmod u+x *.sh *.py

git config --global --add safe.directory /media/penguinl/PenguinL/PycharmProjects/skyrim
#git clone -o skyrim https://github.com/PenguinLW/skyrim.git
#git config --global credential.helper cache
git config --global credential.helper "cache --timeout=25200"
#git config credential.helper store
#git config --unset credential.helper

git pull --all
git add .
git commit -m PenguinL
git push --set-upstream skyrim master
