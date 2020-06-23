<!-- ![](.common/nsbanner.png?raw=true) -->

# NS61001 Java-based Testing with Selenium - Microsoft Windows Setup Instructions

## Table of Contents

1. [Install Chrome Web Browser](#1.-install-chrome-web-browser)
2. [Check Network Connectivity](#2.-check-network-connectivity)
3. [Install Selenium IDE](#3.-install-selenium-ide)
4. [Install Node.js](#4.-install-node.js)
5. [Install Selenium Command-line Runner and Web Driver](#5.-install-selenium-command-line-runner-and-web-driver)
6. [Install the Java Development Kit](#6.-install-the-java-development-kit)
7. [Install Eclipse IDE](#7.-install-eclipse-ide)
8. [Setup Complete](#8.-setup-complete)

## 1. Install Chrome Web Browser

The current version of Google Chrome web browser is required for the class.
If you need to install Chrome:

1. Download the Chrome installer from https://google.com/chrome.
2. Run the installer.
3. Accept all of the default settings.
4. At the end of the installation migrate settings if you want to, but it is not required for this class.
5. It is not necessary to make Chrome the default browser.

## 2. Check Network Connectivity

1. Open a new tab in Chrome.
2. Check each of these links. The content is not important, just make sure you can get to them without an error:
    * https://github.com
    * https://registry.npmjs.com
    * https://repo.maven.apache.org

## 3. Install Selenium IDE

1. Open a new tab in Chrome.
2. Visit https://google.com/chrome/webstore.
3. Search for “Selenium IDE”.

![](.common/chrome-se-ide.png?raw=true)

4. Click the install button.
5. Look for a small icon labeled "Se" (for selenium) to the right of the address (URL) field.

![](.common/seleniumide-button.png?raw=true)

6. Click on the button and launch Selenium IDE.
7. Close Selenium IDE on the splash screen by clicking on the "Close Selnium IDE" (the fourth) option.

## 4. Install Node.js

Selenium supports the current long-term-support (LTS) version of Node.

1. Visit https://nodejs.org and download the current LTS version.
2. Run the installer.
3. Accept all the defaults.
4. Launch a new terminal window.
5. Check Node by running the following commands ($ is the prompt, your versions may be different):

> $ node -v<br/>
> v12.18.1<br/>
> $ npm -v<br/>
> 6.14.5<br/>

## 5. Install Selenium Command-line Runner and Web Driver

2. In the terminal window install the command line runner with the following command ($ is the prompt):

> $ npm install -g selenium-side-runner<br/>

3. Check the installation by starting the command line runner (your version may be different):

> $ selenium-side-runner --version<br/>
> 3.17.0<br/>

4. Install the chrome WebDriver with the following command:

> $ npm install -g chromedriver<br/>

5. Close the terminal window.

## 6. Install the Java Development Kit

1. Open a new tab in Chrome.
2. Visit https://www.oracle.com/java/technologies/javase-downloads.html.
3. Click on the JDK Download link.
4. Download the Windows x64 installer.
5. Run the installer, accept all the defaults.
6. Use the File Explorer to verify the installation directory (your version number may be different): C:\Program Files\Java\jdk-14.0.1.

## 7. Install Eclipse IDE

1. Click on the download button at https://www.eclipse.org/downloads/ to download the 64-bit installer.
2. Run the installer.
3. Click on the first option, *Eclipse IDE for Java Developers*:

![](.common/eclipse-installer.png?raw=true)

4. On the next screen leave the installation path at the default. For the "Java 1.8+ VM" field, select the filesystem path to the JDK installed in setup step 6. If it does not appear in the list, click on the file icon next to the field and and go find it:

![](.common/eclipse-jdk.png?raw=true)

5. Accept the license agreement and proceed with the installation.
 
## 8. Setup Complete

Congratulations, you have completed the setup!<br/>
<br/>
![](.common/stop_small.png?raw=true)

<!-- <hr>
Copyright © 2020 NextStep IT Training. All rights reserved. -->