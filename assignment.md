# Activity : Creating a simple Frame

## Objective

* Understand how to create a simple frame

## Instructions

* Under **Files/Source code** find the zip file for chapter 10
* **Download**
* **unzip**
* Drag `ch10` folder into a Java project
* Find the `EmptyFrameViewer.java` source under `section_1_1` and test it out
  * as always, you probably will have to change the package name   
* **Change title** to “My Empty Frame” and test. 
* Now you’ll have all source examples for the chapter!

# Activity : Adding Components

## Objective
* Understand the concept of adding COMPONENTS to a PANEL (which then is added to a FRAME). 

## Questions
* What COMPONENTS were added to the PANEL in FilledFrameViewer?

A button reading "Click Me" and the text "Hello, World!"

* How was the PANEL added to the FRAME?

## Hands-on
* Run FilledFrameViewer as-is (`ch10/section_1_2`) 
  * You should have downloaded all source code for ch10 last time
* Change the text on the button and the label

Changed both, as well as the Frame Title to their translations in French.  I was surprised to find that it supports a non-ASCII character.

# Activity : Inheritance for Customized Frames

##Objective
* Understand how to create a customized frame with components

##Instructions
* Compare source code for FilledFrameViewer  (`ch10/section_1_2`) with source code for FilledFrameViewer2 and FilledFrame (`ch10/section_1_3`)
  * See if you can articulate the difference between the two strategies (`section_1_2` and `section_1_3`)
  * Explain why the second strategy (`section_1_3`) might be better.

If I had to explain in one word: Modularization.  `section_1_2` accomplishes everything in a single Java class, whereas `section_1_3` separates concerns into two different classes.  The `FilledFrame` class populates the frame and performs all the functionality specific to that frame.  The `FilledFrameViewer2` class displays the frame and handles the things that would need to be done for *any* frame.  This means that if a different frame with different contents or functionality is needed, the programmer can simply reuse the `FilledFrameViewer2` class as is, and create a new `FilledFrame` class with the new requirements.  This saves work.  

It can also help in debugging, as problems in a reused class will be apparent everywhere it's used, whereas problems in a class used only once will only show up once.  This immediately gives the programmer a hint as to where the problem is.  And in debugging, knowing *where* the problem is is about 97% of solving it.