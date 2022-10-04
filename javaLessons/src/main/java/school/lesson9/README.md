
Test Case 1. (positive)

|  #  | Steps                                                               | Expected Result                                                 |
|:---:|:--------------------------------------------------------------------|:----------------------------------------------------------------|
|  1  | Go to the website https://www.euronews.com/ .                       | The Homepage of the site is open.                               |
|  2  | Click top menu link "Newsletters" in the header.                    | Page "Newsletters" is open.                                     |
|  3  | Click "See preview" of "The Briefing" newsletter subscription plan. | The preview of the required plan is open.                       |
|  4  | Close the application pop up.                                       | The pop up with the preview of the subscription plan is closed. |
|  5  | Select "The Briefing" newsletter subscription plan.                 | An email form has appeared at the bottom of the page.           |
|  6  | Enter a valid email, click "Submit" button.                         | The pop up with subscription confirmation is open.              |                                               |



Test Case 2. (negative - no message for an invalid email without)

|  #  | Steps                                                                                                            | Expected Result                                                      |
|:---:|:-----------------------------------------------------------------------------------------------------------------|:---------------------------------------------------------------------|
|  1  | Go to the website https://www.euronews.com/ .                                                                    | The Homepage of the site is open.                                    |
|  2  | Follow the link "Newsletters" in the header.                                                                     | Page "Newsletters" is open.                                          |
|  3  | Click "See preview" of "Culture" newsletter subscription plan.                                                   | The preview of the required plan is open.                            |
|  4  | Close the application pop up.                                                                                    | The pop up with the preview of the subscription plan is closed.      |
|  5  | Select "Culture" newsletter subscription plan.                                                                   | An email form has appeared at the bottom of the page.                |
| 6.1 | Enter an invalid email (only a username), click "Submit" button.                                                 | The message "Please include an @ in the email address" is displayed. |  
| 6.2 | Enter an invalid email with an @ (a username, an @ symbol, a domain name, no dot domain), click "Submit" button. | The message with the error is displayed.                             |



Test Case 3. (negative - error in the preview pop up - "The specified key does not exist")

|  #  | Steps                                                            | Expected Result                                                 |
|:---:|:-----------------------------------------------------------------|:----------------------------------------------------------------|
|  1  | Go to the website https://www.euronews.com/ .                    | The Homepage of the site is open.                               |
|  2  | Follow the link "Newsletters" in the header.                     | Page "Newsletters" is open.                                     |
|  3  | Click "See preview" of "The Watch" newsletter subscription plan. | The preview of the required plan is open.                       |
|  4  | Close the application pop up.                                    | The pop up with the preview of the subscription plan is closed. |
|  5  | Select "The Watch" newsletter subscription plan.                 | An email form has appeared at the bottom of the page.           |
|  6  | Enter a valid email, click "Submit" button.                      | The pop up with subscription confirmation is open.              |                                               |

