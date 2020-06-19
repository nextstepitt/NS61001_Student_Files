![](.common/nsbanner.png?raw=true)

# NS61001 Java-based Testing with Selenium - Setup Instructions

Revised June 18th, 2020

## CHECK FIRST

There are various requirements and options for installing software.
If you are using your employer's equipment please first check your employer’s policies.
You may have restrictions on what software you may install, and your employer may have specific setup instructions for installation.
In that case, follow your employer's instructions to install the software components listed below in "Required Components".

The following instructions source the components from their public sources, which is fine if your employer has no
restrictions or you are using your own equipment.
We expect that you have the skills to drive your operating system, find files, move files, etc.

1. [License](#1.-license)
2. [Required Components](#2.-required-components)
3. [Instaling Web Browsers](#3.-installing-web-browsers)
4. [Checking Network Connectivity](#4.-checking-network-connectivity)
5. [Installing Selenium IDE](#5.-installing-selenium-ide)
    - 5.1 [Google Chrome and Microsoft Edge Chromium](#5.1-google-chrome-and-microsoft-edge-chromium)
    - 5.2 [Mozilla Firefox](#5.2-mozilla-firefox)
6. [Installing Node.js](#6.-installing-node.js)
7. [Installing Selenium Command-line Runner and Web Driver](#7.-installing-selenium-command-line-runner-and-web-driver)
8. [Installing a Java Development Kit](#8.-installing-a-java-development-kit)
    - 8.1 [Oracle Commercial JDK](#8.1-oracle-commercial-jdk)
    - 8.2 [Open JDK](#8.2-open-jdk)
    - 8.3 [Check the JDK](#8.3-check-the-jdk)
9. [Installing an IDE](#9.-installing-an-ide)
    - 9.1 [IntelliJ IDEA](#9.1-intellij-idea)
    - 9.2 [Eclipse](#9.2-eclipse)
        - 9.2.1 [Use the Eclipse Installer](#9.2.1-use-the-eclipse-installer)
        - 9.2.2 [Install Eclipse Manually](#9.2.2-install-eclipse-manually)
10. [Java Preparation](#10.-java-preparation)
11. [Dependencies](#11.-dependencies-(enterprise-administrators)) (enterprise administrators)
    - 11.1 [Node.js Packages](#11.1-node.js-packages)
    - 11.2 [Maven Artifacts](#11.2-maven-artifacts)
        - 11.2.1 [General Artifacts](#11.2.1-general-artifacts)
        - 11.2.2 [Selenium 3 Artifacts](#11.2.2-selenium-3-artifacts)
        - 11.2.3 [Selenium 4 Artifacts](#11.2.3-selenium-4-artifacts)

## 1. License

The lab framework code is licensed under the MIT license. The corresponding courseware and software is not. You may use and modify all or part of the lab framework code as you choose, as long as attribution to the source is provided per the license. See the details in the [license file](./LICENSE.md) or at the [Open Source Initiative](https://opensource.org/licenses/MIT)

## 2. Required Components

* Microsoft Windows, Apple MacOS, or a Linux computer, 64-bit, 8GB of memory recommended
* Google Chrome, Mozilla Firefox, or Microsoft Edge Chromium (Edge may require Selenium 4 in Java)
* Node.js version 10+
* Selenium IDE and WebDriver for the browser selected
* Java Development Kit version 8+
* IntelliJ IDEA Community or Professional IDE, or Eclipse IDE
* Network access to the Maven repository at https://repo.maven.apache.org  
* Network access to https://github.com
* Network access to the Node package registry at https://registry.npmjs.com



If internal package and artifact repositories is used this [section of the instructions](##Dependencies) lists the Node.js and Maven dependencies that are needed to be published internally.
An administrator for the internal repositories will be able to vet these packages and artifacts, and set things up.

## 3. Installing Web Browsers

Our recommendation is to use Google Chrome and stick to the instructions relevant to that below.
The instructions for other browsers are provided in case you cannot use Google Chrome or wish to try other configurations.

Google Chrome, Mozilla Firefox, or Microsoft Edge Chromium are the only three browsers that support Selenium IDE. All of these browsers update themselves, so if one or more are already installed you should have the current versions. It is still worthwhile to double-check, and if your version is relatively recent that is close enough.

The current release information for Google Chrome is provided at https://chromereleases.googleblog.com/. The current release information for Mozilla Firefox is provided at https://mozilla.org/firefox/releases. The current release information for Microsoft Edge Chromium is at https://docs.microsoft.com/deployedge/microsoft-edge-relnote-stable-channel.

Google Chrome may be downloaded and installed from https://google.com/chrome. Mozilla Firefox may be downloaded and installed from https://mozilla.org/firefox. Microsoft’s Edge Chromium browser may be downloaded and installed from https://microsoft.com/edge. 

If you are installing a new browser it *does not* have to be made your "default" browser.
Set up the configuration during the install how you choose: copy settings, etc.
It is not important for the course.

## 4. Checking Network Connectivity
The labs require the Node.js and Maven repositories. If you are using your own computer or your employer does have internal versions of these repositories for software development, please make sure that you can reach the following three URLs without errors (the content displayed for each in the browser is irrelevant, you just need to reach them):

* https://github.com
* https://registry.npmjs.com
* https://repo.maven.apache.org

## 5. Installing Selenium IDE

Selenium IDE is a plugin for the Chrome and Firefox web browsers. The new Edge browser is Chromium, the core of Chrome, so it will use the Chrome plugin. The Selenium WebDriver will be installed later, after you install Node.js.

### 5.1 Google Chrome and Microsoft Edge Chromium

Visit https://google.com/chrome/webstore. Search for “Selenium IDE” and install it:

![](.common/chrome-se-ide.png?raw=true)

If you are using Edge, you will need to authorize Edge to use the Google Chrome webstore by clicking a button at the top of the browser window where it prompts you for this.

### 5.2 Mozilla Firefox

Visit https://addons.mozilla.org, search for “Selenium IDE”, and then install it:

![](.common/firefox-se-ide.png?raw=true)

### 5.3 Launching Selenium IDE

Once Selenium IDE is installed you can check it from the browser.
Look for a small icon labeled "Se" (for selenium) to the right of the address (URL) field.

![](.common/selenium-button.png?raw=true)

recordClicking on the icon will launch Selenium IDE.
There will be an initial splash screen that asks you if you want to record a new test, etc.
Close Selenium IDE by clicking on the "Close Selnium IDE" option.

## 6. Installing Node.js

Node.js is a desktop JavaScript interpreter to run JavaScript programs outside of a Web Browser. The Selenium Command-line Runner and the WebDriver packages it uses are JvaScript programs, which is why Node.js is required.

You can check to see if you have Node.js installed by running the following command in a terminal window ($ is the prompt):

> $ node -v<br/>
> v12.18.1

However, Selenium only guarantees that the command line runner will work for the current long-term-support (LTS) version.
You may have to update your Node.js if it is old.

### 6.1 Node.js Installer

The easy, fast way to install Node.js is to use the installer, download the current LTS version at https://nodesjs.org:

![](.common/node-installer-download.png?raw=true)

But, you have to have administrative access.
Take all the default options, let the installer do it's work.

### 6.2 Install Node.js Manually

If you do not have administrative access, you can still install Node.js manually.
At https://nodejs.org click on the "downloads" link at the top of the page.
Select the appropriate zip or tar file for your operating system and make sure it is the 64-bit variety.
The file will contain something like this:

![](.common/node-zipfile.png?raw=true)

Once you have obtained the zip or tar file, extract it to your system.
Our recommendation is to extract the folder the file contains under a "Node" folder in your home directory,
so in this case if would end up in "~/Node/node-v12.18.1-win-x64" where ~ is your home directory.
This configuration allows you to have multiple Node.js versions side by side if you need them.

We are not done yet, you still need to add "node" and "npm" to your PATH variable in the environment.

#### 6.2.1 Linux and Apple MacOS PATH

#### 6.2.2 Microsoft Windows PATH

This is the sequence of commands to set the PATH for Microsoft Windows, the screen captures are below:

1. Open the File (Windows) Explorer.
2. Right-click on *This PC* (*My PC on older versions of Windows)
3. Click on *Properties* to open the properties window
4. Click on *Advanced system settings* in the properties windows
5. Click the *Environment Variables* button in the advanced settings window
6. Click on the *Path* under *User Variables* in the environment variables window
7. Click the *Edit* button. There are two versions of the Edit dialog, Windows 7 and Windows 10.
8. For Windows 7 and earlier:
    - Append the directory where you expanded Node.js to the end of the path with a semi-colon as the separator,
    e.g. add ";C:\Users\jmussman\Node\node-v12.18.1-win"
9. For Windows 10 and later:
    - In the *Edit environment variable* window click the *New* button to add a new directory
    - Enter the directory where you expanded Node.js, e.g. "C:\Users\jmussman\Node\node-v12.18.1-win"
10. Click three OK buttons to close the dialogs and then close the advanced settings window.

Windows environment variables dialog with Windows 10 edit environment variable dialog:

![](.common/windows-path.png?raw=true)

Windows 7 edit user variable dialog (instead of the PATH broken into separate strings):

![](.common/windows7-path.png?raw=true)

### 6.3 Check Node.js

That's it, your all done.
Check that Node.js is available by running the following commands in a new terminal window ($ is the prompt).
The version numbers that you see may be higher, the point is that both commands run:

> $ node -v<br/>
> v12.18.1<br/>
> $ npm -v<br/>
> 6.14.5

## 7. Installing Selenium Command-line Runner and Web Driver

The Selenium command line runner is a program will automate Selenium IDE tests and allow them to be provisioned as part
of a software development pipeline, e.g. DevOps CI/CD.
The command line runner depends on a web driver, a program that communicates with a web browser.
There is a different web driver for each web browser.

The command line runner and web drivers are installed using *npm* (Node Package Manager).
In a terminal (command) window, install the command line runner with ($ is the prompt):

> $ npm install -g selenium-side-runner<br/>

There may be warning messages caused by older versions of dependencies, it is safe to ignore these.
What happens is that when a newer version of a package is published, npm may warn you about issues in the older version.
However, the older version is what we need because what we are installing has not been updated yet.
Such is life, you get the warnings.

Check that the command line runner is installed by running the following command:

> $ selenium-side-runner --version<br/>
> 3.17.0<br/>

Install the driver (or drivers) appropriate for the web browsers you plan on using (pick one or more, we recommend at least the chromedriver):

> $ npm install -g selenium-webdriver<br/>
> $ npm install -g chromedriver<br/>
> $ npm install -g gekodriver<br/>
> $ npm install -g ms-chromium-edge-driver<br/>
> $ npm install -g edgedriver<br/>
> $ npm install -g iedriver<br/>

The *gekodriver* is the Mozilla Firefox driver.

The *selenium-webdriver* can be used with any Selenium WebDriver executable as long as that executable
is found along the user's PATH environment variable.
The other packages deliver and wrap the corresponding driver executable (Chrome, Firefox, etc.) so that you may
just reference them directly.

You need the *selenium-webdriver* for Safari. However, because the Safari WebDriver is licensed and delivered with Safari,
You will have to do some configuration to get it to work.
Visit the Apple documentation at https://developer.apple.com/documentation/webkit/testing_with_webdriver_in_safari#2957277 to
get the instructions.

## 8. Installing a Java Development Kit

If you know that you have Java 8 or higher (64-bit) skip this step (8). If your IDE is installed and working,
go ahead and skip the rest of these setup instructions!

### 8.1 Check for a Java JDK

The Selenium requires a JDK version 8 or higher.
Java SE (standard edition) comes as a runtime and a Java developer kit.
Many computers already have a runtime installed, but for this course a JDK with the compiler must be installed.

A JDK could be installed anywhere on your computer, not necessarily in the system folders.
On Microsoft Windows you can look in *\Program Files\Java* for a folder with *jdk* (not *jre*) in the name.

On Apple MacOS the commercial version installs to */Library/Java/Java Virtual Machines*, so you can look there
for a folder with *jdk* in the name.
Note that if you do find a JDK in the library, the true root of the JDK is under the folder you see: /Library/Java/jdk-?.jdk/Contents/Home.
You will need to know that later.

For all of the operating systems you can also search across the file system looking for "javac".
Any occurrences that you find will be in a *bin* folder under the JDK root folder.

If you find a JDK version 8 or higher that will suffice, with one caveat.
You need a 64-bit JDK.
All JDKs version 9 and higher are only available in 64-bit versions.
JDK 8 was available for Windows in a 32-bit version, and unfortunately there isn't any easy way to check except that
the 64-bit Oracle JDKs install to C:\Program Files\Java and the 32-bit Oracle JDKs install to C:\Program Files (x86)\Java.
If you are not sure what you have, install a new one.

### 8.1 Oracle Commercial JDK

The fast way to install a JDK is to download a commerical version installer from Oracle, the current version
is available at https://www.oracle.com/java/technologies/javase-jdk14-downloads.html.
Administrative rights are required to install them, because these packages will install to an operating system folder on your computer;
*Program Files\Java* on Microsoft Windows, /Library/Java on Apple MacOS, and to /usr/bin and /usr/lib on Linux.
After JDK 8 only 64-bit versions are a available, and you should only be using them.

If you have concerns about Oracle's new Java licensing, it does specifically state that Java
is free for doing development: https://www.oracle.com/technetwork/java/javase/overview/oracle-jdk-faqs.html.

### 8.2 Open JDK

If you are not allowed to install the Oracle JDK, probably compliance issues or you lack administrative privileges,
then the open-source version is what you need.
Freely usable JDKs are available from the Open JDK project at https://openjdk.java.net/.
The download link on that page to get the Java 14 JDK will take you to https://jdk.java.net/14/.
The Microsoft Windows version is delivered as a zip file, and the Linux and Apple MacOS versions are delivered as a tar file.
These can be expanded anywhere on the system as long as you remember where you did it. Our recommendation is that you expand the JDK
into a *Java* folder in your home directory, which allows for other JDKs to be installed alongside of it.

### 8.3 Check the JDK

Unfortunately there isn't anything we can do right now to check the JDK, we would need to write a program.
And, if you have a version 8 JDK, unfortunately there is not any simple way to make sure it is a 64-bit version.

## 9. Installing an IDE

Strictly speaking, you can use any integrated development environment (IDE) that supports Java.
This course is designed around IntelliJ IDEA and Eclipse, and if you are taking this course at work your employer will
have set which IDE should be used so please make sure that you have the correct one.

Both of these IDEs are available for Microsoft Windows, Apple MacOS, and Linux.

### 9.1 IntelliJ IDEA

IntelliJ IDEA comes in a community or enterprise version, either one will work for this course.
You can download and install the community version or an enterprise trial version from https://www.jetbrains.com/idea/download/.

IntelliJ IDEA comes bundled with its own Java to run.
Administrator privileges are required to install ItelliJ IDEA, it installs into operating system folders on your computer.

During installation take of the defaults, but on the third screen of the installation make sure the 32-bit launcher is not checked and the 64-bit launcher is.

Run IntelliJ IDEA.
There will be several screens of initial setup, what you choose here is not important.
Once you reach the splash screen choose *Create New Project* and in the new project window make sure that Java is selected.

In the pull-down list for the *Project SDK*, if your JDK is not available then choose "Add JDK" and find the JDK that you are going to use.
Click the *Next* button to lock it in, and then click the *Cancel* button.

![](.common/idea-set-jdk.png?raw=true)

Everything should be set, but if you want to make sure visit https://github.com/nextstepitt/java-check-config and
follow the *Maven* instructions to import and run the project to check your configuration.
You will be able to pick your JDK when the project is imported, you have already primed the list with it.

### 9.2 Eclipse

Eclipse is a popular free IDE, and some other popular IDEs are built on top of it, like the Spring Tool Suite.
If you need to install a version of Eclipse, you will need to install the JDK first because Eclipse does not come with Java bundled.

#### 9.2.1 Use the Eclipse Installer

You will need to have the Java JDK installed be
The core Eclipse tool may be installed in two ways: by installing a package installer and then choosing the necessary modules (requires administrative privileges), or by simply downloading a zip or tar file and expanding the folder anywhere you want on your system.

available at https://eclipse.org.

#### 9.2.2 Install Eclipse Manually

## 10. Java Preparation

This course depends on basic Java programming skills.
If you are an experienced object-oriented programmer (C++, C#, etc) but feel weak with Java, you may want to invest a few hours
to bring yourself up to speed.
There is NO MANDATE to do any work, these are just offered as free sources that may help you:

|Source|Description|
|---|---|
|https://www.tutorialspoint.com/java/index.htm|A written overview of the Java language and syntax, a quick read if you are an experienced programmer.|
|https://www.codecademy.com/learn/learn-java|A fairly involved tutorial with coding work, about 25 hours. You must register for an account.|

## 11. Dependencies (enterprise administrators)

THe course dependencies are listed here if the class is working behind a firewall with employer repositories, so that the
appropriate dependencies may be added and served from those repositories by their administrators.
There is nothing to do here if you are performing the setup on your computer for class.

### 11.1. Node.js Packages

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

### 11.2. Maven Artifacts

#### 11.2.1. General Artifacts

These Artifacts are required regardless of the version of Selenium used.

|Group Id|Artifact Id|Version|
|---|---|---|

#### 11.2.2. Selenium 3 Artifacts

Selenium 3 is the current stable release.
The underlying assumption is just that most folks will want to use the current stable release 3 so the course is configured that way.
There is no reason that it cannot be used for the course, see the next section for the artifact versions.

|Group ID|Artifact ID|Version|
|---|---|---|
|org.seleniumhq.selenium|[selenium-java](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-java)|3.141.59|
|org.seleniumhq.selenium|[selenium-chrome-driver](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-chrome-driver)|3.141.59|
|org.seleniumhq.selenium|[selenium-firefox-driver](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-firefox-driver)|3.141.59|
|org.seleniumhq.selenium|[selenium-safari-driver](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-safari-driver)|3.141.59|
|org.seleniumhq.selenium|[selenium-edge-driver](org.seleniumhq.selenium:selenium-edge-driver)|3.141.59 (this is the original Microsoft Edge<sup>1</sup>)|
|org.seleniumhq.selenium|[selenium-ie-driver](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-ie-driver)|3.141.59|

1: Microsoft Edge Chromium may be used with Selenium 3, but you have to jump through some hoops: https://docs.microsoft.com/en-us/microsoft-edge/webdriver-chromium?tabs=c-sharp.

#### 11.2.3. Selenium 4 Artifacts

Selenium 4 is currently in alpha release.
There is no reason that it cannot be used for the course, and the Maven projects have a pom.selenium4.xml file that can be used
in place of the pom.xml file that references the following artifacts.
Note the inclusion of Microsoft Edge Chromium in Selenium 4. 

|Group ID|Artifact ID|Version|
|---|---|---|
|org.seleniumhq.selenium|[selenium-java](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-java)|4.0.6-alpha-6|
|org.seleniumhq.selenium|[selenium-chrome-driver](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-chrome-driver)|4.0.6-alpha-6|
|org.seleniumhq.selenium|[selenium-firefox-driver](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-firefox-driver)|4.0.6-alpha-6|
|org.seleniumhq.selenium|[selenium-safari-driver](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-safari-driver)|4.0.6-alpha-6|
|org.seleniumhq.selenium|[selenium-edge-driver](org.seleniumhq.selenium:selenium-edge-driver)|4.0.6-alpha-6 (this is the new Microsoft Edge Chromium)|
|org.seleniumhq.selenium|[selenium-ie-driver](https://search.maven.org/artifact/org.seleniumhq.selenium/selenium-ie-driver)|4.0.6-alpha-69|
