# Lab Report 1:

All of the following commands were run in the Edstem terminal after the Github repository at [link] (https://github.com/ucsd-cse15l-f23/lecture1) was downloaded to the workspace. For all three commands, I started with the working directory **/home/lecture1**.

## Command 1: `cd`

1. *No* arguments
```
[user@sahara ~/lecture1]$ cd
[user@sahara ~]$
```
The cd command with no arguments causes the working directory to change to /home, regardless of what the current working directory is. For example, if I had started with the working directory /home/lecture1/messages and run the `cd` command with no arguments,
it would still change the working directory to /home. The output is not an error.
2. Path to a *directory* as an argument
```
[user@sahara ~/lecture1]$ cd messages
[user@sahara ~/lecture1/messages]$ 
```
The cd command with a path to a directory--the messages folder, in this case--changes the current directory to be /home/lecture1/messages. This is because if the argument after the `cd` command is a relative path, the working directory becomes that relative path
starting from the current working directory. The output is not an error.
3. Path to a *file* as an argument
```
[user@sahara ~/lecture1]$ cd messages/en-us.txt
bash: cd: messages/en-us.txt: Not a directory
```
The cd command with a path to a file produces an error saying that it was 

`ls`

1. b
2. b
3. b

`cat`

1. b
2. b
3. b
