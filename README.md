# spring-boot-querydsl-bug
Illustrates javac call classpath problem for querydsl collections and spring boot

If ran as spring boot application, it will call javac to compile QueryDSL generated code, but it fails to find any classes.
Both with latest stable and latest snapshot of Spring Boot.

As far as I have debugged it, it seems that Spring Boot's classloader exposes its classpath as a list of URLs, 
but QueryDSL code which tries to pass this to javac call parses it in a wrong way as it is expecting a list of paths.

Not yet sure if this is a bug in QueryDSL or in Spring Boot...
