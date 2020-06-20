![](.common/nsbanner.png?raw=true)

# NS61001 Java-based Testing with Selenium - Setup Instructions

### Revision History

June 19th, 2020

## CHECK FIRST

There are various requirements and options for installing software.
If you are using your employer's equipment please first check your employer’s policies.
You may have restrictions on what software you may install, and your employer may have specific setup instructions for installation.
In that case, follow your employer's instructions to install the software components listed below in "Required Components".

The following instructions source the components from their public sources.
This is the route to take if you are using your own equipment or your employer has no restrictions.

## Table of Contents

1. [License](#1.-license)
2. [Required Components](#2.-required-components)
3. [Check Web Browser](#3.-check-web-browser)
4. [Check Network Connectivity](#4.-check-network-connectivity)
5. [Install Selenium IDE](#5.-install-selenium-ide)
    - 5.1 [Chrome and Edge Chromium](#5.1-chrome-and-edge-chromium)
    - 5.2 [Firefox](#5.2-firefox)
    - 5.3 [Check Selenium IDE](#5.3-check-selenium-ide)
6. [Install Node.js](#6.-install-node.js)
    - 6.1 [Install Node.js for Windows and MacOS](#6.1-install-node.js-for-windows-and-macos)
    - 6.2 [Install Node.js for Linux](#6.2-install-node.js-for-linux)
7. [Install Selenium Command-line Runner and Web Drivers](#7.-install-selenium-command-line-runner-and-web-drivers)
8. [Install the Java Development Kit](#8.-install-the-java-development-kit)
9. [Install an IDE](#9.-install-an-ide)
    - 9.1 [IntelliJ IDEA](#9.1-intellij-idea)
    - 9.2 [Eclipse](#9.2-eclipse)
10. [Dependencies for Enterprise Publication](#10.-dependencies-for-enterprise-publication-for-(enterprise-administrators)) (for enterprise administrators)
    - 10.1 [Node.js Packages](#10.1-node.js-packages)
    - 10.2 [Maven Artifacts](#10.2-maven-artifacts)

## 1. License

The lab framework code is licensed under the MIT license. The corresponding courseware and software dependencies are not. You may use and modify all or part of the lab framework code as you choose, as long as attribution to the source is provided per the license. See the details in the [license file](./LICENSE.md) or at the [Open Source Initiative](https://opensource.org/licenses/MIT)

## 2. Required Components

* Microsoft Windows, Apple MacOS, or Linux, 64-bit, 8GB of memory recommended
* Google Chrome, Mozilla Firefox, or Microsoft Edge Chromium (Edge may require Selenium 4 in Java)
* Node.js current LTS version
* Selenium IDE and WebDriver for the browser selected
* Java Development Kit version 8+
* IntelliJ IDEA Community or Professional IDE, or Eclipse IDE
* Network access to the Maven repository at https://repo.maven.apache.org  
* Network access to https://github.com
* Network access to the Node package registry at https://registry.npmjs.com

If your organization as internal enterprise package and artifact repositories this [section of the instructions](#10.-dependencies-for-enterprise-publication-for-(enterprise-administrators))
provides the information your orignaization administrators will need to configure the enterprise environment to support the class.

## 3. Check Web Browser

We recommend using Chrome for the class, but you can substitute Firefox or possibly Edge Chromium
if you need to (Selenium 3 does not support Edge Chromium well).
These are the only three browsers that support Selenium IDE, so you must have at least one of them.

You should use a recent version of the browser.
Chrome, Firefox, and Edge Chromium all update themselves, so
unless updates are blocked you should already be up-to-date.
If you are concerned about your current version you can compare the "about" information
(use the *Help &rarr; About* or *[Browser Name] &rarr; About* menu item) of
your browser to the current release information here:

|Browser|Release Information|
|---|---|
|Google Chrome|https://chromereleases.googleblog.com/|
|Mozilla Firefox|https://mozilla.org/firefox/releases|
|Microsoft Edge Chromium|https://docs.microsoft.com/deployedge/microsoft-edge-relnote-stable-channel|

If you need to install a browser, download it these links and run the installation package:

|Browser|Download Link|
|---|---|
|Google Chrome|https://google.com/chrome|
|Mozilla Firefox|https://mozilla.org/firefox|
|Microsoft Edge Chromium|https://microsoft.com/edge|

If you are installing a new browser for the class it *does NOT* have to be made your "default" browser.
All of the browsers run through a configuration step during the install, and you may
configure your browser however you choose to: copy settings, etc.
It is not relevant for this course.

## 4. Check Network Connectivity
The labs require the Node.js and Maven repositories. If you are using your own computer or your employer does have internal versions of these repositories for software development, please make sure that you can reach the following three URLs without errors (the content displayed for each link in the browser is irrelevant, you just need to reach them without an error):

* https://github.com
* https://registry.npmjs.com
* https://repo.maven.apache.org

If you employer uses internal repositories they will provide you with the setup for Node.js and your
integrated development environment to reach them.

## 5. Install Selenium IDE

Selenium IDE is a plugin for the Chrome and Firefox web browsers and the only way to install it is from the
Google or Firefox app store.
The new Edge browser is Chromium, the core of Chrome, so it will use the Chrome plugin.

### 5.1 Chrome and Edge Chromium

Visit https://google.com/chrome/webstore. Search for “Selenium IDE” and install it:

![](.common/chrome-se-ide.png?raw=true)

If you are using Edge, you will need to authorize Edge to use the Google Chrome webstore by clicking a button at the top of the browser window where it prompts you for this.

### 5.2 Firefox

Visit https://addons.mozilla.org, search for “Selenium IDE”, and then install it:

![](.common/firefox-se-ide.png?raw=true)

### 5.3 Check Selenium IDE

Once Selenium IDE is installed you can check it from the browser.
Look for a small icon labeled "Se" (for selenium) to the right of the address (URL) field.

![](.common/selenium-button.png?raw=true)

Clicking on the icon will launch Selenium IDE.
The initial splash screen will ask you if you want to record a new test, etc.
Close Selenium IDE by clicking on the "Close Selnium IDE" (the fourth) option.

## 6. Install Node.js

Node.js is a desktop JavaScript interpreter to run JavaScript programs outside of a Web Browser.
The Selenium Command-line Runner and the WebDriver packages it uses are JvaScript programs, which is why Node.js is required.
Selenium only guarantees that the command line runner will work for the current long-term-support (LTS) version.

The current LTS version of Node.js is found by visiting the download page at https://nodejs.org:

![](.common/node-installer-download.png?raw=true)

You can check to see if you have Node.js installed by running the following command in a terminal window ($ is the prompt,
and your version numbers may vary):

> $ node -v<br/>
> v12.18.1<br/>
> $ npm -v<br/>
> 6.14.5<br/>

### 6.1 Install Node.js for Windows and MacOS

If you do not have Node.js or you have an old version, download and run the installer.
Administrative access is required to run the installer.

#### 6.1.1 Set PATH for MacOS

The installer places the *node* and *npm* commands in /usr/local/bin on MacOS.
If you run the node and npm commands as above and they are not found, add /usr/local/bin to your PATH by
adding the following line to the .bashrc file in your home directory:

> export PATH=$PATH:/usr/local/bin

Launch a new terminal window and run the *node* and *npm* commands from above again to check the installation.

### 6.2 Install Node.js for Linux

The download for Linux is delivered as a zipped tar-file.
This file contains a top level directory, in this case *node-v12.18.1-linux-x64*:

![](.common/node-linux-tar.png?raw=true)

Extract the directory in this file to ~/Node, where ~ is your home directory.
Add the following line to the .bashrc file in your home directory to allow *node* and *npm* to be found (change the pathname
to match the Node.js folder that you installed):

> export PATH=$PATH:~/Node/node-v12.18.1-linux-x64

Launch a new terminal window and run the *node* and *npm* commands from above again to check the installation.

<!-- If you absolutely cannot get administrative privileges to install Node.js, use the instructions in this
blog post to install a user-private version: -->

## 7. Install Selenium Command-line Runner and Web Drivers

The Selenium command line runner is a program that will automate Selenium IDE tests and allow them to be provisioned as part
of a software development pipeline, e.g. DevOps CI/CD.
The command line runner depends on a web driver, a program that communicates with a web browser.
There is a different web driver for each web browser.

The command line runner and web drivers are installed using *npm* (the Node Package Manager).
In a terminal (command) window, use this command to install the command line runner ($ is the prompt):

> $ npm install -g selenium-side-runner<br/>

There may be warning messages about some dependencies, it is safe to ignore these.
These are caused by older dependencies that have been replaced, but the selenium command line runner
still depends on them.
Such is life.
Someday someone may update Selenium, but for now you get the warnings.

Check that the command line runner is installed by running the following command (your version may vary):

> $ selenium-side-runner --version<br/>
> 3.17.0<br/>

Install the driver (or drivers) appropriate for the web browsers you plan on using.
Pick one or more, we recommend the chromedriver because we recommended Chrome previously in step 3:

> $ npm install -g chromedriver<br/>
> $ npm install -g gekodriver<br/>
> $ npm install -g ms-chromium-edge-driver<br/>
> $ npm install -g selenium-webdriver<br/>
> $ npm install -g edgedriver<br/>
> $ npm install -g iedriver<br/>

The *gekodriver* is the Mozilla Firefox driver.

The *selenium-webdriver* can be used with Safari.
The WebDriver that it wraps is delivered with Safari, so you will have to do some configuration to get it to work.
Visit the Apple documentation at https://developer.apple.com/documentation/webkit/testing_with_webdriver_in_safari#2957277 to
get the instructions.

## 8. Install the Java Development Kit

Java is an application environment and may be installed in two different ways:
a Java Runtime Environment (JRE), or a Java Developer Kit (JDK).

For development and testing you must have a Java Development Kit (JDK) 64-bit, version 8 or higher.
If you do not have one, or are not sure, follow the "JDK Download" link and 
download the appropriate *installer* (exe, dmg, rpm, deb) for your environment from Oracle:
https://www.oracle.com/java/technologies/javase-downloads.html.

Run the installer and take all the default options.
Administrative access is required to run the installer.

It is important to know the filesystem path to the JDK so that you can configure it in your integrated development environment.
These are where the JDK is located on your system, your version number may be different.
Look for your JDK now and make a note of the filesystem path to it on your computer:

|Operating System|Location|
|---|---|
|Windows|C:\Program Files\Java\jdk-14.0.1|
|MacOS|/Library/Java/Java Virtual Machines/jdk-14.0.1.jdk/Contents/Home|
|Linux|/usr/lib/jvm/jdk-14.0.1|

## 9. Install an IDE

If you are taking this course at work your employer will dictate which which integrated development environment (IDE)
will be used, follow their instructions.

This course is designed around the IntelliJ IDEA and Eclipse integrated development environments (IDEs).
Both of these IDEs are available for Windows, MacOS, and Linux.
The instructions to install each follow:

### 9.1 IntelliJ IDEA

IntelliJ IDEA comes in a free community or paid "ultimate" version (with a free 30-day trial), either one will work for this course.
You can download the installer from https://www.jetbrains.com/idea/download/.
Administrative privileges are required to run the installer.

Run the installer and take allf of the defaults, but on the third screen of the installation make sure the 32-bit launcher is not checked and the 64-bit launcher is:

![](.common/intellij-64bit.png?raw=true)

Once the installer is complete you are finished.

### 9.2 Eclipse

Eclipse is a popular free IDE.
Click on the download button at https://www.eclipse.org/downloads/ to download the 64-bit installer.
When you run the installer select the first option, *Eclipse IDE for Java Developers*:

![](.common/eclipse-installer.png?raw=true)

On the next screen for the "Java 1.8+" field, select the filesystem path to the JDK installed in step 8.
If it does not appear in the list, click on the file icon and go find it:

![](.common/eclipse-jdk.png?raw=true)

Once the installer is complete you are finished.

## 10. Dependencies for Enterprise Publication (for enterprise administrators)

If the class is working behind a firewall and must use employer repositories for dependencies
these are the required Node.js and Maven dependent packages.
In these circumstances the packages must be published locally, with all of their dependencies.

### 10.1. Node.js Packages

For Node.js packages always get the latest versions.
The current version at the time of publication of this setup guide is listed
just as a check.

|Published by|Package|Version|
|---|---|---|
|SeleniumHQ|[selenium-side-runner](https://www.npmjs.com/package/selenium-side-runner)|3.17.0|
|corveo|[selenium-webdriver](https://www.npmjs.com/package/selenium-webdriver)|4.0.0-alpha.7|
|giggo|[chromedriver](https://www.npmjs.com/package/chromedriver)|83.0.0|
|vladikoff|[geckodriver](https://www.npmjs.com/package/geckodriver)|1.19.1|
|dmlemeshko|[ms-chromimum-edge-driver](https://www.npmjs.com/package/ms-chromium-edge-driver)|0.2.4|
|barretts|[edgedriver](https://www.npmjs.com/package/edgedriver)|4.17134.1|
|barretts|[iedriver](https://www.npmjs.com/package/iedriver)|3.14.2|

### 10.2. Maven Artifacts

#### 10.2.1. General Artifacts

These artifacts and their dependencies are required regardless of the version of Selenium used.
The Maven pom.xml files include these specific versions:

|Group Id|Artifact Id|Version|
|---|---|---|
|org.springframework.boot|[spring-boot-starter](https://search.maven.org/artifact/org.springframework.boot/spring-boot-starter)|2.3.1.RELEASE|
|org.springframework.boot|[spring-boot-starter-security](https://search.maven.org/artifact/org.springframework.boot/spring-boot-starter-security)|2.3.1.RELEASE|
|org.springframework.boot|[spring-boot-starter-log4j2](https://search.maven.org/artifact/org.springframework.boot/spring-boot-starter-log4j2)|2.3.1.RELEASE|
|org.springframework.boot|[spring-boot-starter-log4j](https://search.maven.org/artifact/org.springframework.boot/spring-boot-starter-log4j)|1.3.8.RELEASE|
|org.springframework.boot|[spring-boot-configuration-processor](https://search.maven.org/artifact/org.springframework.boot/spring-boot-configuration-processor)|2.3.1.RELEASE|
|org.springframework.boot|[spring-boot-starter-data-rest](https://search.maven.org/artifact/org.springframework.boot/spring-boot-starter-data-rest)|2.3.1.RELEASE|
|org.springframework.data|[spring-data-rest-hal-browser](https://search.maven.org/artifact/org.springframework.data/spring-data-rest-hal-browser)|3.3.1.RELEASE|
|org.springframework.boot|[spring-boot-devtools](https://search.maven.org/artifact/org.springframework.boot/spring-boot-devtools)|2.3.1.RELEASE|
|org.xerial|[sqlite-jdbc](https://search.maven.org/artifact/org.xerial/sqlite-jdbc)|3.32.3|
|com.h2database|[h2](https://search.maven.org/artifact/com.h2database/h2)|1.4.200|
|org.springframework.boot|[spring-boot-starter-data-jpa](https://search.maven.org/artifact/org.springframework.boot/spring-boot-starter-data-jpa)|2.3.1.RELEASE|
|org.springframework.boot|[spring-boot-starter-test](https://search.maven.org/artifact/org.springframework.boot/spring-boot-starter-test)|2.3.1.RELEASE|
|org.junit.jupiter|[junit-jupiter-api](https://search.maven.org/artifact/org.junit.jupiter/junit-jupiter-api)|5.6.2|
|org.junit.jupiter|[junit-jupiter-engine](https://search.maven.org/artifact/org.junit.jupiter/junit-jupiter-engine)|5.6.2|
|org.junit.jupiter|[junit-jupiter-params](https://search.maven.org/artifact/org.junit.jupiter/junit-jupiter-params)|5.6.2   |
|org.mockito|[mockito-junit-jupiter](https://search.maven.org/artifact/org.mockito/mockito-junit-jupiter)|3.3.3|
|io.cucumber|[cucumber-java](https://search.maven.org/artifact/io.cucumber/cucumber-java)|6.1.1|
|io.cucumber|[cucumber-jvm](https://search.maven.org/artifact/io.cucumber/cucumber-jvm)|6.1.1|
|org.seleniumhq.selenium|[selenium-java](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-java)|3.141.59|
|org.seleniumhq.selenium|[selenium-java](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-java)|4.0.6-alpha-6<sup>1</sup>|
|org.seleniumhq.selenium|[htmlunit-driver](https://search.maven.org/search?q=a:webdriver-selenium)|2.41.0|

1: The Selenium 4 alpha dependency is included in case the class uses with Selenium 4 instead of Selenium 3. Microsoft Edge Chromium drivers are included with Selenium 4. Edge Chromium may be used with Selenium 3 but the class participants will have to jump through some hoops: https://docs.microsoft.com/en-us/microsoft-edge/webdriver-chromium?tabs=c-sharp.

<hr>
Copyright © 2020 NextStep IT Training. All rights reserved.