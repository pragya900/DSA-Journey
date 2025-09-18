# Write your MySQL queryrecordDate 
SELECT w1.id
from Weather w1
inner join weather w2
where DATEDIFF(w1.recorddate, w2.recorddate)=1 
and 
w1.temperature > w2.temperature;