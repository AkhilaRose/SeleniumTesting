# SeleniumTesting

Selenium-Maven-TestNG framework.

Implemented Plain Page Object Model.

Added Extent Reporting in addition to the TestNG inbuild Reports. Report will be generated with timestamp in TestReport folder with screenshot in case of failed test cases.

Given support to chrome, firefox, edge.

**Maven Project Execution without using any IDE after downloading project to local system-> Select CMD and go to project path where pom.xml file is loacted and execute following commands:**

To execute in chrome->mvn test -Dbrowsername=chrome

To execute in firefox->mvn test -Dbrowsername=firefox

To execute in microsoft edge->mvn test -Dbrowsername=edge

**Extent Reports(Testng.xml):SeleniumUiTesting/TestReport**

**Test cases covered-Orange HRM-https://opensource-demo.orangehrmlive.com/**

1.Verify login page heading

2.Verify login button is displayed or not

3.Verify  dashboard menu is displayed or not

4.Verify logout button is displayed or not

**Prerequisites**

1. Java 8/+ should be present and environment variable should be set in the local system.
2. Maven should be present and environment variable should be set in the local system.
3. All browsers mentioned above should be present in the local system.

If you find this repository useful, don't forget to give it a ⭐ on GitHub.



