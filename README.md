<div align="center">
    <img src="https://img.shields.io/badge/Java-007396?logo=java&logoColor=FFFFFF&style=for-the-badge" />
    <img src="https://img.shields.io/badge/EclipseLink-2C2255?logo=eclipse&logoColor=FFFFFF&style=for-the-badge" />
    <img src="https://img.shields.io/badge/MySQL-4479A1?logo=mysql&logoColor=FFFFFF&style=for-the-badge" />
</div> 

# One-to-Many Demo App

The purpose of this mini application is to practice implementing a 'one-to-many' relationship in MySQL. Please note that this app does not include a GUI or API; the students are loaded directly from the main class.

## Demo

The database is empty:
<br>
![empty-database](img/1-mysql-database-empty.PNG)
<br>

We execute the code to create the tables in the database.
![run-code](img/2-run-the-code-to-create-tables.PNG)
<br>

Tables created successfully.
<br>
![tables created succesfully](img/3-tables-created.PNG)
<br>

The 'Career' table is empty.
<br>
![empty-career-table](img/4-empty-career-table.PNG)
<br>

The 'Student' table is empty.
<br>
![empty-student-table](img/5-empty-student-table.PNG)
<br>

The 'Subject' table is empty.
<br>
![empty-subject-table](img/6-empty-subject-table.PNG)
<br>

Next, I will demonstrate how I loaded the data from the Main class. For testing purposes, I assigned arbitrary ID numbers to the subjects to showcase that the app creates them sequentially:
<br>
![adding-the-first-student](img/7-adding-the-first-student.PNG)
<br>

List of students. Please note that the date of birth was not modified, as it is irrelevant for our focus, which is the one-to-many relationship between 'Career' and 'Subject,' as well as the many-to-one relationship between 'Subject' and 'Career':
<br>
![students-list](img/9-students-list-mysql.PNG)
<br>

List of careers:
<br>
![careers-list](img/8-careers-list-mysql.PNG)
<br>

List of subjects:
<br>
![subjects-list](img/10-subjects-list-mysql.PNG)
<br>

