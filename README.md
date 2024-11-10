# Mumzworld Webstore Automation Script
# Overview
This project contains an automation script for testing the core e-commerce flow on the Mumzworld webstore. The script automates the process of searching for a product, adding it to the bag, updating the quantity, proceeding to checkout, and registering a new user. The code is written in Java to demonstrate essential e-commerce functionality testing.

# Features
The script automates the following scenario:

Open the Mumzworld Webstore – Launch the web application.
Search for a Product – Search for a specified product to test search functionality.
Add Product to Bag – Add the selected product to the shopping bag.
View Bag – Go to the shopping bag page to verify item details.
Increase Quantity – Update the item quantity in the shopping bag to 5.
Proceed to Checkout – Move to the checkout process.
Register a New User – Simulate the registration of a new user on the checkout page.
Prerequisites
[Programming Language] Java
[Testing Framework]  Selenium
WebDriver or any necessary drivers for the chosen browser (e.g., ChromeDriver for Chrome, GeckoDriver for Firefox).
Faker Library (optional, if generating random user data) - install with pip install faker (Python) or add as a dependency in your pom.xml (Java).
Browser (Chrome, Firefox, or any other supported browser).
Setup Instructions
Clone the repository:

bash
Copy code
git clone https://github.com/vshashank00/mumzworld-automation.git
cd mumzworld-automation
Install required dependencies:

Java (Maven): mvn install
Update configuration (optional): Modify any configuration file to include paths for WebDriver or specify the search term and user data.

Script Execution
To execute the automation script:
# For Java (Maven):
mvn test
Script Flow
Open Browser and Launch Webstore: The script opens the specified browser and navigates to the Mumzworld homepage.
Search Product: Uses the search functionality to look up a product by name.
Add Product to Bag: Selects a product from the search results and adds it to the shopping bag.
View Bag: Navigates to the bag page to view the selected items.
Increase Quantity: Updates the quantity of the item in the bag to 5.
Proceed to Checkout: Clicks on the checkout button to initiate the checkout process.
Register a New User: Fills out the registration form using randomly generated data for a new user.
