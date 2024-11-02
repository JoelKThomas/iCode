<h3>Problem: Beautiful numbers </h3>

You are given a straight line starting at 0 to 10^9. You start at zero and there are n tasks you can perform. the ith task is located at point 'i' in the line and requires 't' time to be performed. To perform the task you need to reach the point 'i' and spend 't' time at that location. e.g (5,8) lies at 5 so travel distance is 5 and work effort is 8.
Total effort is calculated as travel distance + time required to complete the work.

It takes one sec to travel one unit of the path.

Now we are given total of T seconds and we need to complete as many tasks as possible and reach back to starting position
Find the max number of tasks that you can finish in time T.

**Input**

3 16 -> 3 tasks and 16 units of total time
2 8 -> task 1 at position 2 in line and takes 8 sec to complete
4 5 -> task 2 at position 4 in line and takes 5 sec to complete
5 1 -> task 3 at position 5 in line and takes 1 sec to complete

**Output**
2

**Explanation **:
If we take task 1 at location 2 which requires 8 sec then getting to location 2 takes 2s and completing the task takes 8s leaving us with only 6s which is not enough for completing another task

On the other hand skipping, the first tasks leave us enough time to complete the other two tasks.
