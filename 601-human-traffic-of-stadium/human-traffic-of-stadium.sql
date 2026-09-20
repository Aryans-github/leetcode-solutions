# Write your MySQL query statement below
With cDates as (
    Select id,visit_date,people,
    Lead(people,1) over(
        order by id 
    ) as next1,
    Lead(people,2) over(
        order by id 
    ) as next2,
    Lag(people,1) over(
        order by id 
    ) as prev1,
    Lag(people,2) over(
        order by id 
    ) as prev2
    from Stadium
)
SELECT
    id,
    visit_date,
    people
FROM cDates
WHERE
(
        people >= 100
        AND next1 >= 100
        AND next2 >= 100
    )
    OR
    (
        prev1 >= 100
        AND people >= 100
        AND next1 >= 100
    )
    OR
    (
        prev2 >= 100
        AND prev1 >= 100
        AND people >= 100
    )
ORDER BY visit_date;