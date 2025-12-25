[![CI with GitHub Actions using Ant and JUnit | © 2025 by wangfong](https://github.com/wangfong232/math-util/actions/workflows/ci-junit.yml/badge.svg)](https://github.com/wangfong232/math-util/actions/workflows/ci-junit.yml)

# Math-Util: A Java Library for Factorial Calculation
### 📌 Project Description
This repository features a Java-based mathematical utility focused on computing factorials. The primary goal of this project is to demonstrate professional software quality assurance through Data-Driven Testing (DDT) and Continuous Integration (CI).
---
### 🚀 Core Technical Highlights
#### 1. Data-Driven Testing (DDT)
The project utilizes the Parameterized runner in JUnit 4 to implement a clean separation between Test Logic and Test Data.
* Centralized Data: All test cases (Input/Expected) are managed in a single 2D array.
* Efficiency: A single test method automatically iterates through multiple scenarios, including edge cases (0!, 1!) and standard cases (5!, 6!).
* Scalability: New test scenarios can be added by simply updating the data provider without modifying the assertion logic.
#### 2. Regression Testing with CI
To maintain software stability, a Continuous Integration pipeline is established using GitHub Actions:
* Automation: The pipeline automatically triggers Clean -> Compile -> Test on every push or pull request.
* Reliability: Ensures that any code changes do not break existing mathematical logic (Regression Test).
* Visibility: Real-time build status is displayed via the GitHub Badge at the top of this file.
---
### 🛠 Tech Stack
* Language: Java (JDK 17)
* Testing Framework: JUnit 4.13.2
* Build Tool: Apache Ant
* CI Platform: GitHub Actions
* IDE: IntelliJ IDEA Ultimate / NetBeans
---
### Screenshots
![DDT & TDD with JUnit](https://github.com/wangfong232/math-util/blob/main/images/DDT%20with%20JUnit.png)

#### © 2025 wangfong