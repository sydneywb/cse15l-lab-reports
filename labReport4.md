# Lab Report 4 - Vim (Week 7)
Sydney Badescu

TODO: format nicely and periodically write summaries

![ssh_to_ieng6](labReport4images/ssh_to_ieng6.png)

s s h <space> c <tab>
fills in my account name so that command line says "ssh cs15lfa23hn@ieng6.ucsd.edu"
<enter>

g i t <space> c l o n e <space>
then I copied the SSH URL to the lab7 repository to by clipboard and pasted it in
the command line using Command+V
<enter>

c d <space> l <tab> <enter>
f i n d <space> l i b <enter>

j a v a c <space> - c p <space> . :
I used my trackpad to select "lib/hamcrest-core-1.3.jar" from the previous "find lib" command.
Then I pressed Command+C to copy the path to my clipboard. Next I clicked back at the current command line and pressed Command+V to paste.

<space> * . j a v a <enter>
to compile the .java files

<up arrow> <ctrl+A> <option + right arrow> <backspace> <ctrl+E>
<backspace> <backspace> <backspace> <backspace> <backspace> <backspace>
o r g . j u n i t . r u n n e r . J U n i t C o r e
<space> L <tab> T <tab> <backspace> <enter>


vim L <tab> . <tab> <enter>
3j
4l
i <backspace> 2
esc
:wq

<up arrow> <up arrow> <up arrow> <enter>
to compile again

<up arrow> <up arrow> <up arrow> <enter>
to run again

git add L <tab> <enter>
git commit -m "changed index1 to index2"
git push

