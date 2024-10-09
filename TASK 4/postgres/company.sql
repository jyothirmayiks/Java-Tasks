CREATE TABLE employees (
    Employee_id INT PRIMARY KEY,
    name TEXT,
    position TEXT,
	salary NUMERIC
);

CREATE TABLE departments (
    id SERIAL PRIMARY KEY,
    name TEXT,
	head TEXT
);



CREATE TABLE projects (
    id SERIAL PRIMARY KEY,
    project_name TEXT,
    department_id INTEGER,
	status TEXT
);

INSERT INTO employees (Employee_id, name, position,salary) 
VALUES 
(1627,'Alice', 'Manager','90000'),
(435,'Bob', 'Developer','65000'),
(267,'Catherine', 'Analyst','60000'),
(5980,'David', 'Designer','70000'),
(2256,'Grace', 'Sales Representative','45000');

INSERT INTO departments (name,head) VALUES 
('HR','Alice'),
('IT','George'),
('Finance','Ann'),
('Marketing','Katy'),
('Sales','Mark');

INSERT INTO projects (project_name, department_id,status) VALUES 
('Project A', 2,'In-Progress'),
('Project B', 2,'Not started'),
('Project G', 3,'Not started'),
('Project D', 4,'Completed'),
('Project E', 5,'Completed');
