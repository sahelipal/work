Outreach Project Automation
---------------------------------------
Project Overview
---------------------------------------- 

This project focuses on automating the validation process 
for the Outreach application within the Be. Cognizant website. 
The main tasks include navigating the website, accessing Outreach, and 
validating various features such as menus, sub-menus, event filters, and event 
details to ensure they work correctly.

----------------------------------------------------------------------------------
## Problem Statement
----------------------------------------------------------------------------------
The objectives of this project are to:
- Validate the current event displayed in Outreach.
- Retrieve and validate event details from Outreach.
- Validate all menus and sub-menus within Outreach.
- Verify the filter options in Outreach.
- Ensure events based on user interests are visible.
- Confirm the accuracy of event details.
--------------------------------------------------------------------------------------------------
Libraries and Dependencies
--------------------------------------------------------------------------------------------------
Maven Repository: Maven 3.12.1

Apache POI: 5.2.5

TestNG: 7.9.0

Extent Report: 5.1.1

Selenium WebDriver: 4.17.0

Cucumber: 7.15.0
-----------------------------------------------------------------------------------
## Project Steps

1. **Navigate to Be. Cognizant Website:**
   - Capture user information to ensure a personalized experience.
   - Click on One Cognizant Application to access internal applications and tools.

2. **Access Outreach Application:**
   - Use the search bar to search for "Outreach".
   - Click on the Outreach application from the search results.
   - Ensure the application loads correctly.

3. **Validate Menus and Sub-menus:**
   - Hover the mouse cursor over various menus and sub-menus.
   - Print and verify that all menus and sub-menus are visible and functioning correctly.

4. **Event Details Validation:**
   - Retrieve and print details of events based on user interests.
   - Validate that these events are displayed correctly in Outreach.

5. **Search Event Filter Validation:**
   - Validate the search event filter options by testing various criteria such as location, event type, weekend/weekdays, 
     and date range.
   - Print the results of the search to ensure filters are working correctly.

6. **Random Location Event Validation:**
   - Repeat the event filter validation by selecting a random location.
   - Print and verify the search results to ensure consistency and accuracy.

7. **My Volunteering Section:**
   - Click on the "My Volunteering" section.
   - Access the "Volunteers Around Me" feature.
   - Print all volunteer cards displayed to verify the information is accurate and complete.

## Key Automation Scope

The automation scope of this project includes:
- Handling alerts and different browser windows.
- Implementing search functionality.
- Navigating back to the home page.
- Extracting multiple options and storing them in collections for validation.
- Capturing and handling warning messages.
- Employing a data-driven approach for testing.
- Performing cross-browser testing to ensure compatibility across different web browsers.

## Screenshots and Data Logging

Throughout the testing process:
- Take necessary screenshots for all test cases to document and validate each step.
- Print all relevant data in the console to ensure transparency and accuracy in the validation process.

------------------------------------------------------------------------------------------------------------
## Challenges and Solutions

- **Challenges:**
  - Handling dynamic web elements.
  - Ensuring compatibility across different browsers.
  - Managing alerts and multiple browser windows.
- **Solutions:**
  - Implement robust automation scripts to handle dynamic elements.
  - Conduct thorough cross-browser testing.
  - Use appropriate methods to handle alerts and windows.
-----------------------------------------------------------------------------------------------------------

## Conclusion

The Outreach Project Automation successfully validated the key functionalities of the Outreach 
application. The automated tests ensured that events, menus, filters, and other features work as 
expected. Future work includes further enhancements and continuous monitoring to maintain the 
application’s reliability.

-------------------------------------------------------------------------------------------------------
Contributors
---------------------------------
Likith Shetty – 2332843

Saheli Pal – 2332907

Shreyasi Mondal – 2332934

Bhakti Kharate - 2332833



