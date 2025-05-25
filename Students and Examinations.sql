# Write your MySQL query statement below
SELECT stud.student_id,
       stud.student_name,
       subj.subject_name, 
       count(exam.subject_name) AS attended_exams
  FROM Students stud
      CROSS JOIN Subjects subj
      LEFT JOIN Examinations exam
          ON stud.student_id = exam.student_id
         AND subj.subject_name = exam.subject_name
 GROUP BY stud.student_id,
          stud.student_name,
          subj.subject_name
 ORDER BY stud.student_id,
          subj.subject_name;



=========================================================
# Write your MySQL query statement below
select s.student_id,s.student_name,s3.subject_name,count(e.student_id) as attended_exams from
students s 
cross join subjects s3
left join examinations e on e.student_id=s.student_id
and e.subject_name=s3.subject_name
group by 1,2,3 order by 1;
