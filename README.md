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
cp target/hcl-test.war apache-tomcat/webapps/.

cd apache-tomcat/bin
./startup.bat

browser
-------
http://localhost:8080/hcltest/hcl-app/build/index.html
