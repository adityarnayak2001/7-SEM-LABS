student = LOAD 'input.txt' USING PigStorage(',') as (id:int, firstname:chararray,
lastname:chararray, age:int, phone:chararray, city:chararray);
group_data = GROUP student by age;
Dump group_data;
