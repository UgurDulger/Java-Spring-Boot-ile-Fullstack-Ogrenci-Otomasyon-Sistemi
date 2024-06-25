CREATE database StudenstRegistrationSystem;

use StudenstRegistrationSystem;

Create table tbl_students 
(
	id int not null PRIMARY KEY AUTO_INCREMENT,
    name varchar(100),tbl_students
    surname varchar(100),
    school_no varchar (100),
    gender varchar(100)
);

Create table tbl_teacher 
(
	id int not null PRIMARY KEY AUTO_INCREMENT,
    name varchar(100),
    surname varchar(100),
    department varchar (100),
    gender varchar(100)
);

Create table tbl_lesson 
(
	id int not null PRIMARY KEY AUTO_INCREMENT,
    name varchar(100),
	lesson_time varchar(100),
    location varchar(100),
    credit int
);



