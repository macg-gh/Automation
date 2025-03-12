This is a repo for me to learn cucumber alongside a training course.

To create the project and run what I have included in this repo, the following is required.

Java on windows:
https://www.oracle.com/ca-en/java/technologies/downloads/
Including the java bin directory in windows %Path system variable is recommended.

Eclipse:
https://www.eclipse.org/downloads/packages/
Install Eclipse IDE for Java Developers
Unzip download and use .exe to launch Eclipse IDE.
Select workspace when prompted.
Close welcome tab.
Install Plugins via Help -> Eclipse Marketplace search function
Select option to trust plugins when installer prompts.
  Cucumber Eclipse Plugin
  TestNG for Eclipse

Right click in Package Explorer and click New Project
Select Maven Project and click Next
Check Create a simple project (skip archetype selection)
Type desired name in artifact ID (Automation in my case)
Type group name to reflect any items this may be grouped with or authorship (initials in my case)

Expand new folder matching artifact ID.
Double click pom.xml
Browse to mavenrepository.com and search for Cucumber JVM.
Locate and click on Cucumber JVM: Java <version>
Select latest version
Copy the lines from the Maven tab
Paste them into project pom file under dependecies (edit XML if it doesn't have dependencies already)
Browse to mavenrepository.com and search for Cucumber JVM
Locate and click on Cucumber JVM: TestNG
Select latest version
Copy the lines from the Maven tab
Paste them into project pom file under dependecies (edit XML if it doesn't have dependencies already)


Now you can use the files from this repo that define the cucumber tests:
src/test/Java/cucumberOptions/*
src/test/Java/features/*
src/test/Java/stepDefinitions/*





  



