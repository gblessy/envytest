Automation approach for Envygram.
Prerequisites.
There are no test plan or automated tests. Manual testing hasn’t been done. There is no description of API or validation (is it done on frontend or backend). We don’t have any info about Unit tests.

Test Automation Strategy Overview.
Test Automation on Envygram project is going to have 3 main goals: Prevent bugs rather then detect bugs, make regression testing faster and implement ATDD approach to allow developers write code more efficiently. Since we don’t have any automated tests we will start with E2E automated tests to cover 3-5 positive main scenarios. This way we would have Smoke tests asap. All the rest of the tests should be separate (atomic), short and test only one feature. All the frontend logic would be tested with UI Selenium Automated tests, backend logic with API (Integration) tests and code should be covered with Unit tests. For each feature team should provide Definition of Done that include creation of UI Selenium automated tests, API tests and Unit tests. Automated tests should be created for all the major bugs.

Test Suites that would be used during testing.
Smoke test suit. The main goal of this suite is to provide a quick feedback that application is still working and main functionality is not broken. This test suit is used by developers before code is committed to staging, before manual testing.
Bugs suite. The goal of this suite is to prevent reappearance of bugs. Those tests should be run as part of main regression.
Feature test suit. The goal of this suite is to provide quick feedback for each feature. Those tests would be added to regression tests.
Regression suit. This suite should be ran before manual testing and one more time after manual testing before release. It consists of all the Feature test suites and bugs sute.

Tools to be used.
All the tests would be built by Maven. Maven allows us to build our project and get all the needed dependencies automatically. Also we would be using Maven to run our suites using JUnit categories.
JUnit would be used as a main tool to ran our tests. We are going to use JUnit categories to run our tests in suites.
Selenium Web Driver is going to be used as a main test tool.
Allure reports would be used to generate tests reports and do screenshots for each step.
Maven SureFire plugin would be used to make sure that tests are running in a same order every time (while each test would be independent we would be able to know tests order).