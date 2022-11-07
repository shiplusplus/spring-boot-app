--all departments
INSERT INTO department (department_id, department_name) VALUES (1000, 'CS');
INSERT INTO department (department_id, department_name) VALUES (2000, 'EEE');
INSERT INTO department (department_id, department_name) VALUES (3000, 'Chemical');

--CS students
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (16, 'Rajeev','Dwivedi','Rajeev Dwivedi','Rahini','Rajat','8800388403','3249629743',1000);
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (17, 'Pooja','Bhatia','Pooja Bhatia','Rashi','Ronit','8700388004','3248762947',1000);
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (18, 'Sahas','Sahu','Sahas Sahu','Rohini','Rakshit','9000382204','8423028402',1000);
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (19, 'Dewesh','Agrawal','Dewesh Agrawal','Rupika','Rishabh','9000382204','8423028402',1000);
--EEE students
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (26, 'Shivangi','Gupta','Shivangi Gupta','Vaibhavi','Vaibhav','8800988009','1093209310',2000);
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (27, 'Navya','Jain','Navya Jain','Aarti','Ajay','7700977009','32340149010',2000);
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (28, 'Jainam','Gala','Jainam Gala','Mona','Varun','7700988111','1092382991',2000);
--Chemical students
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (36, 'Sagar','Jolly','Sagar Jolly','Ritu','Rohan','8800788007','40293138493',3000);
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (37, 'Prakriti','Kumari','Prakriti Kumari','Roshni','Raj','9600788007','47020402201',3000);
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (38, 'Narayan','Rai','Narayan Rai','Ratna','Vijay','9600788887','4702043423201',3000);

--cs student addresses
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (1601,'Current',16,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (1701,'Current',17,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (1801,'Current',18,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (1901,'Current',19,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
--eee student addresses
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (2601,'Current',26,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (2701,'Current',27,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (2801,'Current',28,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
--chem student addresses
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (3601,'Current',36,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (3701,'Current',37,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (3801,'Current',38,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');

--id 16 semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (16001,1,16);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (16002,2,16);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (16003,3,16);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (16004,4,16);
--id 17 semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (17001,1,17);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (17002,2,17);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (17003,3,17);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (17004,4,17);
--id 18 semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (18001,1,18);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (18002,2,18);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (18003,3,18);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (18004,4,18);
--id 19 semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (19001,1,19);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (19002,2,19);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (19003,3,19);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (19004,4,19);
--id 26 semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (26001,1,26);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (26002,2,26);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (26003,3,26);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (26004,4,26);
--id 27 semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (27001,1,27);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (27002,2,27);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (27003,3,27);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (27004,4,27);
--id 28 semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (28001,1,28);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (28002,2,28);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (28003,3,28);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (28004,4,28);
--sagar (36) semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (36001,1,36);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (36002,2,36);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (36003,3,36);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (36004,4,36);
--id 37 semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (37001,1,37);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (37002,2,37);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (37003,3,37);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (37004,4,37);
--id 38 semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (38001,1,38);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (38002,2,38);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (38003,3,38);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (38004,4,38);

--cs(1000) courses
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (1001, 'OOP', 'Object Oriented Prog',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (1002, 'DSA', 'Data Structures', 4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (1003, 'OS', 'Operating Systems',3);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (1004, 'DBMS', 'Database',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (1005, 'CP Lab', 'Computer Programming Lab',2);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (1006, 'Compilers', 'Intro to Compilers',3);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (1007, 'CompArch', 'Computer Architecture',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (1008, 'CS Thesis', 'Final thesis',5);
--eee(2000) course
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (2001, 'DSP', 'Signal Processing',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (2002, 'MUE', 'Microelectronics',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (2003, 'MUP', 'Microprocessers',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (2004, 'EM', 'Electrical Machines',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (2005, 'PE', 'Power Electronics',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (2006, 'EIIT', 'Electronics Instruments',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (2007, 'ConSys', 'Control Systems',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (2008, 'EEE Thesis', 'Final thesis',5);
--chemical(3000) courses
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (3001, 'Thermo', 'Thermodynamics',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (3002, 'SePro', 'Separation Process',4);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (3003, 'Heat Transfer', 'Heat transfer',2);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (3004, 'Lab', 'Chemical Lab',2);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (3005, 'Materials', 'Material Science',2);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (3006, 'Process Dynamics', 'Chemical Lab',2);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (3007, 'Plant Design', 'Plant Design',2);
INSERT INTO course (course_id, course_name, course_description, credits) VALUES (3008, 'Pollution', 'Design for pollution prevention',2);

--id 16 marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1001016,16001, 1001,100,86,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1002016,16001, 1002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1003016,16002, 1003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1004016,16002, 1004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1005016,16003, 1005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1006016,16003, 1006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1007016,16004, 1007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1008016,16004, 1008,100,74,6);
--id 17 marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1001017,17001, 1001,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1002017,17001, 1002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1003017,17002, 1003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1004017,17002, 1004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1005017,17003, 1005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1006017,17003, 1006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1007017,17004, 1007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1008017,17004, 1008,100,74,7);
--id 18 marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1001018,18001, 1001,100,88,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1002018,18001, 1002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1003018,18002, 1003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1004018,18002, 1004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1005018,18003, 1005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1006018,18003, 1006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1007018,18004, 1007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1008018,18004, 1008,100,74,8);
--id 19 marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1001019,19001, 1001,100,88,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1002019,19001, 1002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1003019,19002, 1003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1004019,19002, 1004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1005019,19003, 1005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1006019,19003, 1006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1007019,19004, 1007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (1008019,19004, 1008,100,74,8);
--id 26 marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2001026,26001, 2001,100,86,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2002026,26001, 2002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2003026,26002, 2003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2004026,26002, 2004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2005026,26003, 2005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2006026,26003, 2006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2007026,26004, 2007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2008026,26004, 2008,100,74,6);
--id 27 marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2001027,27001, 2001,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2002027,27001, 2002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2003027,27002, 2003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2004027,27002, 2004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2005027,27003, 2005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2006027,27003, 2006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2007027,27004, 2007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2008027,27004, 2008,100,74,7);
--id 28 marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2001028,28001, 2001,100,88,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2002028,28001, 2002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2003028,28002, 2003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2004028,28002, 2004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2005028,28003, 2005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2006028,28003, 2006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2007028,28004, 2007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2008028,28004, 2008,100,74,8);
--id 36 marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3001036,36001, 3001,100,86,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3002036,36001, 3002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3003036,36002, 3003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3004036,36002, 3004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3005036,36003, 3005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3006036,36003, 3006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3007036,36004, 3007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3008036,36004, 3008,100,74,6);
--id 37 marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3001037,37001, 3001,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3002037,37001, 3002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3003037,37002, 3003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3004037,37002, 3004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3005037,37003, 3005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3006037,37003, 3006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3007037,37004, 3007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3008037,37004, 3008,100,74,7);
--id 38 marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3001038,38001, 3001,100,88,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3002038,38001, 3002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3003038,38002, 3003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3004038,38002, 3004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3005038,38003, 3005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3006038,38003, 3006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3007038,38004, 3007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3008038,38004, 3008,100,74,8);







