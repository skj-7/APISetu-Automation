# APISetu-Automation
API automation for [api setu's API](https://apisetu.gov.in/directory/api/cowin/cowin-public-v2)
## Test cases covered:
    - Validate the state id of Karnataka is "16".
    - Validate the district id of Bangalore Urban is "265"
    - Validate  that all states/UTs have their state_id
    - Validate the price of vaccine does in Hospital "Springleaf Healthcare" [State :   Karnataka, District : Bangalore Urban] is > Rs 300
    - Validate that atleast one Hospital is providing vaccine as Free    
## Frameworks
    - TestNG
    - RestAssured
## How to run test cases
Run the [testng.xml](./testng.xml) file in Intellij 
