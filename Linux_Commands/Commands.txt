#! /bin/bash

mkdir Prattay #directory creation

rmdir Prattay #Remove directory

mkdir Linux_Commands

cat > abc.txt #creates a file abc and 
              #and inputs its contents

cat abc.txt #shows the content of file abc.txt

cat >> abc.txt #appends the input contents to abc.txt file

touch xyz.txt #creates an empty content file if it doesnot exists

cp abc.txt xyz.txt # copies the contents of abc to xyz

mv xyz.txt pqr.txt # renames the file

pwd #current working directory path

who #prints information about who are logged in

whoami #prints the username associated with the current ID

date #display current system date

man printf #manual for printf

tree # displays the directory ,files in the current directory

#"sudo apt-get install tree" first to make use of this command

ls #list of information of the files in the directory

ls -l #detailed information of the files

wc abc.txt #displays line count ,word count,character count

ls | wc -l #display the count number of those files

x = 8 #assign 8 to variable x

echo $x #displays the value in variable x

echo "hello world" #displays the content of the string

