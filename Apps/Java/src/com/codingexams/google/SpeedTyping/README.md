<h3>Problem: Speed Typing </h3>

Problem
Barbara is a speed typer. In order to check her typing speed, she performs a speed test. 
She is given a string I that she is supposed to type.
While Barbara is typing, she may make some mistakes, such as pressing the wrong key. 
As her typing speed is important to her, she does not want to spend additional time correcting the mistakes,
so she continues to type with the errors until she finishes the speed test.
After she finishes the speed test, she produces a P.
Now she wonders how many extra letters she needs to delete in order to get I from P.
It is possible that Barbara made a mistake and P cannot be converted back to I just by deleting some letters.
In particular, it is possible that Barbara missed some letters.
Help Barbara find out how many extra letters she needs to remove in order to obtain I or 
if I cannot be obtained from P by removing letters then output IMPOSSIBLE.


Input:

      The first line of the input gives the number of test cases, T. T test cases follow.
      Each test case has 2 lines. The first line of each test case is an input string I 
      (that denotes the string that the typing test has provided). 
      The next line is the produced string P (that Barbara has entered).


    2
    aaaa
    aaaaa
    bbbbb
    bbbbc

    2
    Ilovecoding
    IIllovecoding
    KickstartIsFun
    kkickstartiisfun

Output:

    For each test case, output one line containing Case #x: y,
    where x is the test case number (starting from 1) and y is the number of extra letters that need
    to be removed in order to obtain I. If it is not possible to obtain I then output IMPOSSIBLE as y.


    Case #1: 1
    Case #2: IMPOSSIBLE

    Case #1: 2
    Case #2: IMPOSSIBLE


  
