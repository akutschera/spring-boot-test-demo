[Travis CI:  ![build status badge](https://travis-ci.org/akutschera/spring-boot-test-demo.svg?branch=master)](https://travis-ci.org/akutschera/spring-boot-test-demo)


How to test with Spring Boot
==== 

This is a demo repository that I use to figure out
how to test a few things with Spring.

Properties
=====
You can use many different ways to get properties
into your tests.

The package ...properties shows some of them.
There I have properties 
* set in the test class,
* injected from outside with the surefire plugin
* set in application.properties files
* set in application-<profile>.properties files and
* set in application.yml files

The examples should help to find out who overrides what
and where you can (or need to) override default properties
for testing purposes.

