# Write your MySQL query statement below
Select s.student_id,s.student_name,sb.subject_name,Count(e.subject_name) as attended_exams
from Students s Cross Join Subjects sb Left Join Examinations e 
on s.student_id=e.student_id 
And  e.subject_name=sb.subject_name
group by s.student_id,s.student_name,sb.subject_name
order by s.student_id asc,sb.subject_name asc;