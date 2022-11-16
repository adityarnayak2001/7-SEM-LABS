student_details = LOAD '/home/lab2/1MS19CS006/week3/stud_filter/input.txt' USING
PigStorage(',') as (id:int, firstname:chararray, lastname:chararray, age:int, phone:chararray,
city:chararray);
filter_data = FILTER student_details BY city == 'Chennai';
Dump filter_data;
