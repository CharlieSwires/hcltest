hcltest
-------
in git bash
git clone https://github.com/CharlieSwires/hcltest

This contains both the java and React

build
-----
cp hcltest/src/main/webapp/hcl-app
npm run build
cd ../../../..
mvn package

produces hcltest.war in target

7zip hcltest.war
remove the hcl-app/node-nodules

deploy
------
docker build --tag website:latest .
docker run -d -p 8888:8080 website:latest


browser
-------
http://localhost:8888/hcltest/hcl-app/build/index.html
