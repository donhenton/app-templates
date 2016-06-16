tiles3 and springmvc 3
http://dhruvgairola.blogspot.com/2013/03/spring-mvc-with-apache-tiles-3.html
https://github.com/michaelisvy/mvc-layout-samples
http://www.layoutit.com/build

security tags
http://doanduyhai.wordpress.com/2012/02/26/spring-security-part-v-security-tags/



### CSS launch and gulp stuff:

to run:
mvn clean -Pcss jetty:run-exploded -DskipTests=true 
served on http://localhost:8080



see  src/main/webapp/WEB-INF/spring/spring-security.xml for users and passwords


### running from the command line: (java 7)
```
java -jar target/dependency/jetty-runner.jar target/SpringMVC3-app-1.0-SNAPSHOT.war


/Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/bin/java  -jar target/dependency/jetty-runner.jar target/SpringMVC3-app-1.0-SNAPSHOT.war
```