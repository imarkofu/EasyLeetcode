-- 175-组合两个表
select FirstName,LastName,City,State from Person p left join Address a on p.PersonId=a.PersonId;

-- 176-第二高的薪水
select max(Salary) SecondHighestSalary from Employee where Salary<(select max(Salary) from Employee);

-- 196-删除重复的电子邮箱
delete p1.* from Person p1,Person p2 where p1.Email=p2.Email and p1.Id>p2.Id

-- 197-上升得温度
SELECT b.Id FROM Weather a,Weather b WHERE a.Temperature < b.Temperature and DATEDIFF(a.RecordDate,b.RecordDate) = -1;