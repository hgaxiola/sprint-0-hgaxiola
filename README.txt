Project name: Sprint 0
Team members and contributions (include cs logins):
hlee171 and one other person in collab section who had to leave very
early

Include the total estimated time it took to complete project
Anywhere between 10-12 hours

A link to your repo
https://github.com/hgaxiola

Design choices -- high level design of your program
csvParser - parses CSV files
creator - this implements CreatorFromRow and turns a list of strings
representing a row, and returns a row object which contains the fields
we will be working with
FileAdder- this adds up all of our rows, characters, and words
RowObject- this is the object containing the fields we are working with.
The purpose of the row object was to that represented a row. With this
representation, it was easier to visually see how the rest of the
aspects would interact with each other. In a row, you can count each of
the characters, columns, and words. With iterations, one can then do this
for all and any files.
This, in conclusion, makes it more user friendly.

Explain the relationships between classes/interfaces.
Discuss any specific data structures you used, why you created it, and
other high level explanations.
Runtime/ space optimizations you made (if applicable).

csvParser - parses CSV files
creator - this implements CreatorFromRow and turns a list of strings
representing a row, and returns a row object which contains the fields
we will be working with
FileAdder- this adds up all of our rows, characters, and words
RowObject- this is the object containing the fields we are working with

Errors/Bugs -- Write reproduction steps for all the bugs in your
program. If the mentor TA finds an error and knows how to reproduce it,
they will be able to leave better feedback. If the mentor TA finds
the bug without proper documentation, they will assume you did not
test your program properly.
Explanations for checkstyle errors (hopefully none)



Tests -- Explain the testing suites that you implemented for your
program and how each test ensures that a part of the program works.
I am having a terrible error that I could not solve in time because
I was already behind and taking a late day. I could not run any tests,
so I do not have any tests to show. I can explain my situation in more
detail if necessary.
