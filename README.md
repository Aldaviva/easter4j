# easter4j
Java library to figure out when Easter is.

[![Build Status](https://travis-ci.org/Aldaviva/easter4j.svg?branch=master)](https://travis-ci.org/Aldaviva/easter4j)

## Algorithm
Thanks to history, religion, politics, and astronomy, figuring out the date of Easter is a preposterously complicated procedure called [Computus](https://en.wikipedia.org/wiki/Computus).

There are [many implementations](https://web.archive.org/web/20150616180400/http://www.merlyn.demon.co.uk/estrdate.htm#SAW) of Computus algorithms. This library uses [Ian Taylor's *Computus 1* algorithm](http://chilliant.blogspot.com/2010/12/computus-1.html) because it's fast.

## Components
There are several ways to represent a date in Java, and this library provides several modules so you can choose the one you want.
- **easter4j-calendar:** uses the JDK1.1 [`Calendar`](https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html) class (highly compatible, most annoying API)
- **easter4j-jodatime:** uses the [Joda-Time](http://www.joda.org/joda-time/) library (extra transitive dependency, requires Java 5, great API)
- **easter4j-jdk8:** uses the JDK8 [`LocalDate`](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html) class (requires Java &ge; 8, great API)

Pick one and declare it as a dependency.

## Building
Maven 3 is required to compile this project.

    $ git clone https://github.com/Aldaviva/easter4j.git
    $ cd easter4j/easter4j-parent
    $ mvn install

## Installing
Add a dependency to your project's `pom.xml`:

```xml
<project>
    <dependencies>
        <dependency>
            <groupId>com.aldaviva.computus</groupId>
            <!-- Pick the artifact you want, see Components above -->
            <artifactId>easter4j-calendar</artifactId>
            <!-- <artifactId>easter4j-jodatime</artifactId> --> 
            <!-- <artifactId>easter4j-jdk8</artifactId> -->
            <version>1.0.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
</project>
```

## Usage
```java
Easter4J.getEaster(2016);
```
Fully-qualified types for each module:
##### JDK1.1 `Calendar`
```java
java.util.Calendar easter = com.aldaviva.easter4j.Easter4J.getEaster(2016);
```

##### Joda-Time
```java
org.joda.time.LocalDate easter = com.aldaviva.easter4j.Easter4J.getEaster(2016);
```

##### JDK8 `LocalDate`
```java
java.time.LocalDate easter = com.aldaviva.easter4j.Easter4J.getEaster(2016);
```
