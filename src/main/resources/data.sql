
INSERT INTO department (department_id, department_name) VALUES (1000, 'CS');


INSERT INTO student (student_id, student_name,department_id) VALUES (26, 'Shivangi',1000);
INSERT INTO student (student_id, student_name,department_id) VALUES (27, 'Sagar',1000);

INSERT INTO address (address_id,address_name,student_id,country,city,pincode,address_line)
VALUES (26001,'Current',26,'india','bangalore','560999','walmart tech');

INSERT INTO semester (semester_id, semester_number,student_id) VALUES (26005,5,0026);
INSERT INTO semester (semester_id, semester_number, student_id) VALUES (26006,6,0026);

INSERT INTO course (course_id, course_name, credits) VALUES (101, 'OOP', 4);
INSERT INTO course (course_id, course_name, credits) VALUES (102, 'DSA', 4);
INSERT INTO course (course_id, course_name, credits) VALUES (103, 'DBMS', 4);

INSERT INTO marks (marks_id, semester_id, course_id, grade) VALUES (1,26005, 101,9);
INSERT INTO marks (marks_id, semester_id, course_id, grade) VALUES (2,26005, 102,9);
INSERT INTO marks (marks_id, semester_id, course_id, grade) VALUES (4,26006, 103,9);








