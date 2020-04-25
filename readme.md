# Questions for Class-Based Assignment #5

## What COMPONENTS were added to the PANEL in FilledFrameViewer?

A button reading "Click Me" and the text "Hello, World!"

## How was the PANEL added to the FRAME?

First, the individual components were created using their respective constructor classes.  (We don't actually *see* the constructor classes, but we know that's what's being used.)  Next, a `JPanel` object is created.  This object, referenced as `panel` has an `.add()` method to which the components are passed as arguments.  Finally, the panel itself is added to the frame using its own `add()` method.  This method is not called with a `.` because we're already inside the object that's calling it.

## Change the text on the button and the label

Changed both, as well as the Frame Title to their translations in French.  I was surprised to find that it supports a non-ASCII character!

## Explain why the second strategy (`section_1_3`) might be better.

If I had to explain in one word: Modularization.  `section_1_2` accomplishes everything in a single Java class, whereas `section_1_3` separates concerns into two different classes.  The `FilledFrame` class populates the frame and performs all the functionality specific to that frame.  The `FilledFrameViewer2` class displays the frame and handles the things that would need to be done for *any* frame.  This means that if a different frame with different contents or functionality is needed, the programmer can simply reuse the `FilledFrameViewer2` class as is, and create a new `FilledFrame` class with the new requirements.  This saves work.  

It can also help in debugging, as problems in a reused class will be apparent everywhere it's used, whereas problems in a class used only once will only show up once.  This immediately gives the programmer a hint as to where the problem is.  And in debugging, knowing *where* the problem is is about 97% of solving it.