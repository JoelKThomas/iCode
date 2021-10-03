 <h3>Problem: Alphanumeric Combinations </h3>

John is teaching his son Rob English alphabet and number counting.
He represents 'a' as the 1st character, 'b' as the 2nd character up to 'z' as the 26th character.
John says 'kite' can be represented as '119205'. The 11th character is 'k', 9th character is 'i',
20th character is 't' and 5th character is 'e'.

Rob being smarter than him, says '119205' can also mean 
'aaite' (1)(1)(9)(20)(5),
'aste'(1) (19)(20)(5), etc. 

Now being enthusiastic about it, John wants to know given a string of length in containing digits from 0 to 9, 
how many such words are possible.

**Input Format**

You are given a string S containing characters from 0-9. 
You have to find how many such words are possible for that given number sequence.

* The string will not begin with a '0'.

* 1<-length(S)<=250

**Output Format**

A single integer returning the number of words. If there are no possible combinations output will be 0.

**Sample Test Case 1**

    Input: 2112
    Output: 5

Explanation:

2112 can be represented as:

(2)(1)(1)(2) is represented as baab  
(2)(1)(12) is represented as bal   
(2)(11)(2) is represented as bkb    
(21)(1)(2) is represented as uab  
(21)(12) is represented as ul  

Therefore, the answer in this case is 5.  

Sample Test Case 2

    Input: 2101
    
    Output: 1.

Note: 01, 001, 0001 is not valid
