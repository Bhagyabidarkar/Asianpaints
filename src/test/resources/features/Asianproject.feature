Feature: user Action on AsianPaints
Background:
Given open the Browser and url shoud be navigated
#And Click on Login icon 
#And Enter Phonenumber of ten Digits
#And Click on proceed
#When user mouse hover on Services
Then Subfeatures should be Displayed


Scenario: To validate that user should be able to mouse hover on services
Then Subfeatures should be Displayed


#Scenario: To Validate that user able to ScrollDown The WebPage until Interior Wall Painting ImageLink and Royale Glitz Page should be Displayed 
#And  click on Painting Services link
#And ScrollDown The WebPage until Interior Wall Painting ImageLink
#And Click on Interior Wall Painting ImageLink
#When Click on ROYALE GLITZ
#Then Royale Glitz Page should be Displayed
#


Scenario: To validate That Find your perfect Wall Paint Product with a few clicks Page should Display.
When user mouse hover on Services
And  click on Wall paint product finder
And  click on Interior radio button
And  click on Yes radio button
And   click on Gloss 
And  click on  Wall proceed
Then  enter the valid creadential
And  click on View Recommendations button

Scenario: To validate that Interior Design Budget Calculator Page should Display
And click on  Interior design services
And ScrollDown The WebPage until Interior Design Calculator ImageLink
When click on Interior Design Calculator ImageLink
Then Home Interior Design Budget Calculator Page should be Displayed

#Scenario Outline: Validate that user should be able to select multiple checkboxes.
#When  click on Wood paint product finder
#And ScrollDown the WebPage until the Premium range wood finish explore button
#And click on Premium range wood finish explore button
#Then the user selects the <filter> checkbox in the filter
#
#Examples:
     #|  filter  |
        #| 0 |
        #| 1 |
        #| 2 |
        #
        #
