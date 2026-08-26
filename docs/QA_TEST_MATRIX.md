# QA Test Execution Matrix - Sprint 1
* **QA Tester:** @username
* **Client Deliverable:** Console Interactive Kiosk

| Test ID | Target Input Field | Test Input Description | Expected Output | Actual Behavior | Status (Pass/Fail) |
| :--- | :--- | :--- | :--- | :--- | :--- |
| TC-01 | Full Name | Standard text (`"Jane Doe"`) | Formatted correctly in ASCII box | Formatted correctly in ASCII box | pass |
| TC-02 | Department/Role | Blank input (`""`) | Handles gracefully without crash | Handles gracefully without crash | pass |
| TC-03 | Email / Contact | Valid string (`"test@bch.org"`) | Stored & printed accurately | stored & printed accurately | pass |
| TC-04 | Badge Tier | Lowercase text (`"vip"`) | Clean output on badge | Clean output on badge | pass |
