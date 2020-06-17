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
The labs require the Node.js and Maven repositories. If you are using your own computer or your employer does have internal versions of these repositories for software development, please make sure that you can reach the following three URLs without errors (what is displayed is irrelevant):

* https://github.com
* https://registry.npmjs.com
* https://repo.maven.apache.org

## Selenium IDE

The Selenium IDE is a plugin for the Chrome and Firefox web browsers. The new Edge browser is Chromium, the core of Chrome, so it will use the Chrome plugin. The Selenium WebDriver will be installed later, after you install Node.js.

### Google Chrome and Microsoft Edge Chromium

Visit https://google.com/chrome/webstore. Search for “Selenium IDE” and install it:

![](.common/chrome-se-ide.png?raw=true)

### Mozilla Firefox

Visit https://addons.mozilla.org, search for “Selenium IDE”, and then install it:

![](.common/firefox-se-ide.png?raw=true)

## Node.js

Node.js is a desktop JavaScript interpreter to run JavaScript programs outside of a Web Browser. We need it to install the Selenium Command-line Runner and Web drivers.
