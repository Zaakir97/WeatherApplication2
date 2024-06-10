Student number: ST10461764
Name and surname: Zaakir Yassiem

Purpose and explanation of the application:
The purpose of the application is to give the user access to information on the weather for each day of the week.
Information such as average temperature, max temperature, minimum temperature, and the weather conditions.
The application is made up of 3 screens.


The splash screen.
In this screen, you will be prompted with the application's logo and a welcome message.


<img width="381" alt="Screenshot 2024-06-10 at 11 16 29" src="https://github.com/Zaakir97/WeatherApplication2/assets/166869482/906c719e-983e-401c-aca4-48b1783c19b1">

        
The main screen.
In this screen, you will be prompted with each day of the week and the average temperature.


<img width="378" alt="Screenshot 2024-06-10 at 11 16 40" src="https://github.com/Zaakir97/WeatherApplication2/assets/166869482/d21517a5-b7dd-4ebf-989b-6baa70631e4b">


The detail screen.
In this screen, you will be prompted with the specific weather information pertaining to the day you selected on the main screen.


<img width="390" alt="Screenshot 2024-06-10 at 11 16 47" src="https://github.com/Zaakir97/WeatherApplication2/assets/166869482/bc4921bb-fa97-498a-aba0-9c1c979e9469">



Pseudocode for the Weather Application
Splash Screen (Initial Screen)
Start Splash Screen
Display the splash screen with the application logo and welcome message.
Wait for 10 seconds.
Transition to Main Screen.
Main Screen
Start Main Screen
Display average temperature for the week.
Display buttons for each day of the week.
For each button (representing a day of the week):
When button is clicked, store the following data for the respective day:
Day of the week
Minimum temperature
Maximum temperature
Weather condition
Transition to Detailed View Screen, passing the stored data.
Detailed View Screen
Start Detailed View Screen
Retrieve and display the following data:
Day of the week
Minimum temperature
Maximum temperature
Weather condition
Display a back button.
When back button is clicked:
Return to Main Screen.
