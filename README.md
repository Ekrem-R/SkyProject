#SkyProject

***
**Installation guide: This is a maven project. so It's assumed that the host running this code have Java and maven installed and already set. Here is the guide for maven installation just in case : https://maven.apache.org/install.html Project get all dependencies from maven repository. So no additional installation needed. *Below are the dependencies are being used for this project Cucumber-Junit, Cucumber-java,Selenium, Bonigarcia Webdriver Test RUN Notes: To run all Scenarios one by one, use @next, @dynamic, @helloworld and @preview tags in the Runner class/Cucumber Options**
1. Way: Clone the project Import maven dependencies from POM Go src -> test > java > com> runner > Runner and RUN To generate "HTML Maven Cucumber Report" ; Open Maven right side panel Double Click Project's Lifecycle Click "verify"

2. Way: Run from command line invoke mvn clean verify
