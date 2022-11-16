cust1 = LOAD 'input.txt' USING PigStorage(',') as (id:int, firstname:chararray,
lastname:chararray, phone:chararray, city:chararray);
cust2 = LOAD 'input1.txt' USING PigStorage(',') as (id:int, firstname:chararray,
lastname:chararray, phone:chararray, city:chararray);
cust = UNION cust1, cust2;
Dump cust;
