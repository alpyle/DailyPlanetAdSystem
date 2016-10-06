This project was originally created by Adam Pyle, Justin Johnson, Sarah Harris, and Nicole Bain for CSC-340, Software engineering.

NOTE: Justin, Sarah, and Nicole handled most of the UI design after I showed them the basics of java interfaces. The backend was equally written by all of us, and I helped to handle anything that gave the others trouble due to my greater level of experience. I also handled the database design and implementation, as well as teaching the other group members how to interact with a remote database using code within Java.

The project objective was to create a functioning system to manage ads for a newspaper printing company, and to enable reporting based on those ads.

It isn't perfect, but considering that all the code written here resulted from about 3 weeks of actual development time, it came out pretty good.

This project was written in java using netbeans, in conjunction with a simulated LAN apache server and mysql installation using XAMPP (https://www.apachefriends.org/index.html).

To run: 1. Install xampp.
	2. Start the apache and mysql components from the control panel
	3. Create a new database in mysql titled 'ad', exactly as spelled
	4. run the sql commands contained within ad.sql in this folder on that database.

If that went successfully, the program can be run either using the jar in the  "dist" folder, or by opening the project in netbeans and compiling it, so long as xampp is running 
with both of the aforementioned components started.
