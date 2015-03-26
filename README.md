copy all Janino jar file to 

/Library/Java/Extensions/

restart terminal

build the maven project
```
mvn clean package
```

to check the file in the jar
```
jar tf *.jar
```

Newperson:target hao$ cd ../target/
Newperson:target hao$ java -cp ExpressionDemo-1.0.jar com.SnapLogic.app.StringExecutor "5>10"
Input is:5>10
Result: false
Newperson:target hao$ java -cp ExpressionDemo-1.0.jar com.SnapLogic.app.StringExecutor "5<10"
Input is:5<10
Result: true

pom.xml

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>com.SnapLogic.app</groupId>
  <artifactId>ExpressionDemo</artifactId>
  <packaging>jar</packaging>
  <version>1.0</version>
  <name>ExpressionDemo</name>
  <url>http://maven.apache.org</url>
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.codehaus.janino</groupId>
      <artifactId>janino</artifactId>
      <version>2.7.8</version>
    </dependency>
  </dependencies>
</project>
