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

DataJpaTest
====
The package ...datajpatest contains some database tests
that use the spring @DataJpaTest annotation.
I played around with some different use cases
* The test is in the same package as the JPA-Repository and the Entity
* The test is in different package from the JPA-Repository and the Entity

