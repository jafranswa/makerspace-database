Overview: Makerspace-mvc

With the DIY movement has come the advent of the makerspace. It is common in a growing co-op of DIYers entually space access, tool access, and simply who knows how to use what becomes logistical issue.

Makerspace-mvc is an application designed to provide a basic level of organizatin to makerspace building and equipment access.  The application catalogs membership, who has access to what equipment, schedual of equipment tutorial courses, and who instructs the courses.  The interface consists of an instructor login were a course schedual can be viewed and classes, students, and members can be created.  

The application is capable of connecting to an RFID card reader built on the arduino microcontroller platform.  This card reader hardware is capable of opening and closing electronic locks or turning off and on equipment based on a members RFID access privlages.  

Features:
- Login
- course calendar
- course email confirmation
- create member
- add/cancel course
- add/remove member from class
- manual addition of access without taking a class 
  (can be used for granting access privlage to door or similiar fringe cases)

Technologies:
- Java
- springboot
- sql
- CRUD
- email api stuff for confirmation emails
- bootstrap
- UDP 
- arduino hardware 

What I'll Have to Learn:
- possibly a few new code libraries for arduino 
- email api stuff
- UDP 