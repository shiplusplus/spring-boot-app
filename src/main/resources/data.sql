--all departments
INSERT INTO department (department_id, department_name) VALUES (1000, 'CS');
INSERT INTO department (department_id, department_name) VALUES (2000, 'EEE');
INSERT INTO department (department_id, department_name) VALUES (3000, 'Chemical');

--students
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (26, 'Shivangi','Gupta','Shivangi Gupta','Vaibhavi','Vaibhav','8800988009','1000100',2000);
INSERT INTO student (student_id, first_name,last_name,student_name,mother_name,father_name,phone,aadhar,department_id)
VALUES (27, 'Sagar','Jolly','Sagar Jolly','Sameera','Sameer','8800788007','1000100',3000);
--addresses
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (26001,'Current',26,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (27001,'Current',27,'India','Bangalore','560999','5F - Walmart, Cessna Business Park');
--shivangi 26 semesters
INSERT INTO semester (semester_id, semester_number,student_id) VALUES (26001,1,26);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (26002,2,26);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (26003,3,26);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (26004,4,26);
--sagar 27 semesters
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (27001,1,27);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (27002,2,27);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (27003,3,27);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (27004,4,27);
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
--shivangi (26) marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2001026,26001, 2001,100,86,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2002026,26001, 2002,100,81,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2003026,26002, 2003,100,89,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2004026,26002, 2004,100,87,7);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2005026,26003, 2005,100,87,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2006026,26003, 2006,100,89,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2007026,26004, 2007,100,99,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (2008026,26004, 2008,100,74,6);
--sagar (27) marks
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3001027,27001, 3001,100,95,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3002027,27001, 3002,100,96,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3003027,27002, 3003,100,100,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3004027,27002, 3004,100,89,9);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3005027,27003, 3005,100,86,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3006027,27003, 3006,100,100,10);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3007027,27004, 3007,100,88,8);
INSERT INTO marks (marks_id, semester_id, course_id, total_marks,student_marks,grade) VALUES (3008027,27004, 3008,100,79,7);







