![](.common/nsbanner.png?raw=true)

# NS61001 Java-based Testing with Selenium - Setup Instructions

## License

The lab framework code is licensed under the MIT license. The corresponding courseware is not. You may use and modify all or part of it as you choose, as long as attribution to the source is provided per the license. See the details in the [license file](./LICENSE.md) or at the [Open Source Initiative](https://opensource.org/licenses/MIT)

## Required Components

* Microsoft Windows, Apple MacOS, or a Linux computer, 8GB recommended
* Google Chrome, Mozilla Firefox, or Microsoft Edge Chromium
* Node.js version 10+
* Selenium IDE and WebDriver for the browser selected
* Java Development Kit version 8+
* IntelliJ IDEA Community or Professional IDE, or Eclipse IDE
* Network access to the Maven repository at https://repo.maven.apache.org  
* Network access to https://github.com

There are various requirements and options for installing components. If you are using employer equipment first check your employer’s policies. Sometimes there are restrictions on what software you may install. Software may have to be installed from internal employer sources, not from the component source. Some of these components will require administrative privileges.

The following instructions source the components from their original sources, but the installation instructions may still have useful information if the components must be installed from an internal software repository.

## Web Browsers

Google Chrome, Mozilla Firefox, or Microsoft Edge Chromium are the only three browsers that support Selenium IDE. All of these browsers update themselves, so if one or more are already installed you should have current versions of whatever you have installed, but it is worthwhile to double-check. If your version is relatively recent that is close enough.

The current release information for Google Chrome is provided at https://chromereleases.googleblog.com/. The current release information for Mozilla Firefox is provided at https://mozilla.org/firefox/releases. The current release information for Microsoft Edge Chromium is at https://docs.microsoft.com/deployedge/microsoft-edge-relnote-stable-channel.

Google Chrome may be downloaded and installed from https://google.com/chrome. Mozilla Firefox may be downloaded and installed from https://mozilla.org/firefox. Microsoft’s Edge Chromium browser may be downloaded and installed from https://microsoft.com/edge. 

### Network Connectivity
The labs require the Node.js and Maven repositories. If you are using your own computer or your employer does have internal versions of these repositories for software development, please make sure that you can reach the following three URLs without errors (the content displayed for each in the browser is irrelevant):

* https://github.com
* https://registry.npmjs.com
* https://repo.maven.apache.org

## Selenium IDE

Selenium IDE is a plugin for the Chrome and Firefox web browsers. The new Edge browser is Chromium, the core of Chrome, so it will use the Chrome plugin. The Selenium WebDriver will be installed later, after you install Node.js.

### Google Chrome and Microsoft Edge Chromium

Visit https://google.com/chrome/webstore. Search for “Selenium IDE” and install it:

![](.common/chrome-se-ide.png?raw=true)

If you are using Edge, you will need to authorize Edge to use the Google Chrome webstore by clicking a button at the top of the browser window where it prompts you for this.

### Mozilla Firefox

Visit https://addons.mozilla.org, search for “Selenium IDE”, and then install it:

![](.common/firefox-se-ide.png?raw=true)

## Node.js

Node.js is a desktop JavaScript interpreter to run JavaScript programs outside of a Web Browser. We need it to install the Selenium Command-line Runner and Web drivers.

Node does not require administrative support, and it should be installed just for the user installing it. Download and install the current long-term-support version of Node from https://nodejs.org:

After installing node 

## Selenium Command-line Runner and Web Driver

The Selenium command line runner is a program will automate Selenium IDE tests and allow them to be provisioned as part
of a software development pipeline, e.g. DevOps CI/CD.
The command line runner depends on a web driver, a program that communicates with a web browser.
There is a different web driver for each web browser.

The command line runner and web drivers are installed using *npm* (Node Package Manager).
In a terminal (command) window, install the command line runner with ($ is the prompt):

> $ npm install -g selenium-side-runner

Install the driver (or drivers) appropriate for the web browsers you plan on using (pick one or more):

> $ npm install -g chromedriver<br/>
> $ npm install -g gekodriver<br/>
> $ npm install -g ms-chromium-edge-driver<br/>
> $ npm install -g edgedriver<br/>
> $ npm install -g iedriver<br/>

The *gekodriver* is the Mozilla Firefox driver.
Safari's driver is delivered with Safari, but you have to do some configuration to get it to work.
Visit the Apple documentation at https://developer.apple.com/documentation/webkit/testing_with_webdriver_in_safari#2957277 to
get the instructions.

## Java Development Kit

The Java labs require a JDK version 8 or higher.
Java SE (standard edition) comes as a runtime and a Java developer kit.
Many computers already have a runtime installed, but for this course a JDK must be installed.
You can check to see if you have a JDK, and which version, by trying to run the compiler in a terminal window ($ is the prompt):

> $ javac -version

Oracle recently changed the how its Java licensing works.
The change prevents you from using Java without a license to run applications, but it specifically states that Java
is free for developing new software: https://www.oracle.com/technetwork/java/javase/overview/oracle-jdk-faqs.html.
The Oracle JDK is delivered in as an installable package for your operating system. 
However, if you are not installing it from your employer, you will have to create and use a free Oracle account if you want to download the JDK from https://www.oracle.com/java/technologies/javase-downloads.html.

Freely usable JDKs are available from the Open JDK project at https://openjdk.java.net/, but they do require a bit more work to install.
The download link on that page to get the Java 14 JDK will take you to https://jdk.java.net/14/.
The Microsoft Windows version is delivered as a zip file, and the Linux and Apple MacOS versions are delivered as a tar file.
These can be expanded anywhere on the system as long as you remember where you put it, we recommend that you expand the JDK
into a *Java* folder in your home directory.

## IDE

Strictly speaking, you can use any integrated development environment (IDE) that supports Java.
This course is designed around IntelliJ IDEA or Eclipse, and if you are taking this course at work your employer will
have set which IDE should be used so please make sure that you have the correct one.

Both of these IDEs are available for Microsoft Windows, Apple MacOS, and Linux.

### IntelliJ IDEA

IntelliJ IDEA comes in a community or enterprise version, either one will work for this course.
You can download and install the community version from https://www.jetbrains.com/idea/download/.
Administrator privileges are required to install ItelliJ IDEA.

### Eclipse

Eclipse is a popular free IDE, and some other popular IDEs are built on top of it, like the Spring Tool Suite.
The core Eclipse tool may be installed in two ways: by installing a package installer and then choosing the necessary modules (requires administrative privileges), or by simply downloading a zip or tar file and expanding the folder anywhere you want on your system.

available at https://eclipse.org.

