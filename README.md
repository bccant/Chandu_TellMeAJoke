# Gradle for Android and Java Final Project

In this project, you will create an app with multiple flavors that uses
multiple libraries and Google Cloud Endpoints. The finished app will consist
of four modules. A Java library that provides jokes, a Google Cloud Endpoints
(GCE) project that serves those jokes, an Android Library containing an
activity for displaying jokes, and an Android app that fetches jokes from the
GCE module and passes them to the Android Library for display.

## Why this Project

As Android projects grow in complexity, it becomes necessary to customize the
behavior of the Gradle build tool, allowing automation of repetitive tasks.
Particularly, factoring functionality into libraries and creating product
flavors allow for much bigger projects with minimal added complexity.

The project implements the following:
--------------------------------------
* Add free and paid flavors to an app, and set up your build to share code between them
* Factor reusable functionality into a Java library
* Factor reusable Android functionality into an Android library
* Configure a multi project build to compile your libraries and app
* Use the Gradle App Engine plugin to deploy a backend
* Configure an integration test suite that runs against the local App Engine development server

The project architecture diagram:
---------------------------------- 
[![GCP-Java-Android.png](https://i.postimg.cc/wTWQcntt/GCP-Java-Android.png)](https://postimg.cc/XpC5nHk3)

The Project screenshots are as below:
--------------------------------------

Landing Screen (Free Flavor):
------------------------------ 
[![Tell-Me-A-Joke-Free.jpg](https://i.postimg.cc/76y62Ywg/Tell-Me-A-Joke-Free.jpg)](https://postimg.cc/ns0p8xsz)

Landing Screen (Paid Flavor):
------------------------------ 
[![Tell-Me-A-Joke-Paid.jpg](https://i.postimg.cc/6Q4cQzp8/Tell-Me-A-Joke-Paid.jpg)](https://postimg.cc/NyYmJ6Tt)

Joke Display Screen:
--------------------
[![Joke-Display.jpg](https://i.postimg.cc/2j7w31r7/Joke-Display.jpg)](https://postimg.cc/grrRTkwx)
