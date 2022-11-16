student = LOAD 'input.txt' USING PigStorage(',') as (id:int, firstname:chararray,
lastname:chararray, age:int, phone:chararray, city:chararray);
student_order = ORDER student BY age DESC;
Dump student_order;
