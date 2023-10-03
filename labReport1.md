# Lab Report 1:

All of the following commands were run in the Edstem terminal after the Github repository at [Link] (https://github.com/ucsd-cse15l-f23/lecture1) was downloaded to the workspace. For all commands, I started with the working directory **/home/lecture1**.

## Command 1: `cd`

1. *No* arguments
```
[user@sahara ~/lecture1]$ cd
[user@sahara ~]$
```
The cd command with no arguments causes the working directory to change to /home (or whatever the default working directory is when you first open the terminal) regardless of what the current working directory is. This is indicated by how the terminal prompt changed from [user@sahara ~/lecture1]$ (to indicate the working directory is the lecture1 file) to [user@sahara ~]$ (to indicate the working directory is /home). If I had started with the working directory /home/lecture1/messages and run the cd command with no arguments, it would still change the working directory to /home. The output is not an error.

2. Path to a *directory* as an argument
```
[user@sahara ~/lecture1]$ cd messages
[user@sahara ~/lecture1/messages]$ 
```
Since in this filesystem there is the "messages" folder inside the lecture1 folder, the cd command with a path to a directory (in this case, the messages folder) changes the current directory to be /home/lecture1/messages. This is because if the argument after the cd command is a relative path to a directory, the working directory changes to that relative path starting from the current working directory. The output is not an error.

3. Path to a *file* as an argument
```
[user@sahara ~/lecture1]$ cd messages/en-us.txt
bash: cd: messages/en-us.txt: Not a directory
[user@sahara ~/lecture1]$
```
The cd command with a path to a file produces an error saying that the given command line argument was not a directory. This is because messages/en-us.txt is the relative path to a text file (in this filesystem, the en-us.txt file is inside the messages folder), but the cd command stands for "change directory" and therefore wants the following command line argument to be a directory.

## Command 2: `ls`

1. *No* arguments
```
[user@sahara ~/lecture1]$ ls
Hello.class Hello.java messages README
[user@sahara ~/lecture1]$
```
The ls command lists the files and folders in the working directory. Since the messages folder and the Hello.class, Hello.java, and README files are in the lecture1 folder in this filesystem, they are printed in the output. The output is not an error.

2. Path to a *directory* as an argument
```
[user@sahara ~/lecture1]$ ls messages
en-us.txt es-mx.txt fi.txt zh-cn.txt
[user@sahara ~/lecture1]$
```
The ls command can also take a directory as a command line argument and list the files and folders in that given folder. In this filesystem, there are four text files in the messages folder called en-us.txt, es-mx.txt, fi.txt, and zh-cn.txt, so they are printed in the output. The output is not an error.

3. Path to a *file* as an argument
```
[user@sahara ~/lecture1]$ ls messages/en-us.txt
messages/en-us.txt
[user@sahara ~/lecture1]$
```
The ls command followed by a path to a file prints the relative path to that file from the working directory. Furthermore, no other files are listed, and the current working directory stays the same. The output is not an error.

## Command 3: `cat`

1. *No* arguments
```
[user@sahara ~/lecture1]$ cat

```
When the cat command is not given a command line argument, it reads from the standard input, which means that it will print any text you type into the terminal until it receives the cancel (ctrl+C) or end-of-file (ctrl+D) signals. For example, if I run cat with no arguments then type "dog" into the terminal and press enter, the terminal prints "dog" again and waits for the next input. The output is not an error.

2. Path to a *directory* as an argument
```
[user@sahara ~/lecture1]$ cat messages
cat: messages: Is a directory
[user@sahara ~/lecture1]$
```
The cat command with the path to a directory as an argument produces an error because the cat command is used to print the contents of one or more files to the standard output, not the file/folder names within a directory. Therefore, it expects to receive one or more file names as arguments, not a directory.

3. Path to a *file* as an argument
```
[user@sahara ~/lecture1]$ cat messages/en-us.txt
Hello World!
[user@sahara ~/lecture1]$
```
When the cat command is given the path to a file as an argument, it prints the contents of that file, whether it's text from a txt file, lines of code from a java file, or the contents of any other file type. In this filesystem, there is a "en-us.txt" file inside the "messages" folder which is inside the "lecture1" folder. The en-us.txt file contains the text "Hello World!", so the cat command prints this text to standard output. The cat command stands for concatenation, which means to attach one thing to the end of another. Therefore, we can write multiple file paths separated by spaces after the cat command to print the contents of each of the files one after the other. The output is not an error.
