 <h3>Problem: Password Validity with Error code </h3>

Provide a function with checks the password validity based on validation criteria. Return
Error Code 0, if passowrd is valid. Return specific error code if validation fails.
Validation criteria and Error code. Check for validity in the order below and return error
code on first intance of failure.
1. Min length - 8, Max length - 31 [Error code 10]
2. Password should be alpha numeric (alpabetics and atleast one numeral 0-9) [Error
   code 20]
3. Atleast one special char from a set # $ @ % & _ [Error code 30]
4. No simultaneous repetition of any char (e.g. Password@12 is not valid, but
   Pasword@12 is valid) [Error code 40]
   
<h3>Sample Input</h3>
    
    Password@123

<h3>Sample Output</h3>

     40
