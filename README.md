# computus4j
Java library to figure out when Easter is.

[![Build Status](https://travis-ci.org/Aldaviva/computus4j.svg?branch=master)](https://travis-ci.org/Aldaviva/computus4j)

## Components
There are several ways to represent a date in Java, and this library provides several modules so you can choose the one you want.
- **computus4j-calendar:** uses the JDK1.1 [`Calendar`](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html) class (highly compatible, most annoying API)
- **computus4j-jodatime:** uses the [Joda-Time](http://www.joda.org/joda-time/) library (extra transitive dependency, requires Java 5, great API)
- **computus4j-jdk8:** uses the JDK8 [`LocalDate`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) class (requires Java 8, great API)

Pick the one you want and declare it as a dependency.

## Building
Maven 3 is required to compile this project.

    $ git clone https://github.com/Aldaviva/computus4j.git
    $ cd computus4j/computus4j-parent
    $ mvn install

## Installing
Add a dependency to your project's `pom.xml`:

```xml
<project>
    <dependencies>
        <dependency>
            <groupId>com.aldaviva.computus</groupId>
            <!-- Pick the artifact you want, see Components above -->
            <artifactId>computus4j-calendar</artifactId>
            <!-- <artifactId>computus4j-jodatime</artifactId> --> 
            <!-- <artifactId>computus4j-jdk8</artifactId> -->
            <version>1.0.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
</project>
```

## Usage
```java
new Computus().getEaster(2016);
```
Fully-qualified types for each module:
### JDK1.1 `Calendar`
```java
java.util.Calendar easter = new com.aldaviva.computus4j.calendar.Computus().getEaster(2016);
```

### Joda-Time
```java
org.joda.time.LocalDate easter = new com.aldaviva.computus4j.jodatime.Computus().getEaster(2016);
```

### JDK8 `LocalDate`
```java
java.time.LocalDate easter = new com.aldaviva.computus4j.jdk8.Computus().getEaster(2016);
```
