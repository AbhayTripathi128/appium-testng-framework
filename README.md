
📱 Appium TestNG Automation Framework
A scalable mobile automation framework built using Appium + TestNG + Java, designed with Page Object Model (POM), Flows, and Data-Driven Testing, and integrated with GitHub Actions CI.

🚀 Tech Stack
Language: Java
Automation: Appium (Android)
Test Framework: TestNG
Build Tool: Maven
Design Pattern: Page Object Model (POM) + Flows
CI/CD: GitHub Actions
Logging: SLF4J + Logback
Reporting: Console logs + screenshots on failure

🧩 Framework Features
✔ Clean separation of main and test code (Maven best practices)
✔ Page Object Model with reusable actions
✔ Flow layer for navigation (Login → Product → Cart)
✔ Data-Driven Testing using TestNG @DataProvider
✔ Automatic screenshot capture on test failure
✔ Centralized logging (console + file)
✔ Business logic validation (cart total calculation)
✔ CI pipeline using GitHub Actions

📂 Project Structure
src
├── main
│   └── java
│       ├── pages        # Page Objects (Login, Product, Cart)
│       ├── flows        # Business flows (LoginFlow, CartFlow)
│       ├── utils        # Wait utils, gestures, screenshot utils
│
├── test
│   └── java
│       ├── base         # Base test setup
│       ├── tests        # Test classes
│       ├── listeners    # TestNG listeners
│       └── dataproviders# Test data providers
│
├── logs                 # Execution logs (ignored in git)
├── screenshots          # Failure screenshots (ignored in git)
└── pom.xml

▶️ How to Run Tests Locally
Prerequisites
Java 17+
Maven
Android SDK
Appium Server
Android Emulator or Real Device

🧪 Test Execution Strategy
Each data-driven test iteration starts with a fresh app state
App reset handled using:
terminateApp() + activateApp() (Appium 2.x compatible)
Navigation handled via Flows, not tests

📸 Screenshots & Logs
Screenshots captured automatically on test failure
Logs generated for:
Test lifecycle events
Page-level actions
Logs location:
logs/test-execution.log

🔄 CI/CD (GitHub Actions)
CI pipeline runs on every push and pull request
Validates:
Maven build
Project structure
Dependency integrity
UI execution with emulator can be enabled as a future enhancement.

📌 Future Enhancements
Allure / Extent reporting
Android Emulator execution in CI
Cloud device integration (BrowserStack / Sauce Labs)
Parallel execution

👤 Author
Abhay Tripathi
Automation Engineer | Appium | Selenium | TestNG | CI/CD
