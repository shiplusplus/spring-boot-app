INSERT INTO department (department_id, department_name) VALUES (1, 'CS');
INSERT INTO department (department_id, department_name) VALUES (2, 'EEE');
INSERT INTO department (department_id, department_name) VALUES (3, 'Chemical');


INSERT INTO student (student_id, student_name, department_id) VALUES (1000, 'Shivangi', 2);
INSERT INTO student (student_id, student_name, department_id) VALUES (2000, 'Sagar', 3);
INSERT INTO student (student_id, student_name, department_id) VALUES (3000, 'Rajeev', 1);
INSERT INTO student (student_id, student_name, department_id) VALUES (4000, 'Pooja', 1);

INSERT INTO course (course_id, course_name, credits, department_id) VALUES (1, 'OOP', 4, 1);
INSERT INTO course (course_id, course_name, credits, department_id) VALUES (2, 'DSA', 4, 1);
INSERT INTO course (course_id, course_name, credits, department_id) VALUES (3, 'Control Systems', 3, 2);
INSERT INTO course (course_id, course_name, credits, department_id) VALUES (4, 'Microprocessors', 4, 2);
INSERT INTO course (course_id, course_name, credits, department_id) VALUES (5, 'Thermodynamics', 3, 3);
INSERT INTO course (course_id, course_name, credits, department_id) VALUES (6, 'Separation Processes', 3, 3);

INSERT INTO semester (semester_id, department_id) VALUES (1, 1);
