# rollingDiceProject
Create a project that simulates rolling dice. Normal dice have 6 sides, and are frequently rolled in pairs, so 2 dice with 6 sides – results can range from 2 to 12. For this project, the user will specify the number of sides on a die, how many dice, and how many times to roll those dice. Create an array to count how many times each possible result was rolled. In the normal 2 dice of 6 sides, the array would need to count how many times a total of 2 was rolled, how many times a total of 3 was rolled, how many times a total of 4 was rolled, etc.  Display the results. The book discussed displaying the results in a histogram, and that project is a good one to start your algorithm, but instead of using a histogram, display the counts for each result. In addition, as you go through the array to display the number of times each result was rolled, add up those values to verify that the total does indeed match the number of rolls requested by the user. This is a good error-checking technique, to help find out if you are off by one or small amounts in your algorithm. Remember that the first position in an array is position 0. If you want to keep track of 12 cells, you can use an array with length of 13 and use cells numbered 2 – 12 for results of 2 – 12, or you can use an array with length of 12 and use cells numbered 1 – 11 for results of 2 – 12 (offset the value by one). Be sure to calculate how many cells you need in the array based on the number of dice and the number of sides on each die.  In real life, if you roll 2 dice with 6 sides each, the possible outcomes range from 2 (rolled a 1 on each die) to 12 (rolled a 6 on each die). You might think you can create a single random number between 2 and 12 to simulate that outcome, but that would not simulate real life. If you roll one die, you have a 1 in 6 chance of getting any of the 6 choices. If you roll two die, there is only one way to get a 2 – both dice are 1. But there are multiple ways to get a 7: 1 + 6, 2 + 5, 3 + 4, 4 + 3, 5 + 2, 6 + 1. So the chances of rolling a 7 are 6 times greater than the chance of rolling a 2. The more dice, the more likely it is to get numbers in the middle of the range.  To simulate this real-life scenario, you need to “roll” each die separately and add the results together. If you are rolling 5 dice, then you need to “roll” a die 5 times. Then add each of those results to come up with the total for those 5 dice. Look at the sample session above – the numbers 10 through 14 have higher results than the rest of the range. Your results should have a similar distribution of results.  Take a screenshot of the execution of your program. The numbers won’t match those in the sample session because of the use of random numbers in the program, but the overall look needs to match.     Submission: the specified screenshots, and the root folder for the project     Pay careful attention to the rubric for this assignment. Remember the standards that apply to every project.  Note that you must use correct formatting in the code -- appropriate indentation is most important. You can use Shift-Alt-F to have NetBeans automatically format the code correctly. If the formatting is incorrect, it will be returned to you for changes with a grade of zero.  Note: You need to submit the whole project for these assignments. In File Explorer, go to the location where you created the project. There will be a folder with the name of your project -- that is the root folder of the project.  If you submit the root folder of the project, the instructor can run it on a different machine to grade it. If you don't submit the proper folder, it won't run on another machine, and the assignment will be marked with a zero.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
