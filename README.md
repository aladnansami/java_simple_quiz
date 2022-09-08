# java_simple_quiz
Create a quiz program that will take questions, option and answer from admin user and save it to the question bank. Then if any user want to give the quiz, random 5 questions will be shown to the user from the question bank. <br>
Program output:<br>
1. Add Quiz<br>
2. Start Quiz<br>

if user select option 1, then system will tell user to input a question, 4 options and correct ans to save data in a quiz bank. The quiz bank will be a json file. For an example,<br>

System>Please add a ques here:<br>
User>Which testing is done by developer?<br>
System>Input options.<br>
Option a:
User> Unit Testing<br>
Option b:<br>

User> Integration Testing<br>
Option c:<br>

User> Sanity Testing<br>
Option d:<br>

User> Regression Testing<br>
System> Please input the correct ans<br>
User> a<br>
System: Quiz saved at the database. Do you want to add more? (y/n)<br>
if user press y, then the previous scenario will happen again otherwise the program will be closed.<br>

If user select option 2,  then,<br>
System> You will be asked 5 questions, each questions has 1 marks<br>
<b>1. Which testing is done by developer?</b><br>
a. Unit Testing<br>
b. Integration Testing<br>
c. Sanity Testing<br>
d. Regression Testing<br>
User> a<br>
System> Correct!<br>
else not correct,<br>
System: Not correct<br>
<br>

Finally 5 different random questions will appear from your question database. At least add 20 questions from any category from testing.
Result: You got [correct_marks] out of 5<br>


JSON Format:<br>
[<br>
{<br>
<b>"Question":"Which testing is done by developer?",</b><br>
"option a":"Unit Testing",<br>
"Option b":"Integration Testing",<br>
"Sanity Testing":"Sanity Testing",<br>
"Option d":"Regression Testing",<br>
"answer":"a"<br>
},<br>
{<br>
<b>"Question":"Which is functional testing?",</b><br>
"option a":"Load Testing",<br>
"Option b":"Security Testing",<br>
"Sanity Testing":"Gorilla Testing",<br>
"Option d":"Benchmark Testing",<br>
"answer":"c"<br>
}<br>
]<br>

# Quiz Process Demo Video
## Click Here
|<br>
|<br>
v<br>

[![Watch the video](https://github.com/aladnansami/java_simple_quiz/blob/main/image%20intrlji.png))](https://screenrec.com/share/8bNaq0UCYf)


